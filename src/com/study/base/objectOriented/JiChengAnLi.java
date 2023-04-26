package com.study.base.objectOriented;

/**
 *  继承的应用实例
 */

public class JiChengAnLi {
    public static void main(String[] args) {
        ImportCosmeticManGerTest cm = new ImportCosmeticManGerTest();
        cm.add(new cosmeticTest("冰冰水","进口",100));
        cm.add(new cosmeticTest("香奈儿","进口",300));
        cm.add(new cosmeticTest("润肤剂","国产",60));
        cm.add(new cosmeticTest("垃圾口袋","国产",1));
        cm.printInfo();
    }
}

//可输出进口化妆品的管理类
class ImportCosmeticManGerTest extends cosmeticManGerTest{
    public void printInfo(){
        for (int i=0; i< count; i++){
            //比较两个字符串的值是否相等，不能使用==，使用equals（）
            if ("进口".equals(cs[i].getType())){
                System.out.println(cs[i].getInfo());
            }
        }
    }
}

// 按照单价排序
class SortCosmeticManGerTest extends cosmeticManGerTest{
    //输出所有的产品
    public void printInfo(){
        cosmeticTest[] temp = java.util.Arrays.copyOf(cs,count);

        cosmeticTest c = null;
        for (int i=0; i<temp.length-1; i++){
            for (int j=0 ; j< temp.length-i-1; j++){
                if (temp[j].getPrice() > temp[j+1].getPrice()){
                    c =temp[j];
                    temp[j] = temp[j+1];
                    temp[j+ 1] = c;
                }
            }
        }
        for (cosmeticTest cosmeticTest: temp){
            System.out.println(cosmeticTest.getInfo());
        }
    }
}

//化妆品管理类
class cosmeticManGerTest{
        protected cosmeticTest[] cs = new cosmeticTest[4];
        protected int count =0;

        //进货功能
        public void  add(cosmeticTest c){
             int size = cs.length;
            if (count > cs.length){
                int newLen = size * 2;
                cs =java.util.Arrays.copyOf(cs,newLen);
            }
            cs[count] = c;
            count ++;
        }

        //输出所有的产品
    public void printInfo(){
            for (int i=0; i< count;i++){
                System.out.println(cs[i].getInfo());
            }
    }
}
//化妆品类
class cosmeticTest{
    private String name; //品牌名称
    private String type; //品牌类型
    private int price; //品牌价格
    public cosmeticTest(){};
    public cosmeticTest(String name,String type, int price){
        this.name =name;
        this.type =type;
        this.price =price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public String getInfo(){
       return "name:" + name +",type:" + type +",price:" +price;
    }
}
