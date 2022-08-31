package com.study.base.io;

import java.io.*;

public class ObjectStreamDemo {

    /**
     * 序列化一组对象可以采用对象数组形式，因为对象数组可以向Object进行转型操作
     * 读取对象
     * @throws IOException
     * @throws ClassNotFoundException
     */
    private static void readObject() throws IOException, ClassNotFoundException {
        File file = new File("D:\\tt\\my\\dog.obj");
        InputStream in = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(in);
        Dog dog = (Dog) ois.readObject();
        System.out.println(dog);
        ois.close();

    }

    // 对象序列化：将对象写入文件
    private static void writerObject() throws IOException {
        Dog dog = new Dog("haha",19,"nan");
        File file = new File("D:\\tt\\my\\dog.obj");
        if (!file.exists()){
            file.createNewFile();
        }
        OutputStream out = new FileOutputStream(file);
        ObjectOutputStream oos = new ObjectOutputStream(out);
        oos.writeObject(dog);
        oos.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
      //  writerObject();
        readObject();
    }
}
