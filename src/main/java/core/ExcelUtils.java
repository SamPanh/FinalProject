package core;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.log4testng.Logger;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ExcelUtils {
    private static XSSFSheet ExcelSheet;//ExcelSheet
    private static XSSFWorkbook xssfWorkbook; //xssfWorkbook
	public static FileInputStream fi;
	public static FileOutputStream fo;
	public static XSSFRow row;
	public static XSSFCell cell;
	public static XSSFCellStyle style;
	public static XSSFFont font;
	public static int excelRowResult, excelColumnResult;
	final static Logger logger = Logger.getLogger(ExcelUtils.class);

    public static Object[][] getTableArray(String FilePath, String SheetName, int startCol, int totalCols) throws Exception {
        String[][] tabArray = null;
        try {
            FileInputStream ExcelFile = new FileInputStream(FilePath);
            // Access the required test data sheet
            xssfWorkbook = new XSSFWorkbook(ExcelFile);
            ExcelSheet = xssfWorkbook.getSheet(SheetName);
            int startRow = 1;
            int ci, cj;
            int totalRoExcelSheet = ExcelSheet.getLastRowNum();
            tabArray = new String[totalRoExcelSheet][totalCols];
            ci = 0;
            for (int i = startRow; i <= totalRoExcelSheet; i++, ci++) {
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


    
	public static void openFile(String path, String sheetName) throws Exception {
		try {
			fi = new FileInputStream(path);
			xssfWorkbook = new XSSFWorkbook(fi);
			ExcelSheet = xssfWorkbook.getSheet(sheetName);
		} catch (Exception e) {
			logger.error("Error message: ", e);
			throw (e);
		}
	}
	public static void setRowColumn(int rowNum, int colNum) throws Exception {
		excelRowResult = rowNum;
		excelColumnResult = colNum;
	}

	public static Integer getRow() throws Exception {
		return excelRowResult;
	}

	public static Integer getColumn() throws Exception {
		return excelColumnResult;
	}

	public static void saveAndCloseFile(String path) throws Exception {
		fo = new FileOutputStream(path);
		xssfWorkbook.write(fo);
		fo.close();
	}

	public static int getRowCount(String path, String sheetName) throws Exception {
		int rowCount;
		fi = new FileInputStream(path);
		xssfWorkbook = new XSSFWorkbook(fi);
		ExcelSheet = xssfWorkbook.getSheet(sheetName);
		rowCount = ExcelSheet.getLastRowNum();
		fi.close();
		return rowCount;
	}

	public static int getCellCount(String path, String sheetName, int rowNum) throws Exception {
		int cellCount;
		fi = new FileInputStream(path);
		xssfWorkbook = new XSSFWorkbook(fi);
		ExcelSheet = xssfWorkbook.getSheet(sheetName);
		row = ExcelSheet.getRow(rowNum);
		cellCount = row.getLastCellNum();
		fi.close();
		return cellCount;
	}

	public static String getCellData(int rowNum, int colNum) throws Exception {
		try {
			cell = ExcelSheet.getRow(rowNum).getCell(colNum);
			String cellData = cell.getStringCellValue();
			return cellData;
		} catch (Exception e) {
			return "";
		}
	}

	public static Integer getNumericCellData(int rowNum, int colNum) throws Exception {
		try {
			cell = ExcelSheet.getRow(rowNum).getCell(colNum);
			Integer cellData = (int) cell.getNumericCellValue();
			return cellData;
		} catch (Exception e) {
			return null;
		}
	}


	public static void setCellData(int rowNum, int colNum, String status) throws Exception {
		try {
			row = ExcelSheet.getRow(rowNum);
			if (row == null) {
				row = ExcelSheet.createRow(rowNum);
			}
			cell = row.getCell(colNum);
			if (cell == null) {
				cell = row.createCell(colNum);
			}
			cell.setCellValue(status);
			font = xssfWorkbook.createFont();
			setCommonFont(false, 12);
			style = xssfWorkbook.createCellStyle();
			style.setFont(font);
			cell.setCellStyle(style);
		} catch (Exception e) {
			return;
		}
	}

	public static void setCellDataResult(int rowNum, int colNum, String status) throws Exception {
		try {
			row = ExcelSheet.getRow(rowNum);
			if (row == null) {
				row = ExcelSheet.createRow(rowNum);
			}
			cell = row.getCell(colNum);
			if (cell == null) {
				cell = row.createCell(colNum);
			}
			cell.setCellValue(status);
			font = xssfWorkbook.createFont();
			setCommonFont(true, 13);
			style = xssfWorkbook.createCellStyle();
			style.setFont(font);
			cell.setCellStyle(style);
		} catch (Exception e) {
			return;
		}
	}

	public static void fillGreenColour(int rowNum, int colNum) throws Exception {
		row = ExcelSheet.getRow(rowNum);
		cell = row.getCell(colNum);
		font = xssfWorkbook.createFont();
		setCommonFont(true, 13);
		style = xssfWorkbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setFont(font);
		cell.setCellStyle(style);
	}

	public static void fillRedColour(int rowNum, int colNum) throws Exception {
		row = ExcelSheet.getRow(rowNum);
		cell = row.getCell(colNum);
		font = xssfWorkbook.createFont();
		setCommonFont(true, 13);
		style = xssfWorkbook.createCellStyle();
		style.setFillForegroundColor(IndexedColors.RED.getIndex());
		style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		style.setFont(font);
		cell.setCellStyle(style);
	}


	public static void setCommonFont(boolean isBool, int fontSize) throws Exception {
		font.setFontName("Times New Roman");
		font.setBold(isBool);
		font.setFontHeightInPoints((short) fontSize);
	}
}
	

