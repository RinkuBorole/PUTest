package sipl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NewTest {
	 WebDriver driver;
	 String URL= "https://polymerupdate.com/default.aspx";
	
  @Test(dataProvider = "dp")
  public void f(String user, String password) {
	  driver.findElement(By.xpath("(//i[contains(@aria-hidden,'true')])[3]")).click();
		 driver.findElement(By.id("login-section")).click();
		 driver.findElement(By.id("txtUserName")).sendKeys(user);
		 driver.findElement(By.id("txtPassword")).sendKeys(password);
		 driver.findElement(By.id("btnSubmit")).click();
	  
  }

  @BeforeTest
  public void beforeMethod() throws InterruptedException {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
		//C:\Users\admin\Desktop\Rinku\selenium\Chromedriver
		driver = new ChromeDriver();
		driver.get(URL);
		//driver.manage().window().maximize();
		//driver.findElement(By.xpath("//*[@id=\"dialog\"]/div/a[1]/i")).click();
		Thread.sleep(2000);
	//login	
			  
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
  
  @Test
	public void Middle_East() throws InterruptedException{	 
	//Middle East
	  driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 //Crude
		 driver.findElement(By.xpath("(//a[contains(.,'Brent')])[1]")).click();
		 
		 //Naphtha
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Naphtha')])[1]")).click();
		 
		 //polymers
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[3]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath(" (//a[contains(.,'LLDPE')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PET')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Middle East')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[1]")).click();
  }
  
  @Test
	public void South_Asia() throws InterruptedException{
	  driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 
		//polymers
		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[6]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[6]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[11]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[6]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[3]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PET')])[3]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PS')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'ABS')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'SAN')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'EVA')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[2]")).click();
		 
		 //Aromatics
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Benzene')])[1]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Toluene')])[1]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Methanol')])[1]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Solvent MX')])[1]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 
		 //Chemicals
		 driver.findElement(By.xpath("//a[contains(.,'Bulk')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Mumbai')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Ahmedabad')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Kolkata')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Delhi')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Chennai')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Offer Prices')]")).click();
		 
		 //Open Market Prices
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'India')])[10]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Pakistan')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Nepal')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Bangladesh')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South Asia')]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Sri Lanka')]")).click();
		 
	
 }
  
  @Test
	public void China() throws InterruptedException{
	  driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 
		//polymers
		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[8]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[8]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[15]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[8]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[5]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PET')])[5]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PS')])[4]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'ABS')])[4]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'SAN')])[4]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[3]")).click();
		 
		 //Aromatics
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Benzene')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Toluene')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Methanol')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Mixed Xylene')])[1]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Ortho Xylene')])[1]")).click();
		 
		 //Chemicals
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Butadiene Rubber')])[1]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Ethylene Glycol')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Isopropanol')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Nitrile Rubber')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[4]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Propylene Glycol')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Propylene Oxide')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Styrene Butadiene Rubber')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Caustic Soda')])[1]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Cyclohexanone')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Diethylene Glycol')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Dichloroethane')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Dioctyl Phthalate')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Methyl Ethyl Ketone')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Carbonate Soda')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Octanol')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Acetone')])[1]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Phenol')])[1]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'China')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Bisphenol-A')]")).click();
  }
  
  @Test
	public void Far_East_Asia() throws InterruptedException{
	  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 
		//polymers
		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[10]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[10]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[19]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[10]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[7]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PET')])[7]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PS')])[6]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'ABS')])[6]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'SAN')])[5]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[5]")).click();
		 
		 //Aromatics
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Benzene')])[3]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Toluene')])[3]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Methanol')])[3]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Para Xylene')])[1]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Isomer MX')])[1]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Ortho Xylene')])[2]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Solvent MX')])[2]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Acetone')])[2]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Phenol')])[2]")).click();
		 
		 //Intermediate
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PA')])[1]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'2EH')])[1]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'DOP')])[1]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'NBA')])[1]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'ACN')])[1]")).click();
		  driver.findElement(By.xpath("//a[contains(.,'Far East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Caustic Soda')])[2]")).click();
}

  @Test
 	public void South_East_Asia() throws InterruptedException{
 	  driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 
		//polymers
		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[12]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[12]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[23]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[12]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[9]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PET')])[9]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PS')])[8]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'ABS')])[8]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'SAN')])[6]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[6]")).click();
		 
		 //Aromatics
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Toluene')])[4]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Methanol')])[4]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Para Xylene')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Isomer MX')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Ortho Xylene')])[3]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Solvent MX')])[3]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Acetone')])[3]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Phenol')])[3]")).click();
		 
		 //Intermediate
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'PA')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'2EH')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'DOP')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'NBA')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'ACN')])[2]")).click();
		 driver.findElement(By.xpath("//a[contains(.,'South East Asia')]")).click();
		 driver.findElement(By.xpath("(//a[contains(.,'Caustic Soda')])[3]")).click();
 }
  
  
  @AfterTest
  public void afterTest() {
	  driver.close();
  }
  
  
  @DataProvider
  public Object[][] dp() {
	  Object[][] obj = new Object[2][2];
	     
	     obj[0][0]="rinku.borole@polymerupdate.com";
	     obj[0][1]="Rinkuborole@12";
	     
	     obj[1][0]="rinkubtest@gmail.com";
	     obj[1][1]="rinku123";
	     
		return obj;
    };
}
