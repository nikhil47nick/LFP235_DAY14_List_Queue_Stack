package com.bridgelabz.Day14.LinkedList;

public class LinkedList {

    List head;
    int count=0;

    void add(int data){
        List ls = new List();
        ls.data = data;
        List n = head,prev = null;

        if(!isEmpty()){
            while (  n.data < data) {
                prev = n;
                if(n.next != null) {
                    n = n.next;
                }else{
                    break;
                }
            }
            if(prev != null){
                ls.next = prev.next;
                prev.next = ls;
            }else {
                ls.next = n;
                head = ls;
            }

        }else{
            head = ls;
        }
        count++;
    }

    void remove(int data){
        List n,prev = null;
        n=head;
        if(n != null){
            while (n.data != data) {
                prev = n;
                n = n.next;
            }
            if(prev !=null) {
                prev.next = n.next;
            }else{
                head = n.next;
            }
            count--;

        }else{
            System.out.println("List is Empty");
        }
    }
    boolean search(int data){
        List n=head;
        for(int i=0;i<size();i++){
            if(n.data == data){
                return true;
            }
            n=n.next;
        }
        return false;
    }
    int index(int data){
        List n=head;
        for(int i=0;i<size();i++){
            if(n.data == data){
                return i;
            }
            n=n.next;
        }
        return -1;
    }
    int pop(){
        List n,prev = null;
        n=head;
        if(n != null){
            while (n.next != null) {
                prev = n;
                n = n.next;
            }
            prev.next = null;
            count--;
        }else{
            System.out.println("List is Empty");
        }
        return n.data;
    }
    boolean isEmpty(){
        return head==null;
    }
    int size(){
        return count;
    }
    void display(){
        List n=head;
        for(int i=0;i<size();i++) {
            System.out.println(n.data);
            n=n.next;
        }
    }


}
