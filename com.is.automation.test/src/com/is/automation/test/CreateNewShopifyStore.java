package com.is.automation.test;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class CreateNewShopifyStore extends CustomLibarary {
  @Test 
  public void createNewShopifyStore() 
  {
	 
	  String url = "https://www.shopify.in/partners";
	  String email = "integrations@inventorysource.com";
	  String password = "Aut0Inventory!";
	  startBrowser(url);
	  clearCookies();
	  waitTillElementAppears(shopifyPartner_login_button);
	  click(shopifyPartner_login_button);
	  waitElementclickable(shopifyPartner_email_login);
	  clearAndSend(shopifyPartner_email_login, email);
	  waitElementclickable(shopifyPartner_login_next);
	  click(shopifyPartner_login_next);
	  clearCookies();
	  
	 // getDriver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	  
	  waitTillElementAppears(shopifyPartner_passowrd_next);
	  clearAndSend(shopifyPartner_passowrd_next, password);
	  waitElementclickable(shopifyPartner_login_next);
	  click(shopifyPartner_login_next);
	  waitTillElementAppears(shopifyPartner_partnerAccount);
	  click(shopifyPartner_partnerAccount);
	  
	  waitElementclickable(shopifyPartner_stores);
	  click(shopifyPartner_stores);
	  
	  waitTillElementAppears(shopifyPartner_addStore);
	  click(shopifyPartner_addStore);
	  
	  waitTillElementAppears(shopifyPartner_addStore_devStore);
	  click(shopifyPartner_addStore_devStore);
	  
	  
  }
}
