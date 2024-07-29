package firstprojectpackage;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot1 {
	public void screen()
	{
	try 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen,new File("C:\\Users\\asus\\Desktop\\aparna\\screen1.jpeg"));
		
		
	} 
	catch (Exception e)
	{
		System.out.println(e);
	}
	}
	public static void main(String[] args) {
		
		Screenshot1 sc=new Screenshot1();
		sc.screen();
	}

}
