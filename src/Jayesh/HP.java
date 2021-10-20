package Jayesh;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HP {
public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
FileInputStream file=new FileInputStream("D:\\Pegasus-Project\\sm.xlsx\\");
				
String value = WorkbookFactory.create(file).getSheet("Sheet1").getRow(2).getCell(1).getStringCellValue();
				
System.out.println(value);
			
  }

}
