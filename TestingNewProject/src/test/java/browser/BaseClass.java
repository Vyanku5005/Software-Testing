package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {

	    public WebDriver openEdgeBrowser() {
		System.setProperty("webdriver.edge.driver","C:\\JAVA\\Edge\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		return driver;
	}
	
       public WebDriver openChromeBrowser() {
	   System.setProperty("webdriver.chrome.driver","C:\\JAVA\\chrome\\chromedriver.exe");
       WebDriver driver=new ChromeDriver();
       return driver;
}
}