package com.test.base;


	
	
	import java.net.MalformedURLException;

	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.support.FindBy;
	import org.openqa.selenium.support.PageFactory;
	import org.testng.annotations.Test;
	import io.appium.java_client.pagefactory.AndroidFindBy;

	import io.appium.java_client.android.AndroidDriver;
	import io.appium.java_client.android.AndroidElement;



	public class BrowseSample extends ChromeTest {
		
		//	public static void main(String[] args) throws MalformedURLException {

				
			//Initializing the Page Objects:
			public BrowseSample () {
				PageFactory.initElements(driver, this);
				
			}
			
			
			//Actions:
			public String validateHomePageTitle(){
				driver.findElementByXPath("//a[@id='CybotCookiebotDialogBodyLevelButtonAccept']").click();
						return driver.getTitle();
							}
			
			public boolean validateCRMImage(){
			return	driver.findElementByXPath("//img[contains(@class,'branding-block__logo')]").isDisplayed();
			}
			
	     public boolean searchLabels(){
	    	 return	driver.findElementByXPath("//a[contains(@href, '/lsat/lsat-prep/sample-tests')]").isDisplayed();
		
	    }
	    
			
	}
		
			// 1
			
//		 	 = setupCapabilities("brose");
			
			// 2
		
			
			
			//Page Factory - OR:
		
		
		/*
		@FindBy(xpath="//a[@id='CybotCookiebotDialogBodyLevelButtonAccept']")
				WebElement Accept;	
				
			@FindBy(xpath="//button[contains(@aria-label,'Open navigation menu')]")
			WebElement OpenMenu;
			
			
			
			@FindBy(xpath="//img[contains(@class,'branding-block__logo')]")
			WebElement logoimage;
			
			@FindBy(xpath="//button[contains(@aria-label,'Close navigation menu')]")
			WebElement CloseMenu;
			
			@FindBy(xpath="//a[contains(@href,'/search')]")
			WebElement clickonsearch;
			
			
			@FindBy(xpath="//input[@type='text']")
			WebElement entertext;
			
			
			@FindBy(xpath="//*[@id='edit-actions']") 
			WebElement searchclik;
			
			
			@FindBy(xpath="//a[contains(@href, '/lsat/lsat-prep/sample-tests')]")
			WebElement verifylabel;

			@FindBy(xpath="//a[contains(@href, '/about')]")
			WebElement ClickAbout;
			
			
		*/	


