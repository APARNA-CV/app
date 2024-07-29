package firstprojectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Loginpgm {
	public void login()
	{
		System.setProperty("webDriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
	    driver.findElement(By.id("email")).sendKeys("hsdbvjhd");
	    driver.findElement(By.id("pass")).sendKeys("45645");
	    driver.findElement(By.id("loginbutton")).click();

	}
	public static void main(String[] args) {
		Loginpgm lg=new Loginpgm();
		lg.login();
		}

}
