package lab5;
//6. Напишите программу с классом, в котором есть два закрытых целочисленных поля (назовем их max и min).
// Значение поля max не может быть меньше значения поля min.
// Значения полям присваиваются с помощью открытого метода.
// Метод может вызываться с одним или двумя целочисленными аргументами.
// При вызове метода значения полям присваиваются так: сравниваются текущие значения полей и значения аргументов
// , переданных методу. Самое большое из значений присваивается полю max,
// а самое маленькое из значений присваивается полю min.
// Предусмотрите конструктор, который работает по тому же принципу, что и метод для присваивания значений полям.
// В классе также должен быть метод, отображающий в консольном окне значения полей объекта.
//
class MyTask6 {
    private int min;
    private int max;
//метод с одним полем
    public void set(int m) {
        min = Math.min(max,Math.min(min, m));
        max = Math.max(min,Math.max(max, m));

    }
// метод с двумя полями
    public void set(int a, int b) {
        min = Math.min(max,(Math.min(min,(Math.min(a,b)))));
        max = Math.max(min,(Math.max(max,(Math.max(a,b)))));
    }
//конструктор с одним полем
    MyTask6 (int m) {
        min = Math.min(max,Math.min(min, m));
        max = Math.max(min,Math.max(max, m));
    }
//констрпуктор с двумя полями
    MyTask6 (int a, int b) {
        min = Math.min(max, (Math.min(min, (Math.min(a, b)))));
        max = Math.max(min, (Math.max(max, (Math.max(a, b)))));
    }
//метод выоводит значения полей
    public void showValues() {
        System.out.println("min = "+min);
        System.out.println("max = "+max);
    }
}
public class task6 {
    public static void main(String[] args) {

        MyTask6 obj1 =new MyTask6(6);
        System.out.println("после конструктора с одним полем:");
        obj1.showValues();

        MyTask6 obj2 = new MyTask6(12, -7);
        System.out.println("после конструктора с двумя полями:");
        obj2.showValues();

        obj1.set(18,101);
        System.out.println("после метода с двумя полями:");
        obj1.showValues();

        obj2.set(83);
        System.out.println("после метода с одним полем:");
        obj2.showValues();
    }
}
