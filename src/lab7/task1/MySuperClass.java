package lab7.task1;

public class MySuperClass {

    private String str1;


    MySuperClass(String strEx) {
        this.str1 = strEx;
    }

    MySuperClass() {
        this.str1 = "нет параметров";
    }

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
