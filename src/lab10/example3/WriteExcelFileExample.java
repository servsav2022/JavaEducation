package lab10.example3;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFileExample {
    public static void main(String[] args) throws IOException {
        //создаем новую книгу Excel
        XSSFWorkbook workbook = new XSSFWorkbook();

        //создаем новый лист в книге
        XSSFSheet sheet = workbook.createSheet("Товары");

        //Записываем даннные в ячейки
        Row headerRow = sheet.createRow(0);
        headerRow.createCell(0).setCellValue("Товар");
        headerRow.createCell(1).setCellValue("Характеристики");
        headerRow.createCell(2).setCellValue("Стоимость");

        Row headerRow1 = sheet.createRow(1);
        headerRow1.createCell(0).setCellValue("Книга");
        headerRow1.createCell(1).setCellValue("Жанр: Фантастика, Автор: Иванов И.И.");
        headerRow1.createCell(2).setCellValue(500.0);

        Row headerRow2 = sheet.createRow(2);
        headerRow2.createCell(0).setCellValue("Компьютер");
        headerRow2.createCell(1).setCellValue("Процессор: Intel Core i5, Оперативная память: 8 Гб ");
        headerRow2.createCell(2).setCellValue(25000);

        //Записываем книгу Excel в файл
        String filePath = "JavaEducation/src/lab10/example3/example3.xlsx";
        FileOutputStream outputStream = new FileOutputStream(filePath);
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
        System.out.println("Данные записаны в файл: "+filePath);
    }
}
