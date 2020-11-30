package by.academy.classwork9;

public class LinkedListCustom<T> {
        private Node <T> head;
    private Node <T> tail;

    public void add(T value) {
        Node<T> node = new Node<>(value);
        if(head == null) {
            head = node;
            tail = node;
        }else{
            tail.next = node;
            node.prev = tail;
            tail=node;
        }
    }


    class Node<T>{

        T value;
        Node<T> next;
        Node<T> prev;

        public Node(T value) {
            this.value = value;
        }
    }


}
