package com.kishore;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.qshore.Bookings_Objects;
import com.qshore.HomePage_Objects;
import com.qshore.Methods;

public class Module1 {
	
	// Test Name : TC01
	// Test Script Name : TC01
	// Module Name : Module1
	// Project Name : BOFA
	// Author       : Kishore Kumar
	// Date         : 0615
	// Reviewed By  : Vishnu
	//***********************************************************
	public void TC01() throws Exception {
		// Importing Methods Class
		Methods m=new Methods();
		
		// Importing ExcelCon Method
		m.excelCon("C:\\Users\\User\\Desktop\\Hybrid\\Test Data\\kishore\\tc01.xls", "Sheet1");
		
		// Launching Application
		m.launchApp(m.s.getCell(0, 0).getContents(), "C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\launchapp.png");
		
		// Importing Page Objects
		HomePage_Objects homepage=PageFactory.initElements(m.driver, HomePage_Objects.class);
		
		//Verifying UID and Pwd available or not
		m.elementPresent(homepage.home_uid, true,"C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\uidavailable.png");
		m.elementPresent(homepage.home_pwd, true,"C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\pwdavailable.png");
		
		// Verifying UID and PWD enabled or not
		m.elementEnabled(homepage.home_uid, true, "C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\uidenabled.png");
		m.elementEnabled(homepage.home_pwd, true, "C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\pwdenabled.png");
		
		// Verifying title contains Welcome
		m.titleContains("Welcome", true);
		
		// Entering UID and PWD
		homepage.home_uid.sendKeys(m.s.getCell(0, 1).getContents());
		homepage.home_pwd.sendKeys(m.s.getCell(0, 2).getContents());
		
		// Verifying Sign in Enabled
		m.elementEnabled(homepage.home_login, true, "C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\loginenabled.png");
		// Verifying Number of Images
		m.elementsCount("img", 20, "C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\imgs.png");
		
		// Clicking On Sign IN
		homepage.home_login.click();
		
		// Importing Bookings page objects
		Bookings_Objects booking=PageFactory.initElements(m.driver, Bookings_Objects.class);
		
		// Waiting for Bookings Page to load
		WebDriverWait ww=new WebDriverWait(m.driver, 60);
		ww.until(ExpectedConditions.elementToBeClickable(booking.loadimage));
		
		// Verifying Round Trip and Oneway Radio
		m.elementPresent(booking.bookings_oneway, true, "C:\\Users\\User\\Desktop\\Hybrid\\Test Results\\kishore\\Module1\\tc01\\onewway.png");
		
		m.closeApp();}
	//********************************************************************************************

	
}
