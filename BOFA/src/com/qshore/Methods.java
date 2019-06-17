package com.qshore;

import java.io.File;
import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import jxl.Sheet;
import jxl.Workbook;

public class Methods {
	public WebDriver driver;
	public FileInputStream f;
	public Workbook wb;
	public Sheet s;
	
	// Method Name : launchApp
	// Description : To Launch Application
	// Author      : Kishore Kumar
	// Date Created: 0615
	//*********************************************************
	public void launchApp(String url, String sspath) throws Exception{
		driver=new FirefoxDriver();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(sspath));}
	//************************************************************************
	// Method Name : closeApp
	// Description : To Close Application
	// Author      : Kishore Kumar
	// Date Created: 0615
	//************************************************************************
	public void closeApp() {
		driver.close();
	}
	//***************************************************************************
	public void excelCon(String path, String sname) throws Exception {
		 f=new FileInputStream(path);
		 wb=Workbook.getWorkbook(f);
		 s=wb.getSheet(sname);
	}
	//************************************************************************
	public void elementPresent(WebElement element, boolean exp, String sspath) throws Exception {
		boolean a=element.isDisplayed();
		if(a==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//******************************************************************************
	public void elementsCount(String loc, int exp, String sspath) throws Exception {
		List<WebElement> elements=driver.findElements(By.tagName(loc));
		if(elements.size()==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}	
	}
	//***************************************************************************
	public void elementEnabled(WebElement element, boolean exp, String sspath) throws Exception {
		boolean a=element.isEnabled();
		if(a==exp)
		{
			System.out.println("Pass");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
		else
		{
			System.out.println("Fail");
			File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(f, new File(sspath));
		}
	}
	//********************************************************************************
	public void titleContains(String exp, boolean expvalue) {
		String title=driver.getTitle();
		if(title.contains(exp)==expvalue)
			System.out.println("Pass");
		else
			System.out.println("Fail");
	}
	//*******************************************************************************
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
