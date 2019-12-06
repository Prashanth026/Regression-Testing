package com.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.helper.Base;

public class PaseSearch extends Base{
	
	public PaseSearch() {
		
		PageFactory.initElements(driver, this);
	}
	

	@FindBy (id = "location")
	private List<WebElement> SrcLocation;

	@FindBy (id = "hotels")
	private List<WebElement> SrcHotels;

	@FindBy (id = "room_type")
	private List<WebElement> SrcRoomType;

	@FindBy (id = "room_nos")
	private List<WebElement> SrcNumOfRoom;

	@FindBy (id = "adult_room")
	private List<WebElement> SrcAdultRoom;

	@FindBy (id = "child_room")
	private List<WebElement> SrcChildRoom;
	
	@FindBy (id = "Submit")
	private List<WebElement> btnSubmit;

public List<WebElement> getSrcLocation() {
	return SrcLocation;
}

public List<WebElement> getSrcHotels() {
	return SrcHotels;
}

public List<WebElement> getSrcRoomType() {
	return SrcRoomType;
}

public List<WebElement> getSrcNumOfRoom() {
	return SrcNumOfRoom;
}

public List<WebElement> getSrcAdultRoom() {
	return SrcAdultRoom;
}

public List<WebElement> getSrcChildRoom() {
	return SrcChildRoom;
}
public List<WebElement> getbtnSubmit() {
	return btnSubmit;
}
}
