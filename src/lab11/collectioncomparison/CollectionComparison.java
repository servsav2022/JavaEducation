package lab11.collectioncomparison;

import java.util.*;

public class CollectionComparison {
    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        Set<Integer> treeSet = new TreeSet<>();
        List<Integer> arrayList2 = new ArrayList<>();
        List<Integer> linkedList2 = new LinkedList<>();
        Set<Integer> treeSet2 = new TreeSet<>();
        System.out.println("Время выполнения операции добавления в конец arrayList = "
                + getRunningTimeForAddAtEnd(arrayList)+"ms");
        System.out.println("Время выполнения операции добавления в конец linkedList = "
                + getRunningTimeForAddAtEnd(linkedList)+"ms");
        System.out.println("Время выполнения операции добавления в конец treeSet = "
                + getRunningTimeForAddAtEnd(treeSet)+"ms");
        System.out.println();

        System.out.println("Время выполнения операции добавления в начало arrayList = "
                + getRunningTimeForAddAtBeginning(arrayList)+"ms");
        System.out.println("Время выполнения операции добавления в начало linkedList = "
                + getRunningTimeForAddAtBeginning(linkedList)+"ms");
        System.out.println("Время выполнения операции добавления в начало treeSet = "
                + getRunningTimeForAddAtBeginnigTreeSet(treeSet)+"ms");
        System.out.println();

        System.out.println("Время выполнения операции добавления в середину arrayList = "
                + getRunningTimeForAddAtMiddle(arrayList) + "ms");
        System.out.println("Время выполнения операции добавления в середину linkedList = "
                + getRunningTimeForAddAtMiddle(linkedList) + "ms");
        System.out.println("Время выполнения операции добавления в середину treeSet = "
                + getRunningTimeForAddAtMiddleTreeSet(treeSet)+ "ms");
        System.out.println();
///сравнение удаления элементов в наносекундах
        System.out.println("Время выполнения операции удаления с конца arrayList = "
                + getRunningTimeForDelAtEnd(arrayList) + "ns" );
        System.out.println("Время выполнения операции удаления с конца linkedList = "
                + getRunningTimeForDelAtEnd(linkedList) + "ns" );
        System.out.println("Время выполнения операции удаления с конца treeSet = "
                + getRunningTimeForDelAtEndTreeSet(treeSet) + "ns");
        System.out.println();

        System.out.println("Время выполнения операции удаления с начала arrayList = "
                + getRunningTimeForDelAtBeginning(arrayList) + "ns");
        System.out.println("Время выполнения операции удаления с начала linkedList = "
                + getRunningTimeForDelAtBeginning(linkedList) + "ns");
        System.out.println("Время выполнения операции удаления с начала treeSet = "
                + getRunningTimeForDelAtBeginnigTreeSet(treeSet) + "ns");
        System.out.println();

        System.out.println("Время выполнения операции удаления в середине arrayList = "
                + getRunningTimeForDelAtMiddle(arrayList) + "ns");
        System.out.println("Время выполнения операции удаления в середине linkedList = "
                + getRunningTimeForDelAtMiddle(linkedList) + "ns");
        System.out.println("Время выполнения операции удаления в середине treeSet = "
                + getRunningTimeForDelAtMiddleTreeSet(treeSet) + "ns");
        System.out.println();

        System.out.println("Время выполнения операции получения элемента по индексу arrayList = "
                + getByIndex(arrayList2) + "ms");
        System.out.println("Время выполнения операции получения элемента по индексу linkedList = "
                + getByIndex(linkedList2) + "ms");
        System.out.println("Время выполнения операции получения элемента по индексу treeSet = "
                + getByIndexTreeSet(treeSet2) + "ms");
        System.out.println();
    }
    private static long getRunningTimeForDelAtEnd(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.nanoTime();
        list.remove((int) (list.size()-1));
        long end = System.nanoTime();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
    private static long getRunningTimeForDelAtBeginning(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.nanoTime();
        list.remove(0);
        long end = System.nanoTime();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
    private static long getRunningTimeForDelAtMiddle(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.nanoTime();
        list.remove((int)(list.size() / 2));
        long end = System.nanoTime();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }
    private static long getRunningTimeForDelAtBeginnigTreeSet(Set<Integer> treeSet) {
        long startTime = System.nanoTime();
        treeSet.remove(0);
        long endTime = System.nanoTime();
        return endTime-startTime;
    }
    private static long getRunningTimeForDelAtEndTreeSet(Set<Integer> treeSet) {
        long startTime = System.nanoTime();
        treeSet.remove(treeSet.size());
        long endTime = System.nanoTime();
        return endTime-startTime;
    }
    private static long getRunningTimeForDelAtMiddleTreeSet(Set<Integer> treeSet) {
        long startTime = System.nanoTime();
        treeSet.remove(((int)treeSet.size()/2));
        long endTime = System.nanoTime();
        return endTime-startTime;
    }
    private static long getRunningTimeForAddAtBeginnigTreeSet(Set<Integer> treeSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
                // Удаление первого элемента, если он есть
            if (treeSet.size() >= 1) {
               Iterator<Integer> it = treeSet.iterator();
                if (it.hasNext()) {
                   it.next();
                   it.remove();
                }
            }
                // Добавление элемента в начало
            treeSet.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }

    private static long getRunningTimeForAddAtMiddleTreeSet(Set<Integer> treeSet) {
        long startTime = System.currentTimeMillis();
        for (int i = 49999; i < 100000; i++) {
           treeSet.add(i);
        }
        long endTime = System.currentTimeMillis();
        return endTime-startTime;
    }


        private static long getRunningTimeForAddAtEnd(Collection<Integer> collection){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 100000; i++) {
            collection.add(i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeForAddAtBeginning(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 100000; i++) {
            list.add(0, i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getRunningTimeForAddAtMiddle(List<Integer> list){
        // точка начала отсчета времени выполнения программы
        long start = System.currentTimeMillis();
        // блок кода в котором выполняется операция добавления
        for (int i = 0; i < 100000; i++) {
           list.add(list.size() / 2, i);
        }
        // точка окончания отсчета времени выполнения программы
        long end = System.currentTimeMillis();
        // вывод в консоль времени выполнения блока кода содержащего операцию
        return end - start;
    }

    private static long getByIndex(List<Integer> list){

        int index;
        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            index = list.get(i);
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
    private static long getByIndexTreeSet(Set<Integer> treeSet){

        int index=0;
        for (int i = 0; i < 1000000; i++) {
            treeSet.add(i);
        }

        long start = System.currentTimeMillis();
        Integer[] arr = new Integer[treeSet.size()];
        arr = treeSet.toArray(arr);
        for(int i : arr)
        {
            index=i;
        }
        long end = System.currentTimeMillis();

        return end - start;
    }
}
