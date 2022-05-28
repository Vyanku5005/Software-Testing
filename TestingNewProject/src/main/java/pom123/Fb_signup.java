package pom123;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Fb_signup {
	
@FindBy(xpath="(//a[@role='button'])[2]")
private WebElement NewAcc;

@FindBy(xpath="//input[@name='firstname']")
private  WebElement firstname;

@FindBy(xpath="//input[@name='lastname']")
private WebElement lastname;

@FindBy(xpath="//input[@name='reg_email__']")
private WebElement mob;

@FindBy(xpath="//input[@name='reg_passwd__']")
private WebElement password;

@FindBy(xpath="//select[@id='day']")
private WebElement date;

@FindBy(xpath="//select[@title='Month']")
private WebElement month;

@FindBy(xpath="//select[@id='year']")
private WebElement year;

@FindBy(xpath="(//label[@class='_58mt'])[2]")
private WebElement gender;

@FindBy(xpath="(//button[text()='Sign Up'])[1]")
private WebElement signup;

WebDriver driver;
         public Fb_signup (WebDriver driver){
	     PageFactory.initElements(driver,this);
	     this.driver=driver;
}

public void clickonnewacc() {
	NewAcc.click();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
}		  
    public void firstname() throws EncryptedDocumentException, IOException {
	String path ="C:\\JAVA\\chrome\\testcase design group-p.xlsx";
	FileInputStream file = new FileInputStream(path);
    String value= WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
    firstname.sendKeys(value);
   
	//firstname.sendKeys("VYANKATESH");
}
public void lastname() {
	lastname.sendKeys("DESHMUKH");
}
public void clickmob() {
	mob.sendKeys("88888880");
}
public void password() {
	password.sendKeys("VYANKATESH");
}
public void clickondate() {
	Select s= new Select(date);
	s.selectByIndex(3);
}
public void clickonmoth() throws InterruptedException {
	Thread.sleep(3000);
	Select ss= new Select(month);
	ss.selectByVisibleText("Jun");
	Thread.sleep(3000);
}
public void clickonyear() {
	Select ss= new Select(year);
	ss.selectByValue("1995");
}
public void clickongender() {
	gender.click();
}
public void clickonsignup() {
	signup.click();
}
}
