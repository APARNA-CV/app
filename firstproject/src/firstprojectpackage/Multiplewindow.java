package firstprojectpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow {
	public void multiplewindow()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/login/");
			
			driver.findElement(By.linkText("Forgotten account?")).click();
			Set<String> a=driver.getWindowHandles();
			Iterator<String> it=a.iterator();
			
			while(it.hasNext())	
			{
				String childrenwindow=it.next();
				driver.switchTo().window(childrenwindow);
			}
			
			
		} catch (Exception e) {
         System.out.println("e");
		}
	}
	public static void main(String[] args) {
		Multiplewindow obj=new Multiplewindow();
		obj.multiplewindow();
	}

}
