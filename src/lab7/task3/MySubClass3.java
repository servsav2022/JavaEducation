package lab7.task3;

public class MySubClass3 extends MySubClass2{
    MySubClass3(int n) {
        super(n);
    }

    public String str2;

    public void setInt1Str1Str2(int int1, char chr1, String str2) {
        super.n = int1;
        super.chr1 = chr1;
        this.str2 = str2;
    }

    MySubClass3(int int1, char chr1, String str2) {
        super(int1,chr1);
        setInt1Str1Str2(int1, chr1, str2);
    }
    @Override
    public String toString() {
        String ThirdFieldValue =
                "\n str 2 = " + this.getStr2();
        return super.toString()+ThirdFieldValue;
    }
    public String getStr2() {
        return str2;
    }

}
