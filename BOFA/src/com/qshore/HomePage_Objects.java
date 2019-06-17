package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage_Objects {
	
	public @FindBy(xpath="//input[@name='userName']") WebElement home_uid;
	public @FindBy(xpath="//input[@name='password']") WebElement home_pwd;
	public @FindBy(xpath="//input[@name='login']") WebElement home_login;

}
