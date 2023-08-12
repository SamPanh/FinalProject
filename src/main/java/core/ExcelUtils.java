package core;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelUtils {
    private static XSSFSheet ExcelSheet;
    private static XSSFWorkbook xssfWorkbook;

    public static Object[][] getTableArray(String FilePath, String SheetName, int startCol, int totalCols) {
        String[][] tabArray = null;
        try {
            FileInputStream ExcelFile = new FileInputStream(FilePath);
            // Access the required test data sheet
            xssfWorkbook = new XSSFWorkbook(ExcelFile);
            ExcelSheet = xssfWorkbook.getSheet(SheetName);
            int startRow = 1;
            int ci, cj;
            int totalRows = ExcelSheet.getLastRowNum();
            tabArray = new String[totalRows][totalCols];
            ci = 0;
            for (int i = startRow; i <= totalRows; i++, ci++) {
                cj = 0;
                for (int j = startCol; j < totalCols + startCol; j++, cj++) {
                    tabArray[ci][cj] = getCellData(i, j);
                }
            }
        } catch (IOException e) {
            System.out.println("Could not read the Excel sheet");
            e.printStackTrace();
        }
        return (tabArray);
    }

    private static String getCellData(int rowIndex, int colIndex) {
        DataFormatter formatter = new DataFormatter();
        XSSFCell cell;
        try {
            cell = ExcelSheet.getRow(rowIndex).getCell(colIndex);
            if (cell == null) {
                return "";
            } else {
                return formatter.formatCellValue(cell);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        }
    }
}
