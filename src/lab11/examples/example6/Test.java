package lab11.examples.example6;

public class Test {
    public static void main(String[] args) {
        //создание несвязанных узлов с помощью конструктора
        Node node0=new Node(0,null);// 0-й узел - будет головой в списке
        Node node1=new Node(1,null);
        Node node2=new Node(2,null);
        Node node3=new Node(3,null); // последний узел - будет хвостом в списке

        //связывание узлов в список с помощью ссылок
        node0.next=node1;
        node1.next=node2;
        node2.next=node3;
        //вывод списка с использованием вспомогательной переменной ref,
        //сооттветсвующией текущему значению ссылки при прохождении по списку
        Node ref=node0;//для перемещения по списку достаточно помнить голову
        while(ref!=null){
            System.out.println((" "+ref.value));
            ref=ref.next;
        }
    }
}
