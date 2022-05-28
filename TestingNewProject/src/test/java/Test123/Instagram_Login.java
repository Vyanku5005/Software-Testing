package Test123;

import java.util.concurrent.TimeUnit;  

import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import browser.BaseClass;
import pom123.insta_login;


class Instagram_Login extends BaseClass{
 	  WebDriver driver;
 	 insta_login login ;
 	  
 	 @Parameters("browser")
 	@BeforeTest()
 	public void launchbrowser(String browser) {
 		 if(browser.equals("chromebrowser")) 
 		 {
 			 driver=openChromeBrowser();
 		 }
 		 if(browser.equals("edgebrowser"))
 		 {
 			 driver = openEdgeBrowser();
 		 }
 	 }
	@BeforeClass
	  public void setbrowser() {
	   login = new insta_login(driver);
	   }
    @BeforeMethod
       public void launchbrowser() {
   	   driver.get("https://www.instagram.com/");
       login.clickonusername();
       login.clickonpassword();
       login.clickonloginbutton();
       }
    @Test(priority=1,dependsOnMethods = {"title"})
        public void verificationtest() {
        String result =driver.getCurrentUrl();
        System.out.println(result);
        }
    @Test(priority=2,invocationCount=5)
        public void title() {
        String title=driver.getTitle();
       	System.out.println(title);
       // Assert.assertEquals("Instagram",title);
     Assert.assertNotEquals("www.instagram.com", title);
        }
   @AfterMethod
       public void login() {
	   System.out.println("Programming End");
       }
   @AfterClass
       public void end() throws InterruptedException {
      login =null;
       }
   @AfterTest()
   public void delete() {
	   driver.close();
	   driver=null;
	   System.gc();
   }
       }
