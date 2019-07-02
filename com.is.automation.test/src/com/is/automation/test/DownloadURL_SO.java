package com.is.automation.test;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadURL_SO extends CustomLibarary {
	  @Test
	  public void downloadURl() 
	  {
		  
		  List<String> allImages = new ArrayList<String>();
		  String url = "http://crc.frontiercoop.com/so/products.html";
		  startBrowser(url);
		  Locators locators = new Locators();
		  List<By> byList = locators.GetAllUrlMap_SO();
		  for(By urlBy : byList) {
			  click(urlBy);
			  String headName = getDriver().findElement(By.xpath("(//h1) [2]")).getText();
			  System.out.println(headName);
			  allImages.addAll(getAllURLs1());
			  getDriver().navigate().back();
			  waitTillElementAppears(url_BottleSpices);
		  }
		 
		  
		  
		  
		  
		  
		  
	  }
	  
}
