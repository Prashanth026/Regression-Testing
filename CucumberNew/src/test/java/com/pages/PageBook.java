package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class PageBook extends Base{
	
	public PageBook() {
		PageFactory.initElements(driver, this);
	}

	@FindBy (id = "first_name")
	private List<WebElement> firName;
	
	@FindBy (id = "last_name")
	private List<WebElement> lasName;
	
	@FindBy (id = "address")
	private List<WebElement> BillAddress;
	
	@FindBy (id = "cc_num")
	private List<WebElement> CcNo;
	
	@FindBy (id = "cc_type")
	private List<WebElement> CcType;
	
	@FindBy (id = "cc_exp_month")
	private List<WebElement> CcMnth;
	
	@FindBy (id = "cc_exp_year")
	private List<WebElement> CcYear;
	
	@FindBy (id = "cc_cvv")
	private List<WebElement> CcvNum;
	
	@FindBy (id = "book_now")
	private List<WebElement> btnBookHotel;
	
	
public List<WebElement> getFirName() {
	return firName;
}

public List<WebElement> getLasName() {
	return lasName;
}

public List<WebElement> getBillAddress() {
	return BillAddress;
}

public List<WebElement> getCcNo() {
	return CcNo;
}

public List<WebElement> getCcType() {
	return CcType;
}

public List<WebElement> getCcMnth() {
	return CcMnth;
}

public List<WebElement> getCcYear() {
	return CcYear;
}

public List<WebElement> getCcvNum() {
	return CcvNum;
}

public List<WebElement> getbtnBookHotel() {
	return btnBookHotel;
}
}
