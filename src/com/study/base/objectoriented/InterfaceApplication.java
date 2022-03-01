package com.study.base.objectoriented;

/**
 * strategy mode(策略模式)：定义了一些列的算法，将每一种算法封装起来并可以相互替换使用，策略模式让算法独立于使用它的客户应用而独立变化
 */
//把可变的行为抽象出来，定义为一系列的算法
interface ISave{
    public void save(String data);
}

class FileSave implements ISave{

    @Override
    public void save(String data) {
        System.out.println("把数据保存到文件中........" + data);
    }
}

class NetSave implements ISave{

    @Override
    public void save(String data) {
        System.out.println("把数据保存到网络上........." + data);
    }
}

 abstract class BaseService{
    private ISave iSave;
    public void setISave(ISave iSave){
        this.iSave =iSave;
    }

    public void add(String data){
        System.out.println("检查数据的合法性");
        iSave.save(data);
        System.out.println("数据保存完毕");
    }
}

class UserService extends BaseService{

}


