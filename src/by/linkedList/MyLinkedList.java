package by.linkedList;

public class MyLinkedList<E> {
    private Node<E> first;
    private Node<E> last;
    private int size;

    public E getFirst() {
        final Node<E> f = first;
        if (f == null) {
            throw new RuntimeException();
        }
        return f.item;
    }

    public E getLast(){
        final Node<E> l = last;
        if (last == null){
            throw  new RuntimeException();
        }
        return l.item;
    }

    public int size() {
        return size;
    }

    private static class Node<E> {
        private Node<E> first;
        private Node<E> last;
        private E item;

        public Node(Node<E> first, Node<E> last, E item) {
            this.first = first;
            this.last = last;
            this.item = item;
        }
    }


}

