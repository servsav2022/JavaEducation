package lab7.task2;

public class MySuperClass {
    //приватным текстовым полем.
    private String str1;

    MySuperClass() {setStr1();}
    //Объект суперкласса создается передачей одного текстового аргумента конструктору.
    MySuperClass (String str1){setStr1(str1);}
    //метод для присваивания значения полю без параметров
    public void setStr1 (){
        this.str1 = "метод для присваивания значения полю без параметров";
    }
    //метод для присваивания значения полю с одним текстовым параметром
    public void setStr1 (String str1){
        this.str1 = str1;
    }

    public String getStr1(){

        return str1;
    }

    public int getStr1length(){
        return str1.length();
    }


    @Override
    public String toString() {
        String superClassNameAndFieldValue = "MySuperClass{" + "str1=\"" + getStr1() + '\"' + " string.length = " +"\""+getStr1length()+"\"}";
        return superClassNameAndFieldValue;
    }
}