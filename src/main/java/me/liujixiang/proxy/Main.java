package me.liujixiang.proxy;

import me.liujixiang.proxy.api.ProxyInterface;
import me.liujixiang.proxy.factory.ProxyFactory;
import me.liujixiang.proxy.parent.impl.ParentAImpl;
import me.liujixiang.proxy.parent.impl.ParentBImpl;

/**
 * @author jixiangup
 * @since 1.0.0
 */
public class Main {

    public static void main(String[] args) {
        ProxyInterface parentA = new ParentAImpl();

        ProxyInterface parentB = new ParentBImpl();

        ProxyInterface proxyA = ProxyFactory.getProxy(parentA);
        String zhuzhuxia = proxyA.invoke("猪猪侠");
        System.out.println("外部调用获取到的执行结果: " + zhuzhuxia);


//        ProxyInterface proxyB = ProxyFactory.getProxy(parentB);
//        System.out.println(proxyB);
    }

}
