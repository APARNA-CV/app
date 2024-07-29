package firstprojectpackage;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Multiplewindow1 {
	public void multiplewindow()
	{
	try {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		driver.findElement(By.linkText("Sign up for Facebook")).click();
		Set<String> a=driver.getWindowHandles();
		Iterator<String> it=a.iterator();
		 while(it.hasNext())
		 {
			 String childwindow=it.next();
			 driver.switchTo().window(childwindow);
		 }
		
	} 
	catch (Exception e)
	{
    System.out.println("e");
	}
	}
	public static void main(String[] args) {
		Multiplewindow1 obj= new Multiplewindow1();
		obj.multiplewindow();
		
		
	}

}
