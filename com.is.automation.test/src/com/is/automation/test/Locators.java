package com.is.automation.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators 
{
	public static WebDriver driver = new ChromeDriver();;
	public static WebDriver getDriver()
	{
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--incognito");
		System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
		
		
    	return driver;
    	
    	
		
	}
	
	
	static By placeHolder_Login_UserName= By.xpath("//input[@placeholder='username / email']") ;
	static By placeHolder_Login_Password= By.xpath("//input[@placeholder='Password']") ;
	static By button_Login_Login = By.xpath("//span[@class='ladda-label']");
	static By heading_homepage_searchUsers = By.xpath("//h2[contains(text(),'Search Users')]");
	
	static By input_homepage_searchUsers = By.xpath("//input[@name='jump_to_uid']");
	static By click_homepage_searchUsers = By.xpath("//input[@name='jump_to_uid']");
	
	static By heading_userPage_UID = By.xpath("//h2[@class='ng-binding' and contains(text(),'@inventorysource')]");
	static By sideBar_link_Products = By.xpath("//span[@class='nav-label' and contains (text(),'Products')]");

	static By sideBar_link_ProductSearch = By.xpath("//a[@href='#/products/search']");

	static By ProductSearch_Heading_skuLookUp= By.xpath("//h2[@class='col-xs-3' and contains(text(),'SKU Lookup')]");
	static By ProductSearch_Input_SKU= By.xpath("//input[@placeholder= '(required)']");
	static By Homepage_loginName= By.xpath("//a[@class='ng-binding dropdown-toggle']");
	
	
	
	
	
	
	
	//shopify
	
	static By shopifyPartner_login_button= By.xpath("//li//a[@class='marketing-nav__item marketing-nav__item--user' and contains(text(),'Log in')]");
	static By shopifyPartner_email_login= By.xpath("//input[@class='next-input type-ahead-input email-typo-input']");
	static By shopifyPartner_login_next= By.xpath("//button[@class='ui-button ui-button--primary ui-button--size-large  captcha__submit']");
	static By shopifyPartner_passowrd_next= By.xpath("//input[@class='ui-password__input next-input js-password-input  ui-password--feedback']");
	static By shopifyPartner_partnerAccount= By.xpath("//span[@class=\"text-with-icon__text type--bold\" and contains(text(),'Inventory Source') ]");
	static By shopifyPartner_stores= By.xpath("//span[@class='ui-nav__label ui-nav__label--parent'and contains(text(),'Store')]");
	static By shopifyPartner_addStore= By.xpath("//div[@class='ui-title-bar__actions-group']//a[@class='ui-button ui-button--primary ui-title-bar__action' and contains(text(),'Add store')]");
	static By shopifyPartner_addStore_devStore= By.id("//input[@name='ChoiceList2' and @value = 'dev_store']");

	static By shopifyPartner_captcha = By.xpath("//div[@class='rc-anchor rc-anchor-normal rc-anchor-light']");






}
