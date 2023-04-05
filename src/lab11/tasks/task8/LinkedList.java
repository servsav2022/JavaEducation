package lab11.tasks.task8;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    // создание списка с головы
    public void createHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // создание списка с хвоста
    public void createTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // вывод списка
    public String toString() {
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current != null) {
            result.append(current.data).append(" ");
            current = current.next;
        }
        return result.toString();
    }

    // добавление элемента в начало списка
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // добавление элемента в конец списка
    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // вставка элемента в список с указанным номером
    public void insert(int data, int position) {
        if (position == 0) {
            addFirst(data);
        } else {
            Node newNode = new Node(data);
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null) {
                return;
            }
            newNode.next = current.next;
            current.next = newNode;
        }
    }

    // удаление элемента с головы списка
    public void removeFirst() {
        if (head != null) {
            head = head.next;
        }
    }

    // удаление последнего элемента списка
    public void removeLast() {
        if (head == null) {
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
    }

    // удаление элемента с указанным номером
    public void remove(int position) {
        if (position == 0) {
            removeFirst();
        } else {
            Node current = head;
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next;
            }
            if (current == null || current.next == null) {
                return;
            }
            current.next = current.next.next;
        }
    }

    // ввод с головы (рекурсивный метод)
    public void createHeadRec(int data) {
        head = createHeadRecHelper(head, data);
    }

    private Node createHeadRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        Node newNode = new Node(data);
        newNode.next = current;
        return newNode;
    }

    // ввод с хвоста (рекурсивный метод)
    public void createTailRec(int data) {
        head = createTailRecHelper(head, data);
    }

    private Node createTailRecHelper(Node current, int data) {
        if (current == null) {
            return new Node(data);
        }
        current.next = createTailRecHelper(current.next, data);
        return current;
    }

    // вывод списка (рекурсивный метод)
    public String toStringRec() {
        return toStringRecHelper(head);
    }

    private String toStringRecHelper(Node current) {
        if (current == null) {
            return "";
        }
        return current.data + " " + toStringRecHelper(current.next);
    }

}