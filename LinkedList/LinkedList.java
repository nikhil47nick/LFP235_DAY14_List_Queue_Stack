package com.bridgelabz.Day14.LinkedList;

public class LinkedList {

    List head;
    int count;

    void add(int data){
        List ls = new List();
        ls.data = data;
        List n = head,prev = null;

        if(isEmpty()){
            ls = head;
        }else{
            for (int i=0;i<size();i++) {
                prev = n;
                if(n.data < data) {
                    ls.next =n.next;
                    n.next = ls;
                }else{
                    if(prev !=null) {
                        ls.next = prev.next;
                        prev.next = ls;
                    }else{
                        ls.next =n;
                        ls = head;
                    }
                }

                n=n.next;
            }
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


}
