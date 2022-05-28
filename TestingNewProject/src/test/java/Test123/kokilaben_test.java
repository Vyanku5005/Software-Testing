package Test123;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import browser.BaseClass;
import pom123.Kokilaben;

public class kokilaben_test extends BaseClass {

	WebDriver driver;
	@BeforeClass
	public void setbrowser() {
    System.setProperty("webdriver.chrome.driver","C:\\JAVA\\chrome\\chromedriver.exe");
    driver = new ChromeDriver();
	}
	@BeforeMethod
	public void launchbrowser() throws InterruptedException {
		driver.get("https://www.kokilabenhospital.com/");
		Kokilaben login = new Kokilaben(driver);
	    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	    driver.manage().window().maximize();
	    login.clickonpatiantandvissitor();
		login.clickonbilling();
		login.clickonpatiantname();
		login.clickonuhidno();
		login.clickonrelation();
		login.clickonmob();
		Thread.sleep(3000);
	}
	@Test
	public void verification() {
		String title=driver.getTitle();
		Assert.assertNotNull("kokilaben", title);
	}
	@AfterMethod
	public void endprogram() {
	System.out.println("PROGRAMMING END");
	}
	@AfterClass
	public void close() throws InterruptedException {
		Thread.sleep(3000);
		driver.close();
	}
	
}