package com.study.base.objectoriented;

/**
 * 接口:1.定义一个接口，使用interface关键字
 *      2.在一个接口中，只能定义常量、抽象方法，jdk1.8可以定义默认的实现方法
 *      3.接口可以多继承
 *      4.一个具体类实现接口使用implement关键字
 *      5.一个可以实现多个接口
 *      6.抽象类实现接口，可以不实现接口的方法
 *      7.在接口中定义的方法没有声明访问修饰符，默认为public
 *      8.接口不能有构造方法
 *      9.接口不能被实例化
 *
 */
public class JieKou {
    public static void main(String[] args) {
        Girl mm= new Girl("玛丽");
        mm.sleep();
        mm.eat();
        mm.run();
        mm.print();
    }
}

interface IEat{
  //  public abstract void move(); //接口只能定义抽象
  void eat();  //接口中定义的方法没有修饰符，默认为public abstract
  //  public static final int NUM = 10; 在接口中定义一个常量
  int NUM = 10;
  //jdk1.8后新特性可以被所有实现类继承
  public default void print(){
      System.out.println("eat");
  }
}

interface IRun extends IEat{
    void run();
}
//接口之间可以多继承（）
interface ISleep extends IEat,IRun{
    void sleep();
}

//具体类实现接口必须实现接口的所有方法
class  Girl implements ISleep,IEat{
    private String name;
    public Girl(String name){ //构造方法实现类的一个对象,相当于new
        this.name =name;
    }

    @Override
    public void sleep() {
        System.out.println("我爱睡觉");
    }

    @Override
    public void eat() {
        System.out.println("我是：" + name +",爱吃猪脚");
    }

    @Override
    public void run() {
        System.out.println("吃完爱跑步");
    }
}