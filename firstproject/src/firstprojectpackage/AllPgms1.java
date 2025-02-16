package firstprojectpackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class AllPgms1 {
	public void allpgms()
	{
	try {
		
		//login
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.shcollege.online/login");
		driver.findElement(By.id("UserName")).sendKeys("admin");
		driver.findElement(By.id("Password")).sendKeys("KI#pw143shTvra");
		driver.findElement(By.xpath("//*[@id=\"frmLogin\"]/div[4]/button")).click();
		
		//screenshot
		File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screen, new File("C:\\Users\\asus\\Desktop\\aparna\\Allpgminvalid.jpeg"));
		
		//Title
		System.out.println("Title is"+driver.getTitle());
		String expected="log in to webpage";
		String actual=driver.getTitle();
		if(expected.contentEquals(actual))
		{
			System.out.println("Test Passed");
		}
		else
		{
			System.out.println("Test Failed");
		}
//		
		
		//Brokenlink
		
		String homepage="https://demo.shcollege.online/login";
		String url=null;
		HttpsURLConnection huc=null;
		int respcode=200;
		driver.manage().window().maximize();
		driver.get(homepage);
		List<WebElement> links=driver.findElements(By.tagName("a"));
		Iterator<WebElement> it=links.iterator();
		while(it.hasNext())
		{
		url=it.next().getAttribute("href");
		System.out.println(url);
		if(url==null||url.isEmpty())
		{
			System.out.println("url is not configured");
			continue;
		}
		if(!url.startsWith(homepage))
		{
			System.out.println("url is starts with another domain");
		}
		try {
			
			huc=(HttpsURLConnection)(new URL(url).openConnection());
			huc.setRequestMethod("HEAD");
			huc.connect();
			respcode=huc.getResponseCode();
			if(respcode>=400)
			{
				System.out.println("Broken Link!!!!!!!! ");
			}
			else
			{
				System.out.println("valid link............");
			}
			
		} catch (MalformedURLException e) 
		{
             e.printStackTrace();
             }
		catch (Exception e) {
e.printStackTrace();		}
		}
		
		
		
		//checkbox
		
		WebElement option1=driver.findElement(By.id("RememberMe"));
		option1.click();
		if(option1.isSelected())
		{
			System.out.println("checkbox option1 is toggled on");
		}
		else
		{
			System.out.println("checkbox option1 is toggled off");

		}
	} 
	catch (Exception e)
	{
System.out.println(e);
}
	}

	public static void main(String[] args) {
		AllPgms1 obj=new AllPgms1();
		obj.allpgms();

	}

}
