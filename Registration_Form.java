package sipl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Registration_Form {
	WebDriver driver;
	String URL = "https://polymerupdate.com/default.aspx";
	
	
	@BeforeTest
	public void setup() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(URL);
		
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//i[@class='fa fa-times-circle']")).click();
		//driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		//Thread.sleep(2000);
	
	}
	
	@Test(priority = 1)
	public void Register() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
		boolean status = driver.findElement(By.xpath("//i[contains(@class,'fa fa-newspaper-o')]")).isDisplayed();
		
		if(status){
			System.out.println("User is succefully navigate to Register page.");
		} else {
			System.out.println("Error page occurs");
		}
		
		Thread.sleep(2000);
		
	}

	
	@Test(dataProvider = "dp")
	public void Fields(String Firstname, String Lastname ) throws InterruptedException
	{
		//WebElement myDynamicElement = 
			//	(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[contains(@name,'txtFirstName')]")));
		
	/*	WebElement element;
		WebDriverWait wait = new WebDriverWait(driver, 100);
		element= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[contains(@name,'txtFirstName')]")));
		element.sendKeys("abc");
	*/	
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'txtFirstName')]")).sendKeys(Firstname);
		driver.findElement(By.xpath("//input[contains(@name,'txtLastName')]")).sendKeys(Lastname);
		//driver.findElement(By.id("txtBusinessEmailAddress")).sendKeys(Email_Id);
		//driver.findElement(By.id("txtCompanyName")).sendKeys(Company_Name);
		//driver.findElement(By.id("txtCompanyAddress")).sendKeys(Company_Address);
		Thread.sleep(2000);
		
		
		
	} 
	

	@AfterClass
	public void closed()
	{
		driver.close();
	} 
	
	
	@DataProvider
	  public Object[][] dp() {
		return new Object[][]
				{
			{"rinku", "borole"}
				};
		
		
		
	   /*  Object[][] obj = new Object[1][1];
	     
	     obj[0][0]="rinkuborole12";
	     obj[0][1]="123";
	    // obj[0][2]="rinku.borole@polymerupdate.com";
	    // obj[0][3]="SIPL";
	    // obj[0][4]="Mumbai";
	    		 
	   */
	     
		
	     
	  }
	
	
		


	}
	

