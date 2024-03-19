package me.liujixiang.proxy.parent.impl;

import me.liujixiang.proxy.parent.ParentB;

/**
 * @author jixiangup
 * @since 1.0.0
 */
public class ParentBImpl extends ParentB {

    @Override
    public String work(String username) {
        System.out.println("ParentBImpl " + username + " 正在工作💼");
        return username + "结束了工作";
    }
}
