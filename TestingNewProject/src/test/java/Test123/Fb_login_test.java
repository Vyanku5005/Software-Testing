package Test123;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
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
import pom123.Fb_signup;

public class Fb_login_test extends BaseClass{

	WebDriver driver;
	Fb_signup fb;
	
	
	@Parameters("browser")
	@BeforeTest()
	public void launchbrowser(String browser) {
		
		if(browser.equals("chromebrowser")) 
		{
			
	     driver=openChromeBrowser();
	    }
	    if(browser.equals("edgebrowser")) 
	    {
	     driver=openEdgeBrowser();
	    }
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	    }
	
	@BeforeClass()
	public void setbrowser(){
	fb = new Fb_signup(driver);
	}
	
	@BeforeMethod()
	public void launchbrowser() throws InterruptedException, EncryptedDocumentException, IOException {
		driver.get("https://www.facebook.com/");
		fb.clickonnewacc();
		fb.firstname();
		fb.lastname();
		fb.clickmob();
		fb.password();
		fb.clickondate();
		fb.clickonmoth();
		fb.clickonyear();
		fb.clickongender();
		fb.clickonsignup();
	}
	@Test()
	public void test() {
		String url=driver.getCurrentUrl();
		Assert.assertEquals("https://www.facebook.com/",url);
	}
	
	@Test(dependsOnMethods={"test"})
	public void test1() {
		String value=driver.getTitle();
		Assert.assertEquals("Facebook – log in or sign up",value);
	}
	@AfterMethod()
	public void method(){
		System.out.println("PROGRAMMING END");
	}
	
	@AfterClass()
	public void deleteobject() throws InterruptedException {
		 fb = null;
		
	}
	@AfterTest( )
	public void closebrowser() {
		driver.close();
		driver=null;
		System.gc(); // garbage collector
	}
    }
