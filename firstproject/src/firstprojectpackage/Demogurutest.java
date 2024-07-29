package firstprojectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demogurutest {
	public void login()
	{
		try
		{
		System.setProperty("webDriver.chrome.driver","C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://demo.guru99.com/test/newtours/");
	    
	    driver.findElement(By.name("userName")).sendKeys("erf");
	    driver.findElement(By.name("password")).sendKeys("3746");
	    driver.findElement(By.name("submit")).click();
	    }
		
		catch(Exception exp)
		{
			System.out.println(exp);
		}
	}
	public static void main(String[] args) {
		
		Demogurutest obj=new Demogurutest();
		obj.login();
	}

}
