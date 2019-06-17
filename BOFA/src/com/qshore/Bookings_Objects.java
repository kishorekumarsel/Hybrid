package com.qshore;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Bookings_Objects {
	public @FindBy(xpath="//input[@value='oneway']") WebElement bookings_oneway;
	public @FindBy(xpath="//select[@name='passCount']") WebElement bookings_passengerscount;
	public @FindBy(xpath="/html/body/div/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img") WebElement loadimage;

}
