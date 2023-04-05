package lab11.tasks.task5;

public class LinkedListFromTail {

    private Node head;
    private Node tail;

    public LinkedListFromTail() {
        head = null;
        tail = null;
    }

    // добавление с хвоста
    public void add(int value) {
        Node newNode = new Node(value);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    private class Node {
        private int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }
}