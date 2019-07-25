package com.is.automation.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SelectASIN extends CustomLibarary	   
{
  @Test
  public void login() throws InterruptedException 
  {
	String url = "https://admin.inventorysource.com"; 
	String userName = "amandeep.singh@inventorysource.com";
	String passWord =  "Tester#321";
	String remaingitems = null;
  	startBrowser(url);
  	loginInventorySource(userName, passWord);
  	waitElementclickable(sideBar_link_Products);
  	click(sideBar_link_Products);
  	
  	
  
  	
  	waitTillElementAppears(sideBar_link_ProductSearch);
  	waitElementclickable(sideBar_link_ProductSearch);
  	click(sideBar_link_ProductSearch);
  	
  	waitTillElementAppears(sideBar_Link_asin);
  	click(sideBar_Link_asin);
	staticWait();
	waitTillElementAppears(asin_header);
	verifyTextExistsOnElement(asin_header, "ASIN Tools");
	staticWait();
	remaingitems = gettextOnLocator(asin_remainItems);
	
	
	for(int i = 0;i<getIntFromString(remaingitems);i++)
	{
	staticWait();
	//waitElementclickable(asin_newButton);
	//waitTillElementAppears(url_BottleSpices);
	click(asin_newButton);
	//staticWait();
	}
  	
  	
  	
}
}