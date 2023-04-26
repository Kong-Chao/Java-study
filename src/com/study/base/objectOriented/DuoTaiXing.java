package com.study.base.objectOriented;

/**
 * 多态性： 自动转型
 *         强制转型
 *    instanceof关键字用于检查对象是否为指定的对象，通常在把父类强制转换为子类引用时需要使用，避免发生转换类型异常
 *    父类的设计规则：
 *      1.通过instanceof关键字很方便检测对象的类型，但是一个父类的子类过多，这样的判断很麻烦
 *      2.父类通常情况下都设计为抽象类或接口，其中优先考虑接口，如接口的不能满足才考虑抽象类
 *      3.一个人具体的类尽可能不去继承另一个具体类，在这样的好处是无需检查对象是否为父类的对象
 */
public class DuoTaiXing {
    public static void main(String[] args) {
      /*  HomePig hp = new HomePig("家🐖");
        hp.eat();
        YePig yePig = new YePig("野🐖");
        yePig.eat();*/
        //用父类的引用指向子类对象（用大的类型来表示小的类型），自动转型（向上转型）
        Pig hp = new HomePig("家🐖");
//        hp.eat();
        Pig yePig = new YePig("野🐖");
//        yePig.eat();

//        hp = yePig;
//        hp.eat();
        eat(hp);
        eat(yePig);
        Pig hengPig = new HengHencePig("胖猪");
        eat(hengPig);
    }

    //抽象（粒度）面向抽象编程（面向接口编程）
    public static void eat(Pig p){
        System.out.println("🐖吃饭");
        p.eat();
        //当我们需要把父类反人实例强制转换为子类引用时，为了避免类型强制转换异常java.lang.classCastException
        //那么需要在转换之前做一个类型检查（判断）
        if (p instanceof HengHencePig){ //成立的条件是：对象本身以及对象的夫类型，都可以通过检查
            HengHencePig bb = (HengHencePig)p; //大的类型转换为小的类型，强制转换（向下转型）,类型不匹配容易出错
            bb.song();
        }

    }
}

//🐖
abstract class Pig{
    private String name;
    public Pig() {}
    public Pig(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public abstract void eat();
}

//家猪
class HomePig extends Pig{
    public HomePig(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.getName()+ ",吃菜");
    }
}

//野猪
class YePig extends Pig{
    public YePig(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.getName()+ ",吃苹果");
    }
}

 class HengHencePig extends Pig{
    public HengHencePig(String name) {
        super(name);
    }
    public void eat(){
        System.out.println(this.getName()+ ",挑食");
    }
    public void song(){
        System.out.println("唱歌");
    }
}
