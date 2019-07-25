package com.is.automation.test;

import java.util.concurrent.TimeUnit;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Calendar;
import java.util.Date;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.logging.Logger;

public class CustomLibarary extends Locators

{
	private final static Logger LOGGER = Logger.getLogger(CustomLibarary.class.getName());

	public static void startBrowser(String url) {
		getDriver().get(url);
		getDriver().manage().window().maximize();

	}

	public static void openLinkinNewTab(By locator, String attributeName) {

		String url = ((WebElement) getDriver().findElements(locator)).getAttribute(attributeName).trim();

		String selectLinkOpeninNewTab = Keys.chord(Keys.CONTROL, Keys.RETURN);
		driver.findElement(By.linkText(url)).sendKeys(selectLinkOpeninNewTab);

	}
	
	
	public static String generateRandomString()
	{
		
		String randomString = RandomStringUtils.randomAlphabetic(20);
		
		return randomString;
	}
	
	public static String currentDateTime()
	{
		
		Calendar calendar = Calendar.getInstance();
		
		Date currentDateTime ;
		currentDateTime = calendar.getTime();
		
		return currentDateTime.toString().trim();		
	}
	
	
	public static void ifStoreNameExists(By locator , String storeName)
	{
		if(getDriver().findElement(locator).isDisplayed())
		{
			String NewStoreName = storeName + RandomStringUtils.randomAlphabetic(5);
			 clearAndSend(shopifyPartner_input_StoreName, NewStoreName);
		}
		
		
	}
	
	
	public static void verifyRadioButtonIsSelected(By locator)
	{
		
		
		if(getDriver().findElement(locator).isSelected()==true)
		{
		LOGGER.info("Radio Button is selected");
		}
		
		else
		{
			
			LOGGER.info("Radio Button is Not selected");
		}
	}

	public Set<String> getAllURLs() {
		Set<String> urlSet = new HashSet<String>();

		List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		System.out.println("Link Size "+allLinks.size());
		
		

		for (int i = 0; i < allLinks.size(); i++) {
			for (WebElement link : allLinks) 
			{
				if (link.getText().equalsIgnoreCase("high res") || link.getText().equalsIgnoreCase("high"))
					urlSet.add(link.getAttribute("href"));
				
			}
			
		}
		System.out.println(urlSet);
		System.out.println();
		return urlSet;

	}
	
	
	public Set<String> getAllURLs1() {
		Set<String> urlSet = new HashSet<String>();

		List<WebElement> Allitem = driver.findElements(By.className("item"));
		
		
		
		for (int i = 1; i <=Allitem.size(); i++)
		{
			WebElement sku = driver.findElement(By.xpath("(//p[@class='item'])["+i+"]"));
			String[] temp = null;
			String[] temp2 = null;
			String x;
			
			String bodyText = sku.getText();
			if(bodyText.contains("no image available")|| bodyText.contains("no picture available"))
			{
				continue;
				
			
			}
			WebElement url = driver.findElement(By.xpath("(//p[@class='item'])["+i+"]//a"));
			
			if(url.getText().equalsIgnoreCase("high") || url.getText().equalsIgnoreCase("high res")  )
			{
				
				
				temp = sku.getText().split(" ");
				temp2 = temp[0].split("\\r?\\n");
				x = temp2[0].replace(" ", ",");
				
				//System.out.println("Value of X " + x);	
			System.out.println(x +" ,"+url.getAttribute("href"));
			//System.out.println(sku.getText().replaceAll("[^0-9.]", "")+","+url.getAttribute("href"));
			
			}
			
			
		}
		return urlSet;
	}
	

	public static void clearAndSend(By locator, String key)

	{
		WebDriver getDriver = getDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement element = getDriver.findElement(locator);
		element.clear();
		element.sendKeys(key);
	}
	
	public static void selectFromDropDown(String option , By locator )
	{
		
		
		Select dropdown = new Select(getDriver().findElement(locator));
		dropdown.selectByVisibleText(option);
		
		
	}

	public static void waitTillElementAppears(By locator)

