package com.study.base.objectoriented;

/**
 *  static关键字用来修饰属性、修饰方法、修饰类（内部类）
 *  静态方法区存储静态变量，类信息（方法）
 *  1.静态变量或方法不属于对象，依赖类
 *  2.静态变量是全局变量，生命周期从类加载后一直到程序结束
 *  3.静态变量只存在一份，在静态方法区中存储
 *  4.静态变量是本类所有对象共享一份
 *  5.建议不要使用对象名去调用静态数据，直接使用类名调用
 *  6.静态变量static修饰一个方法，那么该方法属于类，不属于对象，直接用类名调用
 *  7.静态方法不能访问非静态的数据
 */
public class StaticKeyword {
    public static void main(String[] args) {
       /* Role beibei = new Role("备备","蜀国");
        Role yunchang = new Role("云长","蜀国");
        Role fiefei = new Role("飞飞","蜀国");*/

        Role beibei = new Role("备备");
        Role yunchang = new Role("云长");
        Role fiefei = new Role("飞飞");

        System.out.println(beibei.getInfo());
        System.out.println(yunchang.getInfo());
        System.out.println(fiefei.getInfo());

        System.out.println(Role.country); //类名调用静态变量
    }
}

//角色
class Role{
    private String name;
    static String country ="蜀国"; //静态变量（全局变量）

    public Role(String name) {
        this.name = name;
    }
    public Role(String name, String country) {
        this.name = name;
        this.country = country;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //静态方法不能访问非静态的数据
   /* public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }*/
    public String getInfo(){
        return "name=" + name+ ",country =" +country;
    }
}

