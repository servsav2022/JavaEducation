package lab5;
//3. Напишите программу с классом, у которого есть два целочисленных поля.
// В классе должны быть описаны конструкторы, позволяющие создавать объекты без передачи аргументов,
// с передачей одного аргумента и с передачей двух аргументов.
class MyClassTask3 {
    private int a,b;
    public void test() {
        System.out.println("Метод первый без аргументов");
    }
    public void test(int a) {
        this.a = a;
        System.out.println("Метод второй с одним аргументом: "+ this.a);
    }
    public void test(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Метод Третий с двумя аргументами: "+ this.a + ", " + this.b);
    }
}
public class task3 {
    public static void main(String[] args) {
        MyClassTask3 obj = new MyClassTask3();
        obj.test();
        obj.test(11);
        obj.test(9,19);
    }
}
