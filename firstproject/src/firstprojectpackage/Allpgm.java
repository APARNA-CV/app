package firstprojectpackage;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.build.Plugin.Engine.Source.Empty;
import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class Allpgm {
	public void All()
	{
		try {
			 //1.login
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			String homepage1="https://demo.guru99.com/test/newtours/";
			driver.get(homepage1);
			
			driver.findElement(By.name("userName")).sendKeys("shv");
			driver.findElement(By.name("password")).sendKeys("3276");
			driver.findElement(By.name("submit")).click();
			
			//2.screenshot
			File screen=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screen, new File("C:\\Users\\asus\\Desktop\\aparna\\allpgm.jpeg"));
			
			//3.Title
			System.out.println("The title is "+driver.getTitle());
			String expected="log in to site";
			String actual=driver.getTitle();
			if(expected.contentEquals(actual))
			{
				System.out.println("Test passed");
			}
			else
			{
				System.out.println("Test failed");
			}
			
			//4.multiplewindow
			driver.findElement(By.linkText("REGISTER")).click();
			Set<String> a=driver.getWindowHandles();
			Iterator<String> it=a.iterator();
			while(it.hasNext())
			{
				String childwindow=it.next();
				driver.switchTo().window(childwindow);
			}
			
			//5.brokenlink
			String homepage="https://demo.guru99.com/test/newtours/";
			String url=null;
			HttpsURLConnection huc=null;
			int respcode=200;
			driver.manage().window().maximize();
			
		    driver.get(homepage);
		    List<WebElement> links=driver.findElements(By.tagName("a"));
		    Iterator<WebElement> its=links.iterator();
		    while(its.hasNext()) 
		    {
		    	url=its.next().getAttribute("href");
		    	System.out.println(url);
		    	if(url==null||url.isEmpty())
		    	{
		    		System.out.println("url is not configured or empty url");
		    		continue;
		    	}
		    	if(!url.startsWith(homepage))
		    	{
		    		System.out.println("url is on another domain");
		    		continue;
		    	}
		    try {
		    	huc=(HttpsURLConnection)(new URL(url).openConnection());
		    	huc.setRequestMethod("HEAD");
		    	huc.connect();
		    	respcode=huc.getResponseCode();
		    	if(respcode>=400)
		    	{
		    		System.out.println("Broken links");
		    	}
		    	else
		    	{
		    		System.out.println("valid links");
		    	}
		    	
			} 
		    catch (MalformedURLException e) {
             e.printStackTrace();			}
		    catch (Exception e) {
              e.printStackTrace();			}
		    }
		
			
			//6.countlinks
		     System.out.println("Total link count"+driver.findElements(By.tagName("a")).size());
		     WebElement head=driver.findElement(By.className("row"));
		     List<WebElement> link=head.findElements(By.tagName("a"));
		     int count=link.size();
		     System.out.println("links in header"+count);
		     
		    
			
			//7.dragandrop
		     String homepage2="https://demo.guru99.com/test/drag_drop.html";
		     driver.get(homepage2);
		     
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
		     
		     
		     
		     
			
			//8.checkbox and radiobutton
		     
		     WebElement radio1=driver.findElement(By.id("vfb-7-1"));
		     WebElement radio2=driver.findElement(By.id("vfb-7-2"));
		     radio1.click();
		     System.out.println("Radio button option 1 is selected");
		     radio2.click();
		     System.out.println("Radio button option 2 is selected");
		     
		     WebElement option1=driver.findElement(By.id("vfb-6-0"));
			option1.click();
			if(option1.isSelected())
			{
				System.out.println("Checkbox option 1 is toggled on");
			}
			else
			{
				System.out.println("Checkbox option 1 is toggled off");
			}
			//9.popup window
			String alertmsg="";
			driver.findElement(By.cssSelector("input[value\"Go!\"]")).click();
			alertmsg=driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.println(alertmsg);
			
			
			
		} catch (Exception e) {
System.out.println("e");
		}
	}
	public static void main(String[] args) {
		Allpgm obj=new Allpgm();
		obj.All();
	}

}
