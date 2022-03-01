package com.study.base.objectoriented;

/**
 * ——策略模式(开发常用)：定义一系列的算法，将每一种算法封装起来并可以相互替换使用，策略模式让算法独立于使用它的客户应用而独立变化
 */
public class Test62 {
    public static void main(String[] args) {
        BaseService user = new UserService();
        user.setISave(new NetSave());
        user.add("aaa");

        user.setISave(new FileSave());
        user.add("bbb");
    }
}
