package firstprojectpackage;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class Testngfileone {
	public String baseurl="http://demo.guru99.com/test/newtours/";
	String driverPath="C:\\Users\\asus\\Desktop\\Selenium\\chromedriver.exe";
	public WebDriver driver;
	
			
	@BeforeTest
	  public void beforeTest() {
		
		System.out.println("Launchingchromedriver browser");
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver=new ChromeDriver();
		driver.get(baseurl);
		
	  }
	
  @Test
  public void f() {
	  String exptitle="Welcome: Mercury Tours";
	  String acttitle=driver.getTitle();
	  Assert.assertEquals(acttitle, exptitle);
  }
  

  @AfterTest
  public void afterTest() {
	 driver.close(); 
	  
  }

}
