package pom123;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Kokilaben {

	@FindBy(xpath="(//a[@class='firstLevel menubelow'])[3]")
	private WebElement patiant;
	
	@FindBy(xpath="(//a[text()='Online Bill Payment'])[1]")
	private WebElement onlineBillingmodule;
				
	@FindBy(xpath="(//span[@class='filter-option pull-left'])[4]")
	private WebElement reson;
	
	@FindBy(xpath="//input[@id='patient_name']")
	private WebElement patiantname;
	
	@FindBy(xpath="//input[@id='uhid_bed_number']")
	private WebElement uhidno;
	
	@FindBy(xpath="//input[@id='r_p_name']")
	private WebElement relation;
	
	@FindBy(xpath="//input[@id='mobile_no']")
	private WebElement mob;
	
	WebDriver driver;
	
	public Kokilaben (WebDriver driver) {
	PageFactory.initElements(driver, this);
	this.driver=driver;
	}
	public void clickonpatiantandvissitor() throws InterruptedException {
		Actions ac= new Actions(driver);
		Thread.sleep(3000);
        ac.moveToElement(patiant).build().perform();	
	}
	
	public void clickonbilling() throws InterruptedException {
		Thread.sleep(3000);
		onlineBillingmodule.click();
		}
	
	public void clickonreson() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",reson);
		Select s = new Select(reson);
        s.selectByIndex(1);
		reson.click();


	}
	public void clickonpatiantname() {
		patiantname.sendKeys("VYANKATESH DESHMUKH");
	}
	public void clickonuhidno() {
		uhidno.sendKeys("VYANKU005");
}
	public void clickonrelation() {
		relation.sendKeys("self");
	}
	public void clickonmob() {
		mob.sendKeys("9881800880");
	}

}
