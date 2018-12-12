package util;

import org.testng.annotations.Test;

import base.TestBase;

public class TestExcelReading extends TestBase{


	public void readExcel(String worksheet, int cNum,int rNum)
	{
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\util\\GoogleLoginNew.xlsx";
		Xls_Reader xls= new Xls_Reader(filePath);
		String Value=xls.getCellData(worksheet, cNum, rNum);
		System.out.println("****Excel value***"+Value);
		
	}

	public int CountExcelRow(String worksheet)
	{
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\util\\GoogleLoginNew.xlsx";
		Xls_Reader xls= new Xls_Reader(filePath);
		int rows = xls.getRowCount(worksheet);
		return rows;
	}
	public int CountExcelColumn(String worksheet)
	{
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\util\\GoogleLoginNew.xlsx";
		Xls_Reader xls= new Xls_Reader(filePath);
		int cols = xls.getColumnCount(worksheet);
		return cols;
	}

	public void PrintExcel(String worksheet)
	{
		String filePath = System.getProperty("user.dir")+"\\src\\main\\java\\util\\GoogleLoginNew.xlsx";
		Xls_Reader xls= new Xls_Reader(filePath);
		int rows1 = xls.getRowCount(worksheet);
		int cols1 = xls.getColumnCount(worksheet);
		Object[][] data = new Object[rows1-1][cols1];
		for (int rNum = 2; rNum <= rows1; rNum++) {
			for (int cNum = 0; cNum < cols1; cNum++) 
			{
				System.out.print(xls.getCellData("LoginData", cNum, rNum)+" ");
				//System.out.println(xls.getCellData("LoginData", cNum, rNum));
				data[rNum-2][cNum]=xls.getCellData("LoginData", cNum, rNum);
			}
			System.out.println();
		}
	}
}