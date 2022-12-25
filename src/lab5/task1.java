package lab5;
//
//1. Напишите программу с классом, в котором есть закрытое символьное поле и три открытых метода.
// Один из методов позволяет присвоить значение полю.
// Еще один метод при вызове возвращает результатом код символа.
// Третий метод позволяет вывести в консольное окно символ (значение поля) и его код.
//
class TestClass1 {
    private char chr;

    public void setChr(char chr) {
        this.chr = chr;
    }

    public int getCodeChr() {
        return chr;
    }
    public void showCodeAndValue (){
        System.out.println("Code: " + chr);
        System.out.println("Value: "+ ((int)chr));
    }
}
public class task1 {
    public static void main(String[] args) {

        TestClass1 myClass1 =new TestClass1();

        myClass1.setChr('W');
        System.out.println(myClass1.getCodeChr());
        myClass1.showCodeAndValue();
    }
}
