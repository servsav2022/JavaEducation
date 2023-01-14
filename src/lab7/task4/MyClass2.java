package lab7.task4;

public class MyClass2 extends MyClass1 {
    MyClass2(char chr) {
        super(chr);
    }
    public String str;
    public void setChrStr(char ch, String str) {
        super.ch = ch;
        this.str = str;
    }
    MyClass2(char ch, String str) {
        super(ch);
        this.setChrStr(ch, str);
    }

    MyClass2(MyClass2 copy) {
        super(copy.ch);
        this.setChrStr(copy.ch, copy.str);
    }
    @Override
    public String toString() {
        String SecondFieldValue =
                "\n str1 = " + this.getStr();
        return super.toString()+SecondFieldValue;
    }
    public String getStr() {
        return str;
    }
}
