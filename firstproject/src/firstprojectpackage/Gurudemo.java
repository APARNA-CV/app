package firstprojectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gurudemo {
	public void login()
	{
		try
		{
			
		
		System.setProperty("webDriver.chrome.driver","C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/");
		
		driver.findElement(By.name("emailid")).sendKeys("ghsdchbdc");
		driver.findElement(By.name("btnLogin")).click();
		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}
	public static void main(String[] args) {
		Gurudemo obj=new Gurudemo();
		obj.login();
		
		
	}

}
