package firstprojectpackage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Titlepgm1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		System.out.println("Title is "+driver.getTitle());
		String expected="Log in to Facebook";
		String actual=driver.getTitle();
		 
		if(expected.contentEquals(actual))
		{
			System.out.println("Test case Passed");	
		}
		else
		{
			System.out.println("Test case Failed");
		}
	}

}
