package com.study.base.objectoriented;

/**
 *  抽象类应用——模板方法模式：定义一个操作中的算法的骨架，而将一些可变部分的实现延迟加载到子类中。模板方法模式使得子类可以不改变一个算法的结构，即重新定义该算法的某些特定的步骤
 */
public class AbstractApplication {
    public static void main(String[] args) {
        UserManger um = new UserManger();
        um.action("admin","add");
    }
}

abstract class BaseManger{
    public void action(String name,String method){
        if ("admin".equals(name)){
            execute(method);
        }else {
            System.out.println("你没有操作权限，请联系管理员");
        }
    }

    public abstract void execute(String method);
}

class UserManger extends BaseManger{
    public void execute(String method){
        //用户是否登录的验证
        //验证成功后才可以执行一下的操作
        if ("add".equals(method)){
            System.out.println("执行添加操作");
        }else if ("del".equals(method)){
            System.out.println("执行删除操作");
        }
    }
}

class ClssManger{

}
