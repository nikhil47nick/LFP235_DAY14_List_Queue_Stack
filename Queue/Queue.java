package com.bridgelabz.Day14.Queue;

public class Queue {

    List front,rear;
    int count = 0;


    void enqueue(int data){
        //add data to queue
        List ls = new List(data);

        if(!isEmpty()) {
            rear.next = ls;
            rear = ls;
        }else{
            front = rear = ls;
        }

        count++;
    }

    int dequeue(){
        //remove item from queue and return
        if(!isEmpty()){
            int temp = front.data;
            front = front.next;
            count--;
            return temp;
        }else{
            System.out.println("Queue is Empty");
            return -1;
        }
    }

    boolean isEmpty(){
        return front==null;
    }

    int size(){
        return count;
    }

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(56);
        queue.enqueue(30);
        queue.enqueue(70);
        System.out.println("Total item in queue : "+queue.size());
        System.out.println("The removed value is: "+queue.dequeue());
    }


}
