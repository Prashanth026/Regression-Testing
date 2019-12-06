package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class Page extends Base {
	public Page() {
		PageFactory.initElements(driver,this);
	} 
@FindBy (id = "username")
private List<WebElement> IstTxtUserName;

@FindBy (id = "password")
private List<WebElement> IstTxtpassword;

@FindBy (id = "login")
private List<WebElement> IstBtnLogin;


public List<WebElement> getIstTxtUserName() {
	return IstTxtUserName;
}

public List<WebElement> getIstTxtpassword() {
	return IstTxtpassword;
}

public List<WebElement> getIstBtnLogin() {
	return IstBtnLogin;
}


}

