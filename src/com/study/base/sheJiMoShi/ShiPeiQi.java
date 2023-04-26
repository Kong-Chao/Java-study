package com.study.base.sheJiMoShi;

/**
 * 设计原则：
 * 1.面向接口编程
 * 2.封装变化
 * 3.多用组合，少用继承
 * 4.对修改关闭，对扩展开放
 * 适配器模式：将一个类的接口转换成为客户希望的另外一个接口。适配器模式使得原本由于接口不兼容而不能在一起工作的那些类可以一起工作
 */
public class ShiPeiQi {

    public static void main(String[] args) {
        PowerA a = new PowerAImpl();
        work(a);

       PowerB b=  new PowerBImpl();
//        work(b);
        Adapter adapter = new Adapter(b);
        work(adapter);

    }

    public static void work(PowerA a){
        System.out.println("正在链接，，");
        a.insert();
        System.out.println("工作结束，，");
    }
}

//动物(案例)
interface Animal1{
    public void sing();
    public void cry();
    public void run();
    public void swim();
}

//适配器
abstract class AnimalFunction{
    public void sing(){};
    public void cry(){};
    public void run(){};
    public void swim(){};
}

class DogPet extends AnimalFunction {

    @Override
    public void run() {
        System.out.println("疯狗再跑");
    }
}

//适配器
class Adapter implements PowerA{

    private PowerB b;
    public Adapter(PowerB b){
        this.b = b;
    }

    @Override
    public void insert() {
        b.content();
    }
}

interface PowerB{
    public void content();
}
class PowerBImpl implements PowerB{
    @Override
    public void content() {
        System.out.println("电源B开始工作，，");
    }
}


interface PowerA{
    public void insert();
}

class PowerAImpl implements PowerA{

    @Override
    public void insert() {
        System.out.println("电源A开始工作了，，");
    }
}
