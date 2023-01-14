package lab7.task2;
//2. Напишите программу, в которой есть суперкласс с приватным текстовым полем.
// В базовом классе должен быть метод для присваивания значения полю: без параметров и с одним текстовым параметром.
// Объект суперкласса создается передачей одного текстового аргумента конструктору.
// Доступное только для чтения свойство результатом возвращает длину текстовой строки.
// На основе суперкласса создается подкласс. В подклассе появляется дополнительное открытое целочисленное поле.
// В классе должны быть такие версии метода для присваивания значений полям (используется переопределение и перегрузка метода из суперкласса):
// без параметров, с текстовым параметром, с целочисленным параметром, с текстовым и целочисленным параметром.
// У конструктора подкласса два параметра (целочисленный и текстовый).
//
public class Main {
    public static void main(String[] args) {
        MySuperClass myObj0 = new MySuperClass();
        String testMySuperClass0 = myObj0.toString();
        System.out.println(testMySuperClass0);

        MySuperClass myObj1 = new MySuperClass("проверка 1");
        String testMySuperClass1 = myObj1.toString();
        System.out.println(testMySuperClass1);

        MySuperClass myObj2 = new MySubClass();
        String testMySubClass0 = myObj2.toString();
        System.out.println(testMySubClass0);

        MySuperClass myObj3 = new MySubClass("проверка 3");
        String testMySubClass1 = myObj3.toString();
        System.out.println(testMySubClass1);

        MySuperClass myObj4 = new MySubClass(2046);
        String testMySubClass2 = myObj4.toString();
        System.out.println(testMySubClass2);

        MySuperClass myObj5 = new MySubClass("еще тест", 1111);
        String testMySubClass3 = myObj5.toString();
        System.out.println(testMySubClass3);
    }
}
