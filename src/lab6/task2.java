package lab6;
//2. Напишите программу с классом, в котором есть закрытое статическое целочисленное поле с начальным нулевым значением.
// В классе должен быть описан статический метод, при вызове которого отображается текущее значение статического поля,
// после чего значение поля увеличивается на единицу.
class Lab6Task2 {
   private static int value=0;
   public static void showValue() {
        System.out.println(value);
        value++;
    }
}
public class task2 {
    public static void main(String[] args) {

        Lab6Task2 test = new Lab6Task2();
        test.showValue();
        test.showValue();
        test.showValue();
        test.showValue();
        test.showValue();
        Lab6Task2.showValue();
    }
}
