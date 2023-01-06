package com.bridgelabz.Day14.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList link = new LinkedList();
        link.add(56);
        link.append(70);
        link.insert(2,30);
        link.remove(56);

        link.insert(link.index(30),40);
        link.sortList();

    }
}
