package com.study.base.objectOriented;

/**
 *  构造方法：构造方法是在类中定义的，构造方法的定义格式：方法名称与类名称相同，无返回值类型的声明
 *  1.构造方法就是类构造对象时调用的方法，用于对象的初始化工作
 *  2.构造方法是实例一个类的对象时，也就是new 的时候 ，最先调用的方法
 *
 *  this 关键字： 调用本类中的属性
 *          调用类中的方法或构造方法
 *          表示当前对象，在方法被调用的过程中，哪个对象调用了方面，在方法里的this就表示谁
 *          类名.this
 */
public class GouZaoFangFa {
    public static void main(String[] args) {
 //       Dog dog =new Dog();
        Dog dog1 = new Dog("大白",18);
        dog1.eat();
    }
}

class Dog{
    //构造方法重载
    //默认构造方法
    public Dog(){
   //     System.out.println("无参构造方法执行");
    }
    public Dog(String name){
        this.name =name;
        System.out.println("一个参数构造方法执行");
    }
    public Dog(String name, int age){
        this(name); //调用其他构造方法时，此句需要在第一句，在构造方法相互调用时必须要有出口
    //    this.name = name;
        this.age =age;
        System.out.println("2个有参构造执行");
    }

    private String name;
    private  int age;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int  getAge(){
        return age;
    }

    public void eat(){
        //在方法中使用this调用类中的其他方法，this可以忽略,this前面可以用当前的类名
      //  System.out.println("我是：" + this.getName() +"今年：" + this.getAge()+ "岁,吃骨头");
        System.out.println("我是：" + Dog.this.getName() +"今年：" + Dog.this.getAge()+ "岁,吃骨头");
    }
}