	{

		try {
			WebElement arg9999 = (WebElement) (new WebDriverWait(getDriver(), 10L))
					.until(ExpectedConditions.visibilityOfElementLocated(locator));
		} catch (Exception arg5) {
			System.out.println("Exception logs: " + arg5);
		}
		
		
	}

	public static void waitElementclickable(By locator) {
		new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(locator));

	}

	public static void click(By locator)

	{
		driver.findElement(locator).click();
	}

	public static void verifyTextExistsOnElement(By locator, String text)

	{
		String textonElement = driver.findElement(locator).getText();
		verifyText(textonElement, text);

	}

	public static String gettextOnLocator(By locator)

	{
		String textonElement = driver.findElement(locator).getText();
		return textonElement;
	
	}
	
	public static void switchToAnotheTab(int tabsize)
	{
		 ArrayList tabs = new ArrayList (getDriver().getWindowHandles());
		    System.out.println(tabs.size());
		getDriver().switchTo().window((String) tabs.get(tabsize));
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
	}
	
	
	
	public static boolean verifyText(String text1, String text2)

	{
		if (text1.contentEquals(text2)) {
			LOGGER.info("Both Strings are equal");
			return true;
		}

		else {

			LOGGER.info("Both Strings are not equal");
			return false;
		}

	}

	public static void verifyTextContainsOnElement(By locator, String text)

	{
		String textonElement = driver.findElement(locator).getText();
		verifyText(textonElement, text);

	}

	public static boolean verifyTextContains(String text1, String text2)

	{
		if (text1.contains(text2)) {
			LOGGER.info("text is available");
			return true;
		}

		else {

			LOGGER.info("Text not found");
			return false;
		}

	}
	
	
	public static int getIntFromString(String text)
	{
		String textNumber = text.replaceAll("[^0-9.]", "");
		int number = Integer.parseInt(textNumber);
		return number;
		
	}

	public static void pressEnter(By locator) {
		WebDriver getDriver = getDriver();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebElement element = getDriver.findElement(locator);
		element.sendKeys(Keys.ENTER);

	}
	
	public static void openNewTab(String newUrl) {
		
		((JavascriptExecutor) getDriver()).executeScript("window.open();", new Object[0]);
		switchToAnotheTab(1);
		getDriver().get(newUrl);
	
	}

	public static void clearCookies() {
		getDriver().manage().deleteAllCookies();

	}

	public static void selecRadioButton(By locator) {
		WebDriver getDriver = getDriver();
		WebElement element = getDriver.findElement(locator);
		element.clear();
		if (element.isEnabled() == false) {
			click(locator);

		}
	}

	public static void handleCaptcha(By locator)

	{

		WebDriver getDriver = getDriver();
		WebElement element = getDriver.findElement(locator);
		if (element.isDisplayed()) {
			getDriver().manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		}
	}

	public void getCookies() {
		getDriver();
		File file = new File("Cookies.data");
		try {
			// Delete old file if exists
			file.delete();
			file.createNewFile();
			FileWriter fileWrite = new FileWriter(file);
			BufferedWriter Bwrite = new BufferedWriter(fileWrite);
			// loop for getting the cookie information

			// loop for getting the cookie information
			for (Cookie ck : driver.manage().getCookies()) {
				Bwrite.write((ck.getName() + ";" + ck.getValue() + ";" + ck.getDomain() + ";" + ck.getPath() + ";"
						+ ck.getExpiry() + ";" + ck.isSecure()));
				Bwrite.newLine();
			}
			Bwrite.close();
			fileWrite.close();

		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	void staticWait() throws InterruptedException {
		
		Thread.sleep(5000);
		

	}

	void loginInventorySource(String userName, String passWord) {
		waitTillElementAppears(placeHolder_Login_UserName);

		clearAndSend(placeHolder_Login_UserName, userName);
		clearAndSend(placeHolder_Login_Password, passWord);
		waitElementclickable(button_Login_Login);
		click(button_Login_Login);
		waitTillElementAppears(Homepage_loginName);
		verifyTextExistsOnElement(Homepage_loginName, userName);

	}

}
