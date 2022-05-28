package Test123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pom123.insta_login;

public class TeatNg_Class {

	


	 @Test(invocationCount=2)
	    public void setbrowser() {
	    System.out.println("deshmukh");
       
	}
    @Test(dependsOnMethods = {"setbrowser"})
    public void launchbrowser() {
   System.out.println("vyankatesh");
	}
    @Test
    public void delta() {
    	System.out.println("YASHWANTRAO");
    }
}
