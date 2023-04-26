package com.study.base.objectOriented;

//两个对象一对一关系，双向一对一，单项一对一
public class ObjectRelationship {
    public static void main(String[] args) {
        Hero hero = new Hero("刘备",3000);
        Weapon weapon = new Weapon("双手剑",3);

        //把两个对象关联起来
       hero.setWeapon(weapon);
       weapon.setHero(hero);

       //通过英雄获取来获取其他信息
        String name = hero.getName();
        int age = hero.getAge();
       Weapon w =  hero.getWeapon();
       System.out.println("我是：" + name +",我" +age + "岁，我的武器是：" + w.getName() +",排行："+ w.getGrade() +"级" );
    }
}


//英雄泪
class Hero{
    private String name;
    private int age;
    private Weapon weapon;

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public Weapon getWeapon(){
        return weapon;
    }

    public Hero() {

    }
    public Hero(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

//武器类
class Weapon{
    private String name;
    private int grade;
    private Hero hero;
    public void setHero(Hero hero){
        this.hero = hero;
    }
    public Hero getHero(){
        return hero;
    }

    public Weapon() {

    }

    public Weapon(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }
}
