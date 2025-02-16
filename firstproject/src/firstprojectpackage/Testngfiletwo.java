package firstprojectpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;

@Test
public class Testngfiletwo 
{
	public String url="http://demo.guru99.com/test/newtours/";
	String path="C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	public String expected=null;
	public String actual=null;

	 @BeforeTest
	  public void launchbrowser()
	 { 
		System.out.println("Launching chrome browser"); 
		System.setProperty("webdriver.chrome.driver", path);
		driver=new ChromeDriver();
		driver.get(url); 
	  }
	 
	 @BeforeMethod
	 public void verifyhomepagetitle()
	 {
		 String exptitle="Welcome: Mercury Tours";
		 String acttitle=driver.getTitle();
		 System.out.println(driver.getTitle());
		 Assert.assertEquals(acttitle, exptitle);  
	 }
	 
  @Test(priority = 0)
  public void Register() 
  {
	driver.findElement(By.linkText("REGISTER")).click();  
	expected="Register: Mercury Tours";
	actual=driver.getTitle();
	Assert.assertEquals(actual, expected);  
  }
 
  @Test(priority = 1)
  public void Flights()
  {
	driver.findElement(By.linkText("Flights")).click();
	expected="Find a Flight: Mercury Tours: ";
	actual=driver.getTitle();
	System.out.println(driver.getTitle());
	Assert.assertEquals(actual, expected);
  }
  
  @AfterMethod
  public void gobacktohomepage() 
  {
	driver.findElement(By.linkText("Home")).click(); 
  }
  
  @AfterTest
  public void Terminatebrowser() 
  {
	  driver.close();
  }

}
