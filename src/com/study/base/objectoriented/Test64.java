package com.study.base.objectoriented;

/**
 *  简单工厂模式：是由一个工厂对象决定决定创建出哪一种产品类的实例。简单工厂模式是工厂模式家族中最简单实用的模式（
 *  通过工厂创建对象，不是直接创建对象）
 */
public class Test64 {
    public static void main(String[] args) {
        //使用着和被使用着两者之间，耦合，产生了依赖，当被使用者改变时，会影响使用着，使用工厂模式降低两者之间的关系
//        Product p = new phone();
       Product p = ProductFactory.getProduct("phone");
        p.work();
    }

    interface Product{
        public void work();
    }

    //工厂类
    public static class ProductFactory{
        public static Product getProduct(String name){
            if ("phone".equals(name)){
                return new phone();
            }else if ("computer".equals(name)){
                return new Computer();
            }else{
                return null;
            }
        }
    }

    static class phone implements Product{

        @Override
        public void work() {
            System.out.println("手机开始工作。。。");
        }
    }

    static class Computer implements Product{

        @Override
        public void work() {
            System.out.println("电脑开始工作。。。");
        }
    }
}
