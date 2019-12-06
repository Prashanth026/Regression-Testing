package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class PageSelect extends Base{
	
	public PageSelect() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "radiobutton_0")
	private List<WebElement> btnRadio;
		
	@FindBy(id = "continue")
	private List<WebElement> btnContinue;

	public List<WebElement> getBtnRadio() {
		return btnRadio;
	}

	public List<WebElement> getBtnContinue() {
		return btnContinue;
	}

	}



