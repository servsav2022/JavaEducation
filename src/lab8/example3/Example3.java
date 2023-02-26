package lab8.example3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import static lab8.example3.File_ByteRead_SamBuff.readAllByArray;

public class Example3 {
    public static void main(String[] args) throws IOException {
        String fileName="E:\\MyFile1.txt";
        InputStream inFile=null;

        try {
            inFile = new FileInputStream(fileName);
            readAllByArray(inFile);
        } catch (IOException e) {
            System.out.println("Ошибка открытия-закрытая файла "+ fileName+e);
        } finally {
            if (inFile != null){
                try {
                    inFile.close();
                } catch (IOException ignore) {
                    /*NOP*/ // No Operation ничего неделать
                }
            }
        }
    }
}
