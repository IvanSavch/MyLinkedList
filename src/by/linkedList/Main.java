package by.linkedList;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList = new MyLinkedList<>();
        myLinkedList.addFirst("str");
        myLinkedList.addFirst("str2");
        myLinkedList.addFirst("str3");
        myLinkedList.addFirst("str4");
        myLinkedList.addFirst("str5");
        myLinkedList.addFirst("str6");
        System.out.println(myLinkedList.get(2));
    }
}