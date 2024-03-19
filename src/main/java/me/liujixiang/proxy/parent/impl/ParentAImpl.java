package me.liujixiang.proxy.parent.impl;

import me.liujixiang.proxy.parent.ParentA;

/**
 * @author jixiangup
 * @since 1.0.0
 */
public class ParentAImpl extends ParentA {

    @Override
    public String sleep(String username) {
        System.out.println("ParentAImpl " + username + " 正在睡觉😴");
        return username + "睡觉了";
    }
}
