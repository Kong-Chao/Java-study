package com.study.base.objectOriented;

/**
 *  继承：继承是从已有的类创建新的类的过程
 *  继承一个父类，只能继承非私有的数据（属性和方法）
 *  protected访问权限修饰符，在继承关系中使用，在父类中使用protected修饰符分属性或方法可以被子类继承
 *  创建子类对象时，父类 的构造方法也会被调用：子类在使用父类的数据，那么就要通过父类的构造方法来初始化数据，如果创建子类对象时使用默认的构造方法，那么父类的构造方法也会被调用
 *  如果创建子类时使用的是带参数的构造方法
 *  当父类中没有无参构造方法时，子类必须显示的调用调用父类的带参构造方法，通过Super调用父类的构造的方法
 *
 *  开发原则：高内聚，低耦合
 *
 *  方法重写：发生在子类继承中，方法名相同，参数列表相同，子类的访问修饰符要大于或等于父类的访问修饰符，子类的异常声明必须小于或等于父类的异常声明。如果方法被private、static、final修饰，那么不能被重写
 *  方法重载（overloading）：发生在同一个类中，方法名相同，参数列表不同，返回值无关。
 *  区别：
 */
public class JiCheng {
    public static void main(String[] args) {
        HomeDog homeDog = new HomeDog("灰灰");
        homeDog.print();
        homeDog.eat();

        HuskyDog hd =new HuskyDog();
        hd.eat();
    }
}

class Dog1{ //父类
    protected String name;
    private String sex;
    public Dog1(String name,String sex){
        this.name =name;
        this.sex = sex;
        System.out.println("Dog1狗的构造方法");
    }
    protected void eat(){
        System.out.println("吃饭");
    }
}

class HomeDog extends Dog1{
    public HomeDog(String name){
        super(name,"公");  //只能在构造方法的第一句
        this.name = name;
        System.out.println(name+ "HomeDog狗的构造方法");
    }
    protected void print(){
        //super.属性 表示调用的父类的属性，如果是继承过来的属性，那么super可以省略
        System.out.println(name +",这是一只家狗，wangwang");
    }

    //重写父类的方法
    public void eat(){
        super.eat(); //调用父类的方法
        System.out.println("家狗喜欢吃骨头");
    }
}

class HuskyDog extends Dog1{
    public HuskyDog(){
        super("哈士奇","母的");
        System.out.println("HuskyDog的构造方法");
    }
    private void show(){
        System.out.println("Husky狗");
    }
    public void eat(){
        System.out.println("Husky狗喜欢吃鸡腿");
    }
}
