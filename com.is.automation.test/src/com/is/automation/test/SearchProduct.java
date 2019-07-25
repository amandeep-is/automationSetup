package com.is.automation.test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class SearchProduct extends CustomLibarary	   
{
  @Test
  public void login() 
  {
	String url = "https://admin.inventorysource.com"; 
	String userName = "amandeep.singh@inventorysource.com";
	String passWord =  "Tester#321";

  	startBrowser(url);
  	loginInventorySource(userName, passWord);
  	waitElementclickable(sideBar_link_Products);
  	click(sideBar_link_Products);
  	
  	//staticWait(5);
  	
  	waitTillElementAppears(sideBar_link_ProductSearch);
  	waitElementclickable(sideBar_link_ProductSearch);
  	click(sideBar_link_ProductSearch);
  	
  	waitTillElementAppears(ProductSearch_Heading_skuLookUp);
  	verifyTextExistsOnElement(ProductSearch_Heading_skuLookUp, "SKU Lookup");
  	
  	clearAndSend(ProductSearch_Input_SKU, "DMD15303bv-pkg");
  	pressEnter(ProductSearch_Input_SKU);
  	
  	
  	
  	
  	
	 
	  
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
