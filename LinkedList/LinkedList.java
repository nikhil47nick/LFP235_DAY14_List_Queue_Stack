package com.bridgelabz.Day14.LinkedList;

public class LinkedList {

    List head;
    int count;

    void add(int data){
        List ls = new List();
        ls.data = data;
        if(isEmpty()){
            head = ls;
        }else{
            ls.next = head;
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


    void append(int data){
        List n = new List();
        n.data = data;
        List ls =head;
        if(isEmpty()){
            head = ls;
        }else{
            while(ls.next != null) {
            ls=ls.next;
            }
            ls.next = n;
        }
        count++;

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

    void insert(int pos,int data){
        List ls = new List();
        List n=head,prev=null;
        for(int i=0;i<pos;i++){
            prev=n;
            n=n.next;
        }
        if (prev !=null) {
            ls.next = prev.next;
            prev.next = ls;
        }else{add(ls.data);}
        count++;
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


}
