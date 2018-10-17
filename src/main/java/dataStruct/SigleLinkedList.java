package dataStruct;

import org.junit.Test;

public class SigleLinkedList {
    private int size;
    private Node head;
    public SigleLinkedList(){
        size=0;
        head=null;
    }
     class Node{
        private Object data;
        private Node next;
        public Node(Object data){
            this.data=data;
        }
    }
//在链表头添加元素
    public Object addHead(Object object){
        Node newNode = new Node(object);
        if(size ==0){
            head=newNode;
        }else {
            newNode.next=head;
            head=newNode;
        }
        return object;
    }
//删除链表头元素
    public Object deleteHead(){
        if(size==0){
            return null;
        }else {
            Object object = head.data;
            head = head.next;
            return object;
        }
    }
    //查找指定元素，找打了返回node，否则返回null
    public Node find(Object object){
        Node current = head;
        int temp = size;
        while (temp>0){
            if(current.data==object){
                return current;
            }else {
                current = current.next;
                temp=temp-1;
            }
        }
        return null;
    }





}
