package com.study.base.objectoriented;

/**
 *  Object类：toString方法:
 *          equals方法：判定某个对象与此对象是否相等
 */
public class FuLeiObject {
    public static void main(String[] args) {
        Teacher t= new Teacher("大白",1,10);
        System.out.println(t);

        Teacher t2= new Teacher("大白",1,10);
        System.out.println(t.equals(t2));

        String str1 = new String("贝贝");
        String str2 = new String("贝贝");
        System.out.println(str1.equals(str2));
    }
}

class Teacher{
    private String name;
    private int sid;
    private int age;
    public Teacher() {
    }

    public Teacher(String name, int sid, int age) {
        this.name = name;
        this.sid = sid;
        this.age = age;
    }

    //重写Object类中的toString方法
    public String toString(){
        return "name:" + name+ ",sid:" + sid + ",age:" + age;
    }

    //重写Object类中的equals方法,比较两个对象是否相同
    public boolean equals(Object obj){
        if (this==obj){
            return true;
        }
        if (obj instanceof Teacher){
            Teacher t= (Teacher)obj;
            if (!this.name.equals(t.name)){
                return false;
            }
            if (this.sid != t.sid){
                return false;
            }
            if (this.age != t.age){
                return false;
            }
            return true;
        }
        return false;
    }
}
