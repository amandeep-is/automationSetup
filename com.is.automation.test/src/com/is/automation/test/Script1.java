package com.is.automation.test;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class Script1 extends CustomLibarary	   
{
  @Test
  public void login() 
  {
	String url = "https://admin.inventorysource.com"; 
	String userName = "amandeep.singh@inventorysource.com";
	String passWord =  "Tester#321";

  	startBrowser("https://admin.inventorysource.com");
  	waitTillElementAppears(placeHolder_Login_UserName);
   
  	clearAndSend(placeHolder_Login_UserName, userName);
  	clearAndSend(placeHolder_Login_Password, passWord);
  	
  	waitElementclickable(button_Login_Login);
  	click(button_Login_Login);
  	
  	waitTillElementAppears(heading_homepage_searchUsers);
  	verifyTextExistsOnElement(heading_homepage_searchUsers, "Search Users");
  	waitTillElementAppears(heading_homepage_searchUsers);
  	
  	clearAndSend(input_homepage_searchUsers, "1201792");
  	pressEnter(input_homepage_searchUsers);
  	
  	waitTillElementAppears(heading_userPage_UID);
	 verifyTextContainsOnElement(heading_userPage_UID, userName);
	 
	  
  }
  @BeforeClass
  public void beforeClass() {
  }

  @AfterClass
  public void afterClass() 
  {
	  //driver.quit();
	  
  }

}
