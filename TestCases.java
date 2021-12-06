package sipl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCases {
	WebDriver driver;
	String url="https://polymerupdate.com/default.aspx";
	
  @Test(dataProvider = "dp")
  public void f(String user, String password) throws InterruptedException {
	  
	  driver.findElement(By.xpath("(//i[contains(@aria-hidden,'true')])[3]")).click();
		 driver.findElement(By.id("login-section")).click();
		 driver.findElement(By.id("txtUserName")).sendKeys(user);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
		 driver.findElement(By.id("btnSubmit")).click();
	  
		
		
  }
  @Test
  public void beforeTest() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		
		 driver = new ChromeDriver();
		 
		 driver.get(url);
		 Thread.sleep(2000);
		
  }
  
  @Test
  public void Recycled_prices() throws InterruptedException{
	//recycled prices
 
		 driver.findElement(By.xpath("//a[contains(.,'Recycled Prices')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Mumbai')])[1]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("//a[contains(.,'Recycled Prices')]")).click();
		 Thread.sleep(2000);
		 driver.findElement(By.xpath("(//a[contains(.,'Ahmedabad')])[1]")).click();
		 Thread.sleep(2000);
  }
  

  @DataProvider
  public Object[][] dp() {
     Object[][] obj = new Object[1][1];
     
     obj[0][0]="rinku.borole@polymerupdate.com";
     obj[0][1]="Rinkuborole@12";
     
     
	return obj;
  }
  

}
