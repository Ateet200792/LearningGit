package pageObject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import base.BaseClass;

public class LoginPage extends BaseClass {

	static WebElement SignInMouseHover = driver.findElement(By.xpath("//a[@id='nav-link-accountList']"));
	
	static WebElement SignInBytton = driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
	
	WebElement UsernameClick = driver.findElement(By.xpath("//input[@id='ap_email']"));
	 String ContinueButton = ("//input[@id='continue']");
	 String PasswordClick = ("//input[@id='ap_password']");
    String Submit = ("//input[@id='signInSubmit']");
	

	public static void SignIn() throws InterruptedException {
		Thread.sleep(10000);
		Actions act = new Actions(driver);
		act.moveToElement(SignInMouseHover).perform();
		Thread.sleep(5000);
		SignInBytton.click();
		Thread.sleep(5000);
		

	}
	
	public  void EnterUserName(String a) throws InterruptedException
	{
		LoginPage obj = new LoginPage();
		
		obj.UsernameClick.sendKeys(a);
		Thread.sleep(4000);
		driver.findElement(By.xpath(ContinueButton)).click();
		Thread.sleep(5000);
		
	}
	
	public  void EnterPassword(String b) throws InterruptedException
	{
		LoginPage obj = new LoginPage();
		
		driver.findElement(By.xpath(PasswordClick)).sendKeys(b);
		Thread.sleep(3000);
		driver.findElement(By.xpath(Submit)).click();
	}
	
	

}
