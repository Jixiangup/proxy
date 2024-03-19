package me.liujixiang.proxy.parent;

import me.liujixiang.proxy.api.ProxyInterface;

/**
 * @author jixiangup
 * @since 1.0.0
 */
public class ParentB implements ProxyInterface {

    public String work(String username) {
        System.out.println("ParentB " + username + " 正在工作💼");
        return username + "结束了工作";
    }

    @Override
    public String invoke(String username) {
        return work(username);
    }
}
