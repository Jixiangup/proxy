package me.liujixiang.proxy.proxy;

import me.liujixiang.proxy.api.ProxyInterface;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author jixiangup
 * @since 1.0.0
 */
public class ProxyHandler implements InvocationHandler {

    private ProxyInterface target;

    public ProxyHandler(ProxyInterface target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            System.out.println("方法执行之前");
            Object invokeResult = method.invoke(target, args);
            System.out.println("方法执行之后, 方法执行结果: " + invokeResult.toString());
            System.out.println("方法返回之前");
            return invokeResult;
        } catch (Exception e) {
            System.out.println("方法抛出异常");
            throw e;
        } finally {
            System.out.println("finally执行啦");
        }
    }
}
