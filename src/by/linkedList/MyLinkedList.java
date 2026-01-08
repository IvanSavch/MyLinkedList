package by.linkedList;

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

