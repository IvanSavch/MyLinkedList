package by.linkedList;

import java.util.LinkedList;

public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    private void linkFirst(E e) {
        Node<E> f = first;
        final Node<E> newNode = new Node<>(null, f, e);
        first = newNode;
        if (f == null)
            last = newNode;
         else
             f.prev = newNode;
        size++;

    }
    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> x = first;
            for (int i = 0; i < index; i++)
                x = x.first;
            return x;
        } else {
            Node<E> x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
            return x;
        }
    }
    public E get(int index){
        return node(index).item;
    }

    private void linkLast(E e){
        Node<E> l = last;
        Node<E> newNode = new Node<>(l,null,e);
        last = newNode;
        if (l == null)
            first = newNode;
        else l.first = newNode;
        size++;
    }

    public E getFirst() {
        final Node<E> f = first;
        if (f == null) {
            throw new RuntimeException();
        }
        return f.item;
    }

    public E getLast() {
        final Node<E> l = last;
        if (last == null) {
            throw new RuntimeException();
        }
        return l.item;
    }

    public int size() {
        return size;
    }

    public void addFirst(E el) {
        linkFirst(el);
    }
    public void addLast(E el){
        linkLast(el);
    }




    private static class Node<E> {
        private Node<E> first;
        private Node<E> prev;
        private E item;

        public Node(Node<E> prev, Node<E> first, E item) {
            this.first = first;
            this.prev = prev;
            this.item = item;
        }
    }

}

