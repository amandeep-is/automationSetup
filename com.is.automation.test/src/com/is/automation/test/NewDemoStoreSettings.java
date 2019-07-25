package com.is.automation.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class NewDemoStoreSettings extends CustomLibarary {
  @Test
  public void createDemoStoreSetting() throws InterruptedException 
  {
	  
	  String isUserName = "amandeep.singh@inventorysource.com";
	  String isPassword = "Tester#321";
	  String UID = "1201792";
	  String adminUrl = "https://admin.inventorysource.com/";
	  String StoreName = "RSR";
	  
	  startBrowser(adminUrl);
	  loginInventorySource(isUserName, isPassword);
	  clearAndSend(input_homepage_searchUsers, "1201792");
	  	pressEnter(input_homepage_searchUsers);
	  	
	  	waitTillElementAppears(heading_userPage_UID);
		 verifyTextContainsOnElement(heading_userPage_UID, isUserName);
		 waitTillElementAppears(click_UID3rdPartyApps);
		 click(click_UID3rdPartyApps);
		 
		 String url = "https://"+gettextOnLocator(thirdrdParty_table_URL);
		 String token = gettextOnLocator(thirdrdParty_table_token);
		 String email = gettextOnLocator(thirdrdParty_table_email);
		 
		 click(button_stores);
		 
		 click(admin_AddStore);
		 waitTillElementAppears(addStore_SelectMarket);
		 selectFromDropDown("Shopify (legacy)" , addStore_SelectMarket);
		 selectFromDropDown("Active" , addStore_StoreStatus);
		 
		 clearAndSend(addStore_StoreName, StoreName);
		 clearAndSend(addStore_StoreURL, url);
		 clearAndSend(addStore_StoreAdminURL, url+"/admin");
		 clearAndSend(addStore_StoreLogin,email );
		 clearAndSend(addStore_StorePassword, "demostore3");
		 clearAndSend(addStore_DataBasePassword , token);
		 
		 click(addStore_Button_add);
	  
	  
	  
	  
	  
  }
}
