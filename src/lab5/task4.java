package lab5;
//4. Напишите программу с классом, у которого есть символьное и целочисленное поле.
// В классе должны быть описаны версии конструктора с двумя аргументами (целое число и символ – определяют значения полей),
// а также с одним аргументом типа double.
// В последнем случае действительная часть аргумента определяет код символа (значение символьного поля),
// а дробная часть (с учетом десятых и сотых) определяет значение целочисленного поля.
// Например, если аргументом передается число 65.1267,
// то значением символьного поля будет символ ‘A’ с годом 65,
// а целочисленное поле получит значение 12 (в дробной части учитываются только десятые и сотые).

class MyClassTask4 {
    char chr;
    int a;
    public void setVars(int a, char chr ) {
        this.a = a;
        this.chr = chr;
    }
    public void setVars(double f ) {
        this.chr = (char) f;
        this.a = (int)((f -(int)f)*100);
    }
}
public class task4 {
    public static void main(String[] args) {
        MyClassTask4 obj = new MyClassTask4();
        obj.setVars(12,'A');
        System.out.println("a= "+ obj.a +", "+"chr= " + obj.chr);
        obj.setVars(65.1267);
        System.out.println("Значения переменных после вычисления из переменной типа double");
        System.out.println("a= "+ obj.a +", "+"chr= " + obj.chr);
    }
}
