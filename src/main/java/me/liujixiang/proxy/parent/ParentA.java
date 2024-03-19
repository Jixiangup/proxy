package me.liujixiang.proxy.parent;

import me.liujixiang.proxy.api.ProxyInterface;

/**
 * @author jixiangup
 * @since 1.0.0
 */
public class ParentA implements ProxyInterface {

    public String sleep(String username) {
        System.out.println("ParentA " + username + " 正在睡觉😴");
        return username + "睡觉了";
    }

    @Override
    public String invoke(String username) {
        return sleep(username);
    }
}
