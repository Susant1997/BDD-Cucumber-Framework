package org.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		
		static String attribute;
		static String value;
		static WebDriver driver;
		static WebElement element;
		
		public static  void urlLaunch(String url) {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			driver.get(url);

		}
		
		public static void maximize() {
			driver.manage().window().maximize();

		}
		
		public static void findElement(String xpath) {
			element = driver.findElement(By.xpath(xpath));

		}
		public static void sendKeys(String text) {
			element.sendKeys(text);

		}
		
		public static void clicks() {
			element.click();
		}
		
		public static void clear() {
			element.clear();
		}
		
		public static void selectByVisibilText(String text) {
			Select s = new Select(element);
			s.selectByVisibleText(text);

		}
		
		public static void selectByvalue(String text) {
			Select s = new Select(element);
			s.selectByValue(text);

		}
		
		public static void selectByIndex(String text) {
			Select s = new Select(element);
			s.selectByIndex(0);

		}
		
		public static void takesScreenShot() throws IOException {
			
			TakesScreenshot src = (TakesScreenshot)driver ;
			File f = src.getScreenshotAs(OutputType.FILE);
			File d = new File("C:\\Users\\susan\\OneDrive\\Pictures\\Saved Pictures\\book2.jpg");
			FileUtils.copyFile(f, d);
		
		}
		
		public static String getAttributes() {
			attribute = element.getAttribute("value");
			System.out.println(attribute);
			return attribute;
		}
		
		public static void quit() {
			 driver.quit();
		}
		
		
		
		
		
		
		
		
	
	public static String excelRead (int rowNo, int cellNo) throws IOException  {
		
		File f = new File("C:\\Users\\susan\\eclipse-workspace\\TestCucumber\\data\\Data2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sh = wb.getSheet("Sheet1");
		Row r = sh.getRow(rowNo);
		Cell c = r.getCell(cellNo);
		
		
		int cellType = c.getCellType();
		// Type ==1 - String
		// Type ==0 - Integer
		if (cellType==1) {
			
			 value = c.getStringCellValue();
		}
		
		if (cellType==0) {
			
			if (DateUtil.isCellDateFormatted(c)) {
				Date date = c.getDateCellValue();
				SimpleDateFormat dateformate = new SimpleDateFormat("dd/MM/yy");
				value = dateformate.format(date);
				
			}
			
			else {
				double d = c.getNumericCellValue();
				long l = (long)d;
				value = String.valueOf(l);
			}
			
		}
		return value;
		
	}
	
	
	
	public static void writeExcel(int rowNo, int cellNo1) throws IOException
	{
		File f = new File("C:\\Users\\susan\\eclipse-workspace\\TestCucumber\\data\\Data2.xlsx");
		FileInputStream fi = new FileInputStream(f);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet s = wb.getSheet("Sheet1");
//		Row r = s.createRow(rowNo);
		Row r = s.getRow(rowNo);
		Cell c1 = r.createCell(cellNo1);
		c1.setCellValue(attribute);
//		Cell c2 = r.createCell(cellNo2);
//		c2.setCellValue(value2);
//		Cell c3 = r.createCell(cellNo3);
//		c3.setCellValue(value3);
		FileOutputStream fo = new FileOutputStream(f);
		wb.write(fo);
	}
}
