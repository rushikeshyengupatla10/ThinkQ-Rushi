package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
public class FileReadAndWriteExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
        //for getting data from excel
		FileInputStream fis = new FileInputStream("G:\\TestCaseData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);	
		Sheet s = wb.getSheet("Sheet1");
		Row r = s.getRow(1);
		String username = r.getCell(0).getStringCellValue();
		String password = r.getCell(1).getStringCellValue();
		System.out.println(username);
		System.out.println(password);
		
		//for writting date in excel we have open file first using FileInputStream
		r = s.getRow(1);
		Cell cel = r.createCell(3);
		cel.setCellType(CellType.STRING);
		FileOutputStream fos = new FileOutputStream("G:\\\\TestCaseData.xlsx");
		cel.setCellValue("Java");
		wb.write(fos);
		wb.close();
		
	}

}