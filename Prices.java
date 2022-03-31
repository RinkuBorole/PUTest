package sipl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prices {

		public static void Login(WebDriver driver) 
		{
			//login	
			driver.findElement(By.xpath("//*[@id=\"dialog\"]/div/a[1]/i")).click();
			 driver.findElement(By.id("login-section")).click();
			 driver.findElement(By.id("txtUserName")).sendKeys("rinku.borole@polymerupdate.com");
			 driver.findElement(By.id("txtPassword")).sendKeys("Rinkuborole@12");
			 driver.findElement(By.id("btnSubmit")).click();
			// driver.findElement(By.xpath("//*[@id=\"dialog\"]/div/a[1]/i")).click();
		}
		
		
		public static void Recycled_prices(WebDriver driver) throws InterruptedException
		{
			//recycled prices
			 driver.findElement(By.xpath("//a[@href='#'][contains(.,'Recycled Prices')]")).click();
			 driver.findElement(By.xpath("(//a[contains(.,'Mumbai')])[1]")).click();
			 boolean status = driver.findElement(By.xpath("//span[contains(.,'Recycled Polymer Prices For SOUTH ASIA')]")).isDisplayed();
				
				if(status){
					System.out.println("Navigated to correct webpage");
				} else {
					System.out.println("Error page occurs");
				}
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//a[@href='#'][contains(.,'Recycled Prices')]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("(//a[contains(.,'Ahmedabad')])[1]")).click();
		}
		
		public static void Middle_East(WebDriver driver)
		{
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
		
		
		public static void South_Asia(WebDriver driver)
		{
			//South Asia
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
		
		
		public static void China(WebDriver driver)
		{
			//China
			 
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
		
		
		public static void Far_East_Asia(WebDriver driver)
		{
			//Far East Asia
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
		
		
		public static void South_East_Asia(WebDriver driver)
		{
			//South East Asia
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
		
		
		public static void Europe(WebDriver driver)
		{
			//Europe
	  		driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		
	  		//Naphtha
	  		driver.findElement(By.xpath("(//a[contains(.,'Naphtha')])[5]")).click();
	  		driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 
	  		//polymers
	  		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[14]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[14]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[27]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[14]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[11]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'PET')])[11]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'PS')])[10]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'ABS')])[10]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[7]")).click();
	  		 
	  		 //Aromatics
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Benzene')])[4]")).click();
	 		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Toluene')])[5]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Methanol')])[5]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Para Xylene')])[3]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Ortho Xylene')])[4]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Solvent Xylene')]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Acetone')])[4]")).click();
	  		 driver.findElement(By.xpath("//a[contains(.,'Europe')]")).click();
	  		 driver.findElement(By.xpath("(//a[contains(.,'Phenol')])[4]")).click();
		}
		
		
		public static void Turkey(WebDriver driver)
		{
			//Turkey
	   		driver.findElement(By.xpath("//a[contains(.,'Turkey News & Prices')]")).click();

	   		//polymers
	   		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[16]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'Turkey News & Prices')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[16]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'Turkey News & Prices')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[31]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'Turkey News & Prices')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[16]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'Turkey News & Prices')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[13]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'Turkey News & Prices')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'PS')])[12]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'Turkey News & Prices')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[8]")).click();	 
		}
		
		
		public static void USA_America(WebDriver driver)
		{
			//USA & Latin America
	   		driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		
	   		//polymers - USA
	   		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[20]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[20]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[39]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[20]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[17]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'PET')])[16]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'PS')])[16]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'ABS')])[15]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Polycarbonate')])[9]")).click();
	   		 
	   		 //Aromatics - USA
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Benzene')])[5]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Toluene')])[6]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Methanol')])[6]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Para Xylene')])[4]")).click();
	   	 	 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Mixed Xylene')])[2]")).click();
	   		 
	   	//polymers - Latin America
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'PP')])[22]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'HDPE')])[22]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'LDPE')])[41]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'LLDPE')])[22]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'PVC')])[19]")).click();
	   		 
	   		 //Aromatics - Latin America
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Benzene')])[6]")).click();
	   		 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Toluene')])[7]")).click();
	   	 	 driver.findElement(By.xpath("//a[contains(.,'USA & Latin America')]")).click();
	   		 driver.findElement(By.xpath("(//a[contains(.,'Mixed Xylene')])[3]")).click();
		}

		
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
			//C:\Users\admin\Desktop\Rinku\selenium\Chromedriver
			WebDriver driver = new ChromeDriver();
			driver.get("https://polymerupdate.com/default.aspx");
			driver.manage().window().maximize();
			//driver.findElement(By.xpath("//*[@id=\"dialog\"]/div/a[1]/i")).click();
			Thread.sleep(2000);
		

			Login(driver);
			Recycled_prices(driver);
			Middle_East(driver);
			China(driver);
			Far_East_Asia(driver);
			South_East_Asia(driver);
			Europe(driver);
			Turkey(driver);
			USA_America(driver);
			
			// Actions a = new Actions(driver);
	 		 
	 		 
	 		driver.close();
				 
		 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			 
			
		/*	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.MILLISECONDS);
			 WebDriverWait wait = new WebDriverWait(driver, 120);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/a"))).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/a")).click();
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/ul/li[1]/ul/li[2]/a"))).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_crude_repcrudesouthasiaprices_btnChart_1\"]")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_crude_repcrudesouthasiaprices_btnChart_2\"]")).click();
			 Thread.sleep(2000);
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/a"))).click();
			 driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/ul/li[2]/ul/li[2]/a")).click();
			 Thread.sleep(2000);
			driver.findElement(By.xpath("//*[@id=\"ContentPlaceHolder1_naphtha_repnaphtha_imgbtnprices\"]")).click();
			Thread.sleep(2000);
			
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/a"))).click();
			 driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/ul/li[7]/ul/li[2]/a")).click();
			 Thread.sleep(2000);
			 JavascriptExecutor js = (JavascriptExecutor) driver ;
			 WebElement e1 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div/div/div[1]/div[7]/div/table/thead[1]/tr/th"));
			 js.executeScript("arguments[0].scrollIntoView(true);", e1);
			 Thread.sleep(2000);
			 WebElement e2 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div/div/div[1]/div[11]/div/table/thead[1]/tr/th"));
			 js.executeScript("arguments[0].scrollIntoView(true);", e2);
			 Thread.sleep(2000);	
			 WebElement e3 = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/div/div/div/div[1]/div[14]/div/table/thead[1]/tr/th"));
			 js.executeScript("arguments[0].scrollIntoView(true);", e3);
			 Thread.sleep(2000);
			 WebElement Element = driver.findElement(By.xpath("//*[@id=\"form1\"]/div[3]/footer/div/div[2]/a[4]"));	
		       js.executeScript("arguments[0].scrollIntoView(true);", Element);
		       
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"form1\"]/div[3]/header/nav/div/div/div[2]/div/ul/li[3]/a"))).click();
		     driver.findElement(By.xpath("")).click();
		     */  
		       
			

		}

	}




