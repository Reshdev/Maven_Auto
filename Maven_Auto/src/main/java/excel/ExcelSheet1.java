package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelSheet1 {
	public static FileInputStream f;
	public static XSSFWorkbook w;
	public static XSSFSheet s;
	
	public static String display(int i, int j) throws IOException
	{
		f=new FileInputStream ("C:\\Users\\excelsheet.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
		
	}
	public static long print(int i, int j) throws IOException
	{
		f=new FileInputStream ("C:\\Users\\excelsheet.xlsx");
		w= new XSSFWorkbook(f);
		s= w.getSheet("Sheet1");
		Row r=s.getRow(i);
		Cell c=r.getCell(j);
		return (long) c.getNumericCellValue();
	}

}
