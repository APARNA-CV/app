package firstprojectpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragdrop {

	public static void main(String[] args) {
		 
		System.setProperty("webdiver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement from=driver.findElement(By.xpath("//*[@id=\"credit2\"]/a"));
		WebElement to=driver.findElement(By.xpath("//*[@id=\"bank\"]/li"));
		Actions Act=new Actions(driver);
		Act.dragAndDrop(from, to).build().perform();
		
		WebElement from1=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to1=driver.findElement(By.xpath("//*[@id=\"amt7\"]/li"));
		Actions Act1=new Actions(driver);
		Act1.dragAndDrop(from1, to1).build().perform();
		
		WebElement from2=driver.findElement(By.xpath("//*[@id=\"credit1\"]/a"));
		WebElement to2=driver.findElement(By.xpath("//*[@id=\"loan\"]/li"));
		Actions Act2=new Actions(driver);
		Act2.dragAndDrop(from2, to2).build().perform();
		
		WebElement from3=driver.findElement(By.xpath("//*[@id=\"fourth\"]/a"));
		WebElement to3=driver.findElement(By.xpath("//*[@id=\"amt8\"]/li"));
		Actions Act3=new Actions(driver);
		Act3.dragAndDrop(from3, to3).build().perform();
		
		
		
	}

}
