package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import base.BaseClass;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pageObject.LoginPage;
import utility.UtilityClass;

public class stepDefinition extends BaseClass {

	
	@Given("^Open the Chrome Browser$")
	public void open_the_Chrome_Browser() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Acer i3\\Desktop\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	@Then("^Open the Amazon Website by passing the URL$")
	public void open_the_Amazon_Website_by_passing_the_URL() throws Throwable {
		
		driver.get(UtilityClass.FileRead().getProperty("URL"));
		
	}
		


@And("^Verify the title of the Page$")
public void verify_the_title_of_the_Page() throws Throwable {
    
		String Title = driver.getTitle();
		if(Title.contains("Online Shopping"))
		{
			System.out.println("Pass");
		}
		else
		{
			System.out.println("Fail");

		}
		
		UtilityClass.Screenshot();
		Thread.sleep(5000);
		
			}

@Then("^Click on SignIn$")
public void click_on_SignIn() throws Throwable {
	
	//WebDriverWait Wait = new WebDriverWait(driver,10);
	Thread.sleep(8000);
   
	LoginPage.SignIn();
}




@And("^Enter Username as \"([^\"]*)\"$")
public void enter_Username_as(String arg1) throws Throwable {
	LoginPage obj2 = new LoginPage();
	obj2.EnterUserName(arg1);
   }

@Then("^Enter Password as \"([^\"]*)\"$")
public void enter_Password_as(String arg2) throws Throwable {
	LoginPage obj2 = new LoginPage();
	obj2.EnterPassword(arg2);

    }



}
