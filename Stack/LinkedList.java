package com.bridgelabz.Day14.Stack;

public class LinkedList {

    Stack top;
    int count = 0;

    void push(int data){
        //add new item to top of stack
        Stack st = new Stack(data);

        if(top !=null){
            st.next =top;
            top = st;
        }else{
            top = st;
        }
        count++;
    }

    int pop(){
        //remove item from the top
        if(!isEmpty()) {
            int temp = top.data;
            top = top.next;
            count--;
            return temp;
        }else{
            System.out.println("Stack is empty");
            return -1;
        }

    }

    int peek(){
        //return the top item but did not remove
        return top.data;
    }

    boolean isEmpty(){
        return top == null;
    }

    int size(){
        return count;
    }

    public static void main(String[] args) {
        LinkedList stack = new LinkedList();
        stack.push(70);
        stack.push(30);
        stack.push(56);

        System.out.println("Stack Size is : "+ stack.size());

        while(!stack.isEmpty()){
            System.out.println(stack.peek());
            System.out.println("Deleted : "+stack.pop());

        }

    }


}
