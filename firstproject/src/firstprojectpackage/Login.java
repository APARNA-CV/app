package firstprojectpackage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public void login()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			driver.findElement(By.id("email")).sendKeys("egf");
			driver.findElement(By.id("pass")).sendKeys("5634");
			driver.findElement(By.id("loginbutton")).click();


		}
		catch(Exception exp)
		{
			System.out.println(exp);
		}
		
	}

	public static void main(String[] args) {
		Login obj=new  Login();
		obj.login();
		
	}

}
