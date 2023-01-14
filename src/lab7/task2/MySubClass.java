package lab7.task2;
public class MySubClass extends MySuperClass {
    private String str2;
    public int int1;
    MySubClass() {
        setStr1();
    }
    //версия метода с текстовым параметром,
    MySubClass(String str2) {
        setStr1(str2);
    }
    //версия метода с целочисленным параметром,
    MySubClass(int int1) {
        setStr1();
        this.setInt1(int1);
    }
    //версия метода с текстовым и целочисленным параметром.
    MySubClass(String str2, int int1) {
        setStr1(str2);
        this.setInt1(int1);
    }
    public void setInt1(int int1) {
        this.int1 = int1;
    }
    public void setStr1() {
        this.str2 = "нет параметров";
    }

    public void setStr1(String str2) {
        this.str2 = str2;
    }

    public int getInt1() {
        return int1;
    }

    public String getStr1() {
       return str2;
    }

    public int getStr1length() {
      return str2.length();
    }


    @Override
    public String toString() {
        String ClassNameAndFieldValue = "MySubClass{" + "str2=\"" + getStr1() + '\"' + " string.length = " + "\"" + getStr1length() + "\"}"
                + "\nMySubClass{" + "int1=\"" + getInt1() + "\"}";
        return ClassNameAndFieldValue;
    }
}