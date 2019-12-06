package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class Order extends Base{
	
	public Order() {
		PageFactory.initElements(driver,this);
	}

	@FindBy(id = "order_no")
	private List<WebElement> ConNo;

	public List<WebElement> getConNo() {
		return ConNo;
	}
}
