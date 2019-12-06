package com.stepdefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.helper.Base;
import com.pagemanager.PageObjectManger;
import com.pages.Order;
import com.pages.Page;
import com.pages.PageBook;
import com.pages.PageSelect;
import com.pages.PaseSearch;

import cucumber.api.java.en.*;



public class LoginPageStep extends Base{
	WebDriver driver;
	PageObjectManger singleT;
	
	@Given("User is on Adactin Hotels homepage")
	public void user_is_on_Adactin_Hotels_homepage() {
		LaunchBrowser();
		loadUrl("http://adactin.com/HotelApp/");
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String s1, String s2) {
		singleT = new PageObjectManger();
		fill( singleT.getPage().getIstTxtUserName().get(0),s1);
		fill(singleT.getPage().getIstTxtpassword().get(0),s2);
	    //Assert.assertEquals("Verify username", s1,getTextByAttributeName(Loginpage.getIstTxtUserName().get(0)));
	   // Assert.assertEquals("Verify password", s2,getTextByAttributeName(Loginpage.getIstTxtpassword().get(0)));


	}

	@When("Click the login button")
	
	public void click_the_login_button() {
		btnClick(singleT.getPage().getIstBtnLogin().get(0));
	    
	}

	@Then("Verify the login")
	public void verify_the_login() {
		Assert.assertTrue("verify the login url",getUrl().contains("HotelApp"));
		
	   
	    
	}
	@Given("User is on Adactin search hotel page")
	public void user_is_on_Adactin_search_hotel_page() {
	 
	}

	@When("User enters {string},{string},{string},{string},{string} and {string}")
	public void user_enters_and(String s1, String s2, String s3, String s4, String s5, String s6) {
		singleT = new PageObjectManger();
		fill(singleT.getPaseSearch().getSrcLocation().get(0), s1);
		fill(singleT.getPaseSearch().getSrcHotels().get(0), s2);
		fill(singleT.getPaseSearch().getSrcRoomType().get(0), s3);
		fill(singleT.getPaseSearch().getSrcNumOfRoom().get(0), s4);
		fill(singleT.getPaseSearch().getSrcAdultRoom().get(0), s5);
		fill(singleT.getPaseSearch().getSrcChildRoom().get(0), s6);
		
	    
	}

	@When("Click the search button")
	public void click_the_search_button() {
		
		btnClick(singleT.getPaseSearch().getbtnSubmit().get(0));
	}

	@Then("Validate the search option")
	public void validate_the_search_option() {
	   
	}
	@Given("User is on Select Page")
	public void user_is_on_Select_Page() {
	   
	}

	@When("Select the Hotel")
	public void select_the_Hotel() {
		singleT = new PageObjectManger();
	   btnClick(singleT.getPageSelect().getBtnRadio().get(0));
	}

	@Then("Verify and continue")
	public void verify_and_continue() {
		btnClick(singleT.getPageSelect().getBtnContinue().get(0));
	    
	}
	
@Given("User is on Adactin booking page")
public void user_is_on_Adactin_booking_page() {
   
}

@When("User enters {string},{string},{string} and {string}")
public void user_enters_and(String s1, String s2, String s3, String s4) {
	singleT = new PageObjectManger();
    fill(singleT.getPageBook().getFirName().get(0), s1);
    fill(singleT.getPageBook().getLasName().get(0), s2);
    fill(singleT.getPageBook().getBillAddress().get(0), s3);
    fill(singleT.getPageBook().getCcNo().get(0), s4);
    
}

@When("User enter {string},{string},{string} and {string}")
public void user_enter_and(String s5, String s6, String s7, String s8) {

	fill(singleT.getPageBook().getCcType().get(0),s5);
	fill(singleT.getPageBook().getCcMnth().get(0),s6);
	fill(singleT.getPageBook().getCcYear().get(0),s7);
	fill(singleT.getPageBook().getCcvNum().get(0),s8);
	  
}

@Then("Click the book option")
public void click_the_book_option() {
	btnClick(singleT.getPageBook().getbtnBookHotel().get(0));
	
	
}

@Given("User is on final page")
public void user_is_on_final_page() {
   
}

@Then("Print the confirmation number")
public void print_the_confirmation_number() throws InterruptedException {
	singleT = new PageObjectManger();
    Thread.sleep(5000);
    String BookNum = singleT.getOrder().getConNo().get(0).getAttribute("value");
    System.out.println("Booking number is "+BookNum);
    
   quitBrowser();
}
    
    
}








