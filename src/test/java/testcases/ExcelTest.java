package testcases;

import org.testng.annotations.Test;

import base.TestBase;
import util.TestExcelReading;

public class ExcelTest extends TestBase{
	TestExcelReading testExcel;
	
	@Test
	public void TestExcel() {
		testExcel=new TestExcelReading();
		System.out.println("Read All Excel Content");
		testExcel.PrintExcel("LoginData");
		System.out.println("Read Excel cell");
		testExcel.readExcel("LoginData", 2, 2);
		
		System.out.println("Excel Column COunt="+testExcel.CountExcelColumn("LoginData"));
		System.out.println("Excel Row COunt="+testExcel.CountExcelRow("LoginData"));
		
		
		
		
	}
	
	
}
