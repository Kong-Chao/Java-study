package com.study.base.fanxing;

import com.study.base.io.Dog;

/**
 * 泛型方法
 */
public class GetObject{


    /**
     * 定义泛型方法
     * @param <T>> 申明一个泛型T
     * @param c 用来创建泛型对象
     */
    public  <T>T getObject (Class c) throws InstantiationException, IllegalAccessException {
        // 创建泛型对象
        T t = (T) c.newInstance();
        return t;
    }

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
       GetObject getObject = new GetObject();
        Object obj = getObject.getObject(Class.forName("com.study.base.io.Dog"));
        if (obj instanceof Dog){
            Dog dog = (Dog) obj;
            dog.setName("大黄");
        }
        System.out.println(obj);
    }

}
