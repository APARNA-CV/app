package firstprojectpackage;

import java.io.File;
import java.util.logging.FileHandler;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {
	public void screen()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			org.openqa.selenium.io.FileHandler.copy(screen,new File("C:\\Users\\asus\\Desktop\\aparna\\abc.jpeg"));
			
		}
		catch(Exception exe)
		{
			System.out.println(exe);
		}
	}
	public static void main(String[] args)
	{
		Screenshot obj=new Screenshot();
		obj.screen();
		
	}

}
