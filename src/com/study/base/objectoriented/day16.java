package com.study.base.objectoriented;

/**
 * 链表：一种常见的基础数据结构，是一种线性表，但是并不会按线性的顺序存储数据，而是在每一个节点里存到下一个节点的指针（pointer）
 * 链表与数组，线性数据结构
 * 数组适合查找、遍历、固定长度
 * 链表适合插入、删除、不宜过长，否则会导致遍历性能下降
 */
public class day16 {
    public static void main(String[] args) {
        System.out.println("...........add..............");
        NodeManger nm = new NodeManger();
        nm.add(6);
        nm.add(5);
        nm.add(4);
        nm.add(3);
        nm.add(2);
        nm.add(1);
        nm.print();

        System.out.println("...........del..............");
        nm.del(3);
        nm.print();

        System.out.println("...........find..............");
        System.out.println(nm.find(1));

        System.out.println("...........update..............");
        nm.update(1,10);
        nm.print();

        System.out.println("...........insert..............");
        nm.insert(1,20);
        nm.print();
    }

     static class NodeManger{
        private Node root;  //根节点
        private int currentIndex = 0; //节点的序号，每次操作从0开始

        //添加
        public void add(int data){
            if (root ==null){
                root = new Node(data);
            }else{
                root.addNode(data);
            }
        }

        //删除
        public boolean del(int data){
            if (root ==null) return false;

            if (root.getData() ==data){
                root = root.next;
                return true;
            }else {
                root.delNode(data);
            }
            return false;
        }
        public void print(){
            if (root != null){
                System.out.println(root.getData() +"->");
                root.printNode();
                System.out.println();
            }
        }

        //查找是否存在节点
        public boolean find(int data){
            if (root ==null) return false;
            if (root.getData() ==data){
                return true;
            }else {
                return root.findNode(data);
            }
        }

        //更新节点
        public boolean update(int oldData, int newData){
            if (root ==null) return false;
            if (root.getData() == oldData){
                root.setData(newData);
                return true;
            }else {
                return root.updateNode(oldData, newData);
            }

        };

        //向索引之前插入节点
        public void insert(int index, int data){
            if (index < 0)return;
            currentIndex = 0;
            if (index == currentIndex){
                Node newNode = new Node(data);
                newNode.next = root;
                root = newNode;
            }else {
                root.insert(index,data);
            }
        };

        private class Node{
            private int data;
            private Node next; //把当前类型作为属性

            public Node(int data) {
                this.data = data;
            }

            public void setData(int data){
                this.data = data;
            }

            public int getData(){
                return data;
            }

            //添加节点
            public void addNode(int data){
                if (this.next == null){
                    this.next = new Node(data);
                }else{
                    this.next.addNode(data);
                }
            };

            //删除节点
            public void delNode(int data){
                if (this.next != null){
                    if (this.next.data ==data){
                        this.next = this.next.next;
                    }else {
                        this.next.delNode(data);
                    }
                }
            };

            //输出所有节点
            public void printNode(){
                if (this.next != null){
                    System.out.println(this.next.data + "->");
                    this.next.printNode();
                }
            }

            //查找结点是否存在
            public boolean findNode(int data){
                if (this.next !=null){
                    if (this.next.data ==data ){
                        return true;
                    }else {
                         return this.next.findNode(data);
                    }
                }
                return false;
            }

            //修改节点
            public boolean updateNode(int oldData, int newData) {
                if (this.next != null){
                    if (this.next.data == oldData){
                        this.next.data = newData;
                        return true;
                    }else {
                        return this.next.updateNode(oldData, newData);
                    }
                }
                return false;
            }

            //插入节点
            public void insert(int index, int data){
                currentIndex++;
                if (index == currentIndex){
                    Node newNode = new Node(data);
                    newNode.next = this.next;
                    this.next = newNode;
                }else {
                    this.next.insert(index,data);
                }
            };
        }
    }
}
