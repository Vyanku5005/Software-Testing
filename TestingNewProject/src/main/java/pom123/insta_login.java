package pom123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class insta_login {

	@FindBy (xpath="//input[@name='username']")
	public WebElement userid;
	
	
	@FindBy (xpath="//input[@type='password']")
	public WebElement password;
	
	@FindBy (xpath="//div[text()='Log In']")
	public WebElement loginbutton;	
	
	
	public insta_login(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	   public void clickonusername() {
		userid.sendKeys("the_vyankatesh");
	}
	    public void clickonpassword() {
		password.sendKeys("Vyankatesh@12345");
	}
	    public void clickonloginbutton() {
		loginbutton.click();
   }
   }