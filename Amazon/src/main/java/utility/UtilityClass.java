package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.BaseClass;

public class UtilityClass extends BaseClass {
	
	public static Properties FileRead() throws IOException
	{
	
	FileInputStream fis = new FileInputStream("C:\\Users\\Acer i3\\eclipse-workspace\\Amazon\\Config.properties");
	
	Properties prop = new Properties();
	prop.load(fis);
	return prop;
			
	}
	
	public static void Screenshot() throws IOException {
		
		TakesScreenshot trc = (TakesScreenshot)driver;
		File src = trc.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("C:\\Users\\Acer i3\\eclipse-workspace\\Amazon\\Screenshot\\"+System.currentTimeMillis()+".png"));
	}
	
public static void ExplicitWait_ElementToBeClickable(String xpath) {
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
	}




	

}
