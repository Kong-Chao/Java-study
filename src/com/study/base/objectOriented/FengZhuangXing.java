package com.study.base.objectOriented;

/**
 *  封装性的概念：
 *      1.封装性是面向对象的三大特征之一
 *      2.封装就是实现细节，仅对外部提供访问接口
 *          封装性有属性的封装、方法的封装，类的封装，组件的封装、模块化的封装、系统及的封装
 *          封装的好处：模块化，信息隐藏，安全性，代码重用，插件化易于
 *
 *       如果属性没有封装的，那么本类之外创建对象后，可以直接访问属性
 *       private 关键字：访问权限修饰符 public 表示共有，private 私有，只能在本类中访问
 */
public class FengZhuangXing {

        private String name; // 实例变量
        private String idNum; // 实例变量
        private int age;

        public int getAge(){
            return age;
        }

        public String getName(){
            return name;
        }

        public String getIdNum(){
            return idNum;
        }

        public void setAge( int newAge){
            this.age = newAge;  // this关键指向 FengZhuangXing
        } // int newAge 局部变量

        public void setName(String newName){
            name = newName;
        }

        public void setIdNum( String newId){
            idNum = newId;
        }


    public static void main(String[] args) {
        FengZhuangXing encap = new FengZhuangXing();
        encap.setName("James");
        encap.setAge(20);
        encap.setIdNum("12343ms");

        System.out.print("Name : " + encap.getName()+
                " Age : "+ encap.getAge());
    }

}


