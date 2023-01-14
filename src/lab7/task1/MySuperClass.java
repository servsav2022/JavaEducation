package lab7.task1;

public class MySuperClass {

    private String str1;

    //конструктор с текстовым аргументом
    MySuperClass(String strEx) {
        this.str1 = strEx;
    }

    MySuperClass() {
        this.str1 = "нет параметров";
    }

    //@Override - аннотация указываемая для того, чтобы показать что далее мы собираемся переопределять метод суперкласса
    @Override
    public String toString() {
        String superClassNameAndFieldValue;
        superClassNameAndFieldValue = "super" + "\n" +
                " Class name: " + this.getClass().getSimpleName() + "\n" +
                " str 1 = " + this.getStr1();
        return superClassNameAndFieldValue;
    }

    public String getStr1() {
        return str1;
    }

    public void setStr1(String str1) {
        this.str1 = str1;
    }
}
