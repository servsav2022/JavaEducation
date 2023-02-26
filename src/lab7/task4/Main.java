package lab7.task4;
//4. Напишите программу, в которой использована цепочка наследования из трех классов.
// В первом классе есть открытое символьное поле. Во втором классе появляется открытое текстовое поле.
// В третьем классе появляется открытое целочисленное поле.
// В каждом из классов должен быть конструктор, позволяющий создавать объект на основе значений полей,
// переданных аргументами конструктору, а также конструктор создания копии.
//
public class Main {
    public static void main(String[] args) {

        MyClass1 testObj1 = new MyClass1('A');
        String string1 = testObj1.toString();
        System.out.println(string1);

        MyClass1 testObj1Copy = new MyClass1(testObj1);
        String string1copy = testObj1Copy.toString();
        System.out.println(string1copy);


        MyClass2 testObj2 = new MyClass2('Ё',"тест");
        String string2 = testObj2.toString();
        System.out.println(string2);

        MyClass2 testObj2Copy = new MyClass2(testObj2);
        String string2Copy = testObj2Copy.toString();
        System.out.println(string2Copy);


        MyClass3 testObj3 = new MyClass3('Й',"стринг",9);
        String className3 = testObj3.toString();
        System.out.println(className3);

        MyClass3 testObj3Copy = new MyClass3(testObj3);
        String string3Copy = testObj3Copy.toString();
        System.out.println(string3Copy);
    }
}
