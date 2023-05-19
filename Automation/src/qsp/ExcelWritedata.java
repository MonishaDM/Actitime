package qsp;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelWritedata {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
	FileInputStream fis = new FileInputStream("./data/testscript1.xlsx");	
	Workbook wb = WorkbookFactory.create(fis);
	wb.getSheet("CreateCustomer").getRow(1).getCell(1).setCellValue("admin");
	FileOutputStream fos = new FileOutputStream("./data/testscript1.xlsx");
	wb.write(fos);
	wb.close();
	

	}

}
