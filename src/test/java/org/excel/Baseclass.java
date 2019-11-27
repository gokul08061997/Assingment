package org.excel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {

	static WebDriver driver;
	public static void launch(String url) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\MaventestProject\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
	}
	
	public static String data(int rowno, int colno) throws IOException {
		String value = null;
		File loc = new File("C:\\Users\\GovindRaj\\eclipse-workspace-gokul-selenium\\MaventestProject\\excel file\\excel.xlsx");
		FileInputStream stream = new FileInputStream(loc);
		Workbook w = new XSSFWorkbook(stream);
		Sheet s = w.getSheet("sheet1");
		Row r = s.getRow(rowno);
		Cell c = r.getCell(colno);
	    int type = c.getCellType();
	    
	    if(type==1)
	    {
	    	value=c.getStringCellValue();
	    }
		return value;
	    

	    }
	
	public static void send(WebElement e , String s) {
		e.sendKeys(s);
	}
	
	public static  void click(WebElement c) {
	
		c.click();
	}
	
	public static void windowHandle() {
		String l = driver.getWindowHandle();
		System.out.println(l);
		
		Set<String> windowHandles = driver.getWindowHandles();
		System.out.println(windowHandles);
		
		for (String string : windowHandles) {
			
			if(!(l.equals(string)))
				
				driver.switchTo().window(string);
	}

	}
	
}
	
	
	

