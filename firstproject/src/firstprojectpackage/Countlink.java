package firstprojectpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class Countlink {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		System.out.println("Total link counts "+driver.findElements(By.tagName("a")).size());
		
		
		WebElement head=driver.findElement(By.className("row"));
		List<WebElement> links=head.findElements(By.tagName("a"));
		int count=links.size();
		System.out.println("links in head is "+count);
		
	}

}
