package by.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.addFirst("str");
        System.out.println(myLinkedList.getFirst());
    }
}