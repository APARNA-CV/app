package firstprojectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popupwindow {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		String alertmessage="";
		driver.get("http://jsbin.com/usidix/1");
		driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
		alertmessage=driver.switchTo().alert().getText();
		driver.switchTo().alert().accept();
		System.out.println(alertmessage);
//		driver.close();
		
	}

}
