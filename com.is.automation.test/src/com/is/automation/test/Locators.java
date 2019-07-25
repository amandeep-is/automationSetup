package com.is.automation.test;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Locators 
{
	public static WebDriver driver = new ChromeDriver();
	
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
	
	static By click_UID3rdPartyApps = By.xpath("//div[contains(text(),'3rd Party Apps')]");
	
	
	static By heading_userPage_UID = By.xpath("//h2[@class='ng-binding' and contains(text(),'@inventorysource')]");
	static By sideBar_link_Products = By.xpath("//span[@class='nav-label' and contains (text(),'Products')]");

	static By sideBar_link_ProductSearch = By.xpath("//a[@href='#/products/search']");
	
	static By sideBar_Link_asin = By.xpath("//a[@href='#/products/asins']");

	static By asin_header= By.xpath("//h2[@class='col-xs-8']");
	static By asin_newButton= By.xpath("//button[@class='btn btn-warning' and @ng-click= 'saveAsin(next_asin.new_asin)']");
	static By ProductSearch_Heading_skuLookUp= By.xpath("//h2[@class='col-xs-3' and contains(text(),'SKU Lookup')]");
	static By ProductSearch_Input_SKU= By.xpath("//input[@placeholder= '(required)']");
	static By Homepage_loginName= By.xpath("//a[@class='ng-binding dropdown-toggle']");
	
	static By asin_remainItems= By.xpath("//span[@class='label label-warning ng-binding']");
	
	
	
	
	
	//shopify
	
	static By shopifyPartner_login_button= By.xpath("//li//a[@class='marketing-nav__item marketing-nav__item--user' and contains(text(),'Log in')]");
	static By shopifyPartner_email_login= By.xpath("//input[@class='next-input type-ahead-input email-typo-input']");
	static By shopifyPartner_login_next= By.xpath("//button[@class='ui-button ui-button--primary ui-button--size-large  captcha__submit']");
	static By shopifyPartner_passowrd_next= By.xpath("//input[@class='ui-password__input next-input js-password-input  ui-password--feedback']");
	static By shopifyPartner_partnerAccount= By.xpath("//span[@class=\"text-with-icon__text type--bold\" and contains(text(),'Inventory Source') ]");
	static By shopifyPartner_stores= By.xpath("//span[@class='ui-nav__label ui-nav__label--parent'and contains(text(),'Store')]");
	static By shopifyPartner_addStore= By.xpath("//div[@class='ui-title-bar__actions-group']//a[@class='ui-button ui-button--primary ui-title-bar__action' and contains(text(),'Add store')]");
	static By shopifyPartner_addStore_devStore= By.xpath("(//span[@class='Polaris-RadioButton__Backdrop'])[1]");
	static By shopifyPartner_input_StoreName= By.xpath("//input[@name='signup[shop_name]']");
	static By shopifyPartner_input_URL= By.xpath("//input[@name='storeDomain']");
	static By shopifyPartner_input_Password= By.xpath("//input[@name='signup[password]']");
	static By shopifyPartner_input_Confirm_Password= By.xpath("//input[@name='signup[confirm_password]']");
	
	static By shopifyPartner_Error_SameNameExists = By.xpath("//div[@id='TextField2Error']");
	static By shopifyPartner_Button_Save = By.xpath("//button[@class='Polaris-Button Polaris-Button--primary' and @aria-label='Save']");
	
	static By shopifyPartner_Error_OnlineStore = By.xpath("//span[contains(text(),'Online Store')]");
	static By shopifyPartner_preferences = By.xpath("//span[@class='p_2UYjg' and contains(text(),'Preferences')]");
	static By shopifyPartner_DisablePassword = By.xpath("//input[@class='p_1Kfuo' and @id='Checkbox9']");
	static By shopifyPartner_APPS = By.xpath("//span[contains(text(),'Apps')]");
	static By shopifyPartner_Error_DisablePassword = By.xpath("//span[contains(text(),'Disable password')]");
	static By shopifyPartner_CheckBox_DisablePassword = By.xpath("(//span[@class='p_idoor'])[1]");
	static By shopifyPartner_link_vistAPPShopifyPage = By.xpath("//a[@class='p_1wLbD p_1eCDN']");
	static By shopifyPartner_input_searchAPP = By.xpath("//input[@class='marketing-input ui-search-suggestions__input hero-search-form__input']");
	static By shopifyPartner_inventorySource_APP = By.xpath("//h4[@class='ui-app-card__name' and contains(text(),'Inventory Source')]");
	static By shopifyAppStore_Button_AddApp = By.xpath("//input[@class='marketing-button ui-app-store-hero__cta-button']");
	static By shopifyAppStore_Button_InstallApp	= By.xpath("//button[@class='ui-button ui-button--primary']");
	static By shopifyAppStore_Button_Login	= By.xpath("//a[@class='btn btn-primary btn-lg' and contains(text(),'Login')]");
	static By shopifyAppStore_Button_ISLogin= By.xpath("//input[@placeholder='Email']") ;
	static By app_image_IS = By.xpath("//img[@class='img-responsive large-logo']");
	
	//Frontier
	
	public static List<By> GetAllUrlMap(){
		List<By> list = new ArrayList<By>();
		list.add(By.xpath("//p//a[contains(text(),'Bac')]"));
		list.add(By.xpath("//p//a[contains(text(),'Baking Flavors & Extracts')]"));
		list.add(By.xpath("//p//a[contains(text(),'Bottled Herbs & Spices')]"));
		list.add(By.xpath("//p//a[contains(text(),'Grinders')]"));
		list.add(By.xpath("//p//a[contains(text(),'Merchandising & Displays')]"));
		list.add(By.xpath("//p//a[contains(text(),'Salt Free Seasoning Shakers')]"));
		list.add(By.xpath("//p//a[contains(text(),'Baking Flavors & Extracts')]"));
		list.add(By.xpath("//p//a[contains(text(),'Sea Salts & Pepper')]"));
		list.add(By.xpath("//p//a[contains(text(),'Vanillas of the World')]"));
		list.add(By.xpath("//p//a[contains(text(),'Vegetable Glycerin')]"));
		list.add(By.xpath("//a[contains(text(),'Bulk Displays')]"));
		list.add(By.xpath("//a[contains(text(),'Bulk Tea')]"));
		list.add(By.xpath("//a[contains(text(),'Bulk Gourmet Salts')]"));
		list.add(By.xpath("//a[contains(text(),'Organic Fair Trade Certified™ Packaged Loose-Leaf Teas')]"));
		list.add(By.xpath("//a[contains(text(),'Bulk Spice Piles')]"));
		list.add(By.xpath("//a[contains(text(),'Organic Packaged Bulk Herbs')]"));
		list.add(By.xpath("//a[contains(text(),'Organic Packaged Bulk Spices & Seasonings')]"));
		list.add(By.xpath("//a[contains(text(),'Packaged Bulk Merchandising & Displays')]"));
		
		
		
		return list;
	}

	
	public static List<By> GetAllUrlMapAC(){
		List<By> list = new ArrayList<By>();
		list.add(By.xpath("//a[contains(text(),'100% Pure Essential Oils')]"));
		list.add(By.xpath("//a[contains(text(),'Aura Cacia Accessories')]"));
		list.add(By.xpath("//a[contains(text(),'Air Freshening Spritz')]")); 
		list.add(By.xpath("//a[contains(text(),'Aromatherapy Roll-ons')]"));
		list.add(By.xpath("//a[contains(text(),'Aromatherapy Shower Tablets')]"));
		list.add(By.xpath("//a[contains(text(),'Aura Cacia Baby')]"));
		list.add(By.xpath("//a[contains(text(),' Body Butters')]"));
		list.add(By.xpath("//a[contains(text(),'Body Oils')]"));
		list.add(By.xpath("//a[contains(text(),'Body Soaks')]"));
		list.add(By.xpath("//a[contains(text(),'Boxed Essential Oils')]"));
		list.add(By.xpath("//a[contains(text(),'Boxed Essential Solutions™')]"));
		list.add(By.xpath("//a[contains(text(),'Bubble Baths')]"));
		list.add(By.xpath("//a[contains(text(),'Diffusers')]"));
		list.add(By.xpath("//a[contains(text(),'Discover Line')]"));
		list.add(By.xpath("//a[contains(text(),'DIY Essential Oil Blends')]"));
		list.add(By.xpath("//a[contains(text(),'Electric Aromatherapy Air Fresheners')]"));
		list.add(By.xpath("//a[contains(text(),'Empty Bottles')]"));
		list.add(By.xpath("//a[contains(text(),'Essential Oil Blends')]"));
		list.add(By.xpath("//a[contains(text(),'Essential Oil Roll-ons')]"));
		list.add(By.xpath("//a[contains(text(),'Essential Solutions™')]"));
		list.add(By.xpath("//a[contains(text(),'Foam Baths')]"));
		list.add(By.xpath("//a[contains(text(),'Foam Bath for Kids')]"));
		list.add(By.xpath("//a[contains(text(),'For the Home')]"));
		list.add(By.xpath("//a[contains(text(),'Fruit Seed Oils')]"));
		list.add(By.xpath("//a[contains(text(),'Home Care Blends')]"));
		list.add(By.xpath("//a[contains(text(),'Massage Creams')]"));
		list.add(By.xpath("//a[contains(text(),'Milk & Oat Bath')]"));
		list.add(By.xpath("//a[contains(text(),'Mineral Baths')]"));
		list.add(By.xpath("//a[contains(text(),'Mists')]"));
		list.add(By.xpath("//a[contains(text(),'Organic Chakra Balancing Roll-Ons')]"));
		list.add(By.xpath("//a[contains(text(),'Organic Essential Oils')]"));
		list.add(By.xpath("//a[contains(text(),'Organic Facial Oil Serums')]"));
		list.add(By.xpath("//a[contains(text(),'Organic Yoga Mists')]"));
		list.add(By.xpath("//a[contains(text(),'Precious Essentials®')]"));
		list.add(By.xpath("//a[contains(text(),'Skin Care Oils (conventional & organic)')]"));
		return list;
	}
	
	public static List<By> GetAllUrlMap_SO(){
		List<By> list = new ArrayList<By>();
		list.add(By.xpath("//a[contains(text(),'Bottled Spices')]"));
		list.add(By.xpath("//a[contains(text(),'Coffee Spices')]"));
		list.add(By.xpath("//a[contains(text(),'Grilling Seasons®')]"));
		list.add(By.xpath("//a[contains(text(),'Grinder Top Seasonings')]"));
		list.add(By.xpath("//a[contains(text(),'Mini Spices')]"));
		list.add(By.xpath("//a[contains(text(),'Salt-Free Seasoning Blends')]"));
		list.add(By.xpath("//a[contains(text(),'Spice Right Everyday Blends')]"));
		list.add(By.xpath("//a[contains(text(),'Turkey Brine')]"));
		list.add(By.xpath("//a[contains(text(),'Turkey Rub')]"));
		list.add(By.xpath("//a[contains(text(),'Pepper Tin')]"));
		list.add(By.xpath("//a[contains(text(),'Baking Flavors & Extracts')]"));
		list.add(By.xpath("//a[contains(text(),'Entree Seasoning Mixes (Tacos, Pasta, Steam Gourmet...)')]"));
		list.add(By.xpath("//a[contains(text(),'Sides Seasoning Mixes (Gravies, Veggies, Dressings & Mulling)')]"));
		list.add(By.xpath("//a[contains(text(),'Simmer Sauces & Pouches')]"));
		list.add(By.xpath("//a[contains(text(),'Dip Mixes')]"));
		list.add(By.xpath("//a[contains(text(),'Merchandising & Displays')]"));
		list.add(By.xpath("//a[contains(text(),'Promotional Materials')]"));
		
		
		
		return list;
	}

	
	
	
	

	static By url_Bac = By.xpath("//p//a[contains(text(),'Bac')]");
	
	/*
	 * static By url_Baking_Flavors =
	 * By.xpath("//p//a[contains(text(),'Baking Flavors & Extracts')]");
	 * 
	 * static By url_BottledHerbs =
	 * By.xpath("//p//a[contains(text(),'Bottled Herbs & Spices')]"); static By
	 * url_Grinders = By.xpath("//p//a[contains(text(),'Grinders')]"); static By
	 * url_Merchandising =
	 * By.xpath("//p//a[contains(text(),'Merchandising & Displays')]"); static By
	 * url_Oraganic_Al_Purpose =
	 * By.xpath("//p//a[contains(text(),'Salt Free Seasoning Shakers')]"); static By
	 * url_SaltFreeSeasoningShakers =
	 * By.xpath("//p//a[contains(text(),'Baking Flavors & Extracts')]");
	 */
		
	static By url_Seafood = By.xpath("//p//a[contains(text(),'Sea Salts & Pepper')]");
	static By contentHead = By.xpath("//div[@id='content']//h1");
	static By url_essentialsOils= By.xpath("//a[contains(text(),'100% Pure Essential Oils')]");
	
	static By url_BottleSpices= By.xpath("//a[contains(text(),'Bottled Spices')]");
	static By url_Vanillas = By.xpath("//p//a[contains(text(),'Vanillas of the World')]");
	static By url_VegetableGlycerin = By.xpath("//p//a[contains(text(),'Vegetable Glycerin')]");
	static By url_BulkDisplays = By.xpath("//a[contains(text(),'Bulk Displays')]");
	static By urlBulkTea_ = By.xpath("//a[contains(text(),'Bulk Tea')]");
	static By url_BulkGourmetSalts = By.xpath("//a[contains(text(),'Bulk Gourmet Salts')]");
	
	static By url_BulkSpicePiles = By.xpath("//a[contains(text(),'Bulk Spice Piles')]");
	static By url_OrganicFairTradeCertified = By.xpath("//a[contains(text(),'Organic Fair Trade Certified™ Packaged Loose-Leaf Teas')]");
	static By url_OrganicPackagedBulkHerbs = By.xpath("//a[contains(text(),'Organic Packaged Bulk Herbs')]");
	static By url_OrganicPackagedBulkSpicesSeasonings = By.xpath("//a[contains(text(),'Organic Packaged Bulk Spices & Seasonings')]");
	static By url_PackagedBulkMerchandisingDisplays = By.xpath("//a[contains(text(),'Packaged Bulk Merchandising & Displays')]");
}
