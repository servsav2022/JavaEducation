package lab11.tasks.task8;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.createHead(1);
        list.createHead(2);
        list.createHead(3);
        System.out.println(list.toString()); // 3 2 1

        list.addFirst(0);
        System.out.println(list.toString()); // 0 3 2 1

        list.addLast(4);
        System.out.println(list.toString()); // 0 3 2 1 4

        list.insert(5, 2);
        System.out.println(list.toString()); // 0 3 5 2 1 4

        list.removeFirst();
        System.out.println(list.toString()); // 3 5 2 1 4

        list.removeLast();
        System.out.println(list.toString()); // 3 5 2 1

        list.remove(2);
        System.out.println(list.toString()); // 3 5 1

        list.createHeadRec(6);
        System.out.println(list.toString()); // 6 3 5 1

        list.createTailRec(7);
        System.out.println(list.toString()); // 6 3 5 1 7

        System.out.println(list.toStringRec()); // 6 3 5 1 7
    }
}
