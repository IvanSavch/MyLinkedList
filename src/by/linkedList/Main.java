package by.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<String>();
        myLinkedList.addFirst("str");
        myLinkedList.addFirst("str1");
        myLinkedList.addFirst("str2");
        System.out.println(myLinkedList.getLast());
        System.out.println(myLinkedList.size());
    }
}