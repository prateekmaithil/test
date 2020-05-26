package com.testcases;


	
	
	import java.net.MalformedURLException;

	import org.testng.Assert;
	import org.testng.annotations.AfterMethod;
	import org.testng.annotations.BeforeMethod;
	import org.testng.annotations.Test;

    import com.test.base.BrowseSample2page;
    import com.test.base.ChromeTest;
    import com.test.base.testsampless;

	
 
       public class sampletest extends testsampless {
		
		BrowseSample2page browseSample2;
			
			
			public sampletest(){
				super();
			}
			
			@BeforeMethod
			public void setUp() throws MalformedURLException{
	//	 	initialization();
				browseSample2 = new BrowseSample2page();	
			}
			
			@Test(priority=1)
			public void validateTitle(){
				String title = browseSample2.validateHomePageTitle();
				Assert.assertEquals(title, "test");
			}
			
			@Test(priority=2)
			public void validateImage(){
				boolean flag = browseSample2.validateCRMImage();
				Assert.assertTrue(flag);
			}
			
			@Test(priority=3)
			 public void verifysearchresult(){
//				 String title = browseSample.
//				Assert.assertEquals(title, "#1 Free CRM for Any Business: Online Customer Relationship Software");
					Assert.assertEquals(browseSample2.searchLabels(), "page");
			}
			
			
			
			
			@AfterMethod
			public void tearDown(){
				driver.quit();
			}
			
		
		

	}


