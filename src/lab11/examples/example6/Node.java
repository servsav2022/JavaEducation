package lab11.examples.example6;

public class Node { //класс - структура элемента списка
    public int value; //значение
    public Node next; // поле - ссылка(указатель) на следующий узел
    Node(int value, Node next) {
        this.value=value;
        this.next=next;
    }
}
