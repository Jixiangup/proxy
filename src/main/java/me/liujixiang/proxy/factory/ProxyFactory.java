package me.liujixiang.proxy.factory;

import me.liujixiang.proxy.api.ProxyInterface;
import me.liujixiang.proxy.proxy.ProxyHandler;

import java.lang.reflect.Proxy;
import java.util.HashSet;
import java.util.Set;

/**
 * @author jixiangup
 * @since 1.0.0
 */
public class ProxyFactory {

    private static Set<Class<?>> getAllImplementedInterfaces(Class<?> clazz) {
        Set<Class<?>> interfaces = new HashSet<>();
        while (clazz != null) {
            // 添加当前类实现的接口
            for (Class<?> interfaceClass : clazz.getInterfaces()) {
                interfaces.add(interfaceClass);
                // 递归获取当前接口的父接口
                interfaces.addAll(getAllImplementedInterfaces(interfaceClass));
            }
            // 移动到父类继续搜索
            clazz = clazz.getSuperclass();
        }
        return interfaces;
    }

    private static Class<?>[] setToArray(Set<Class<?>> classes) {
        Class<?>[] classes1 = new Class<?>[classes.size()];
        int i = 0;
        for (Class<?> aClass : classes) {
            classes1[i] = aClass;
            i++;
        }
        return classes1;
    }

    public static ProxyInterface getProxy(ProxyInterface target) {
        Set<Class<?>> allImplementedInterfaces = getAllImplementedInterfaces(target.getClass());
        return (ProxyInterface) Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                setToArray(allImplementedInterfaces),
                new ProxyHandler(target)
        );
    }

}
