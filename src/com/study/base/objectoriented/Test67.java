package com.study.base.objectoriented;

/**
 *内部类
 *  1.成员内部类：直接在类中定义的类
 *  2.方法内部类：在一个类中的方法内定义一个类,
 *            方法内部类只能在定义该内部类的方法内实例化，不可以在此方法外对其实例化
 *          方法内部类不能使用该内部类坐在方法的非final局部变量
 *   3.静态内部类：该内部类可以像其他静态成员一样，没有外部类对象时，可以访问它。静态嵌套类仅能访问外部类的静态成员和方法。
 *   4.匿名内部类：就是没有名字的内部类。
 *         匿名内部类的三种情况：
 *         （1）继承式的匿名内部类
 *         （2）接口式的匿名内部类
 *         （3）参数式的匿名内部类
 *   使用匿名内部类时，需要注意法人原则：
 *   1.不能有构造方法，只能由一个实例。
 *   2.不能定义任何静态变量、静态方法
 *   3.不能是public、protected、private、static
 *   4.一定是在new后面，用其隐含实现一个接口或是继承一个类
 *   5.匿名内部类为局部的，所以局部内部类所有限制对其生效
 */
public class Test67 {
    public static void main(String[] args) {
        Outer outer = new Outer();
        //在外部创建成员内部类的实例，因为成员变量内部类需要依赖外部类的对象。
        //通常情况下，不建议这样实例化内部类对象
//        Outer.Inner inner =outer.new Inner();
//        inner.print();
        outer.innerPrint();
        outer.show();

        Outer.Inner3 inner3 = new Outer.Inner3();
        inner3.print();

        outer.print1();
        outer.print2();

        //参数式匿名内部类
        outer.print3(new Outer.Eat() {
            @Override
            public void eat() {
                System.out.println( "eat:参数式匿名内部类");
            }
        });

    }
}

class Outer {
    private static String name = "大白";

    /*********成员内部类*********/

    //建议在外部类中定义一个方法，对外提供一个访问内部类的接口
    public void innerPrint() {
        Inner inner = new Inner();
        inner.print();
    }

    //成员内部类
    class Inner {
        public void print() {
            System.out.println("inner");
        }
    }

    //方法内部类

    public void show() {
        class Inner2 {
            final int i = 20;

            public void print() {
                //i ++;  //从内部类引用的本地变量必须是最终变量或实际上的最终变量
                System.out.println("方法内部类" + i + name);
            }
        }

        Inner2 inner2 = new Inner2();
        inner2.print();

    }

    /*********静态内部类************/
//    无法从上下文中访问非静态变量，
    static class Inner3 {
        public void print() {
            System.out.println("静态内部类 " + "\n" + "aaaaa" + name);
        }
    }

    /**********匿名内部类********/
    //继承式
    public void print1() {
        Cat cat = new Cat() {
            @Override
            public void eat() {
                System.out.println("eat:继承式匿名内部类");
            }
        };
        cat.eat();
    }

    //接口式
    public void print2() {
        Eat eat = new Eat() {
            @Override
            public void eat() {
                System.out.println("eat:接口式匿名内部类");
            }
        };
        eat.eat();
    }

    //参数式
    public void print3(Eat eat) {
        eat.eat();
    }

    interface Eat{
        public void eat();
    }

    abstract class Cat {
        public abstract void eat();
    }
}
