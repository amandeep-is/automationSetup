package com.is.automation.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

public class CreateNewShopifyStore extends CustomLibarary {
  @Test 
  public void createNewShopifyStore() 
  {
	 
	  String url = "https://www.shopify.in/partners";
	  String email = "integrations@inventorysource.com";
	  String password = "Aut0Inventory!";
	  
	  String isUserName = "amandeep.singh@inventorysource.com";
	  String isPassword = "Tester#321";
	  String adminUrl = "https://admin.inventorysource.com/";
	  
	  
	  String storeName = "RSR_Latest"+currentDateTime();
	  String StorePassword = "demostore3";
	  startBrowser(url);
	 
	  waitTillElementAppears(shopifyPartner_login_button);
	  click(shopifyPartner_login_button);
	  waitElementclickable(shopifyPartner_email_login);
	  clearAndSend(shopifyPartner_email_login, email);
	  waitElementclickable(shopifyPartner_login_next);
	  click(shopifyPartner_login_next);
	  
	  getDriver().manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
	  
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
	  
	  waitTillElementAppears(shopifyPartner_input_StoreName);
	  clearAndSend(shopifyPartner_input_StoreName, storeName);
	  
	  clearAndSend(shopifyPartner_input_Password, StorePassword);
	  clearAndSend(shopifyPartner_input_Confirm_Password, StorePassword);
	  
	  //ifStoreNameExists(shopifyPartner_Error_SameNameExists, storeName);
	  click(shopifyPartner_Button_Save);
	  
	  getDriver().manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  waitTillElementAppears(shopifyPartner_Error_OnlineStore);
	  click(shopifyPartner_APPS);
	  waitElementclickable(shopifyPartner_link_vistAPPShopifyPage);
	  click(shopifyPartner_link_vistAPPShopifyPage);
	  switchToAnotheTab(1);
	  waitTillElementAppears(shopifyPartner_input_searchAPP);
	  clearAndSend(shopifyPartner_input_searchAPP, "Inventory Source");
	  pressEnter(shopifyPartner_input_searchAPP);
	  waitElementclickable(shopifyPartner_inventorySource_APP);
	  click(shopifyPartner_inventorySource_APP);
	  waitElementclickable(shopifyAppStore_Button_AddApp);
	  click(shopifyAppStore_Button_AddApp);
	  waitElementclickable(shopifyAppStore_Button_InstallApp);
	  click(shopifyAppStore_Button_InstallApp);
	  waitElementclickable(shopifyAppStore_Button_Login);
	  click(shopifyAppStore_Button_Login);
	  waitTillElementAppears(shopifyAppStore_Button_ISLogin);
	  clearAndSend(shopifyAppStore_Button_ISLogin, isUserName);
	  clearAndSend(placeHolder_Login_Password, isPassword);
	  click(button_Login_Login);
	  
	  openNewTab(adminUrl);
	  loginInventorySource(isUserName, isPassword);
	  clearAndSend(input_homepage_searchUsers, "1201792");
	  pressEnter(input_homepage_searchUsers);
	  waitTillElementAppears(click_UID3rdPartyApps);
	  click(click_UID3rdPartyApps);
	  
	  
	  switchToAnotheTab(0);
	  waitTillElementAppears(shopifyPartner_Error_OnlineStore);
	  click(shopifyPartner_Error_OnlineStore);
	  waitTillElementAppears(shopifyPartner_preferences);
	  click(shopifyPartner_preferences);
	  waitTillElementAppears(shopifyPartner_DisablePassword);
	  click(shopifyPartner_DisablePassword);
	  
	  
	  
	  
  }
}
