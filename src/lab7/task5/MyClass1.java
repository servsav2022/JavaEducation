package lab7.task5;

public class MyClass1 {
    protected String str;

    public void setStr(String str) {
        this.str = str;
    }
    //конструктор с текстовым параметром
    MyClass1(String str){
        this.setStr(str);
    }
    //метод, при вызове которого в консольном окне отображается название класса и значение поля
    public void ShowString() {
        String ClassNameAndFieldValue;
        ClassNameAndFieldValue =
                "\n Class name: " + this.getClass().getSimpleName() + "\n" +
                        " String 1 = \"" + this.getStr()+"\"";
        System.out.println(ClassNameAndFieldValue);
    }
    public String getStr() {
        return str;
    }
}
