package com.is.automation.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DownloadURL_ACTest extends CustomLibarary{

  @Test
  public void downloadURlTest() {
	  
	  List<String> allImages = new ArrayList<String>();
	  String url = "http://crc.frontiercoop.com/ac/products.html";
	  startBrowser(url);
	  Locators locators = new Locators();
	  List<By> byList = locators.GetAllUrlMapAC();
	  for(By urlBy : byList) {
		  click(urlBy);
		  String headName = getDriver().findElement(By.xpath("(//h1) [2]")).getText();
		  System.out.println(headName);
		  allImages.addAll(getAllURLs1());
		  getDriver().navigate().back();
		  waitTillElementAppears(url_essentialsOils);
	  }
	 
	  for(String str : allImages)
	  System.out.println(str);
	  
	  
	  
	  
	  
	  
  }
  
}
