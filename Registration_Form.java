package sipl;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


public class Registration_Form {

WebDriver driver;


public String username = "tester";
public String pswrd = "BJXW2C(#:R0]@&k";
public String url = "beta.polymerupdate.com";
boolean status = false;


@BeforeClass
public void setUp() throws UnsupportedEncodingException {	
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Desktop\\chromedriver.exe");
	driver = new ChromeDriver();

	 try {
		 String pass = URLEncoder.encode(pswrd, "utf8");
			String URL = "https://" + username + ":" + pass + "@" + url;
			driver.get(URL);
     } catch (Exception e) {
         System.out.println(e.getMessage());
     }

}


//Opening browser with the given URL and navigate to Registration Page
@BeforeMethod
public void openBrowser()
{
	driver.manage().window().maximize();
WebElement signUpButton = driver.findElement(By.xpath("(//a[@id='registred-section'])[1]"));
signUpButton.click(); 

}

//Verifying elements on Registration page
@Test
public void verifyElemntsOnPageTest()
{
WebElement signUpTitle = driver.findElement(By.xpath("//span[contains(.,'Register here')]"));
signUpTitle.isDisplayed();
}

/*//Verifying redirection to the terms and conditions page
@Test
public void termsRedirectionTest()
{
WebElement termsLink = driver.findElement(By.xpath("(//a[contains(.,'Terms & Conditions')])[1]"));
termsLink.click(); 

System.out.println(driver.getCurrentUrl());
System.out.println(driver.getTitle());


  
 
Set <String> allWindows = driver.getWindowHandles();

for(String handle : allWindows)
{
driver.switchTo().window(handle);
}
 
 String expectedURL = "https://beta.polymerupdate.com/terms-conditions.aspx";
String actualURL = driver.getCurrentUrl();
//System.out.println(actualURL);
Assert.assertEquals(actualURL, expectedURL);
  
String expectedTitle = "TERMS & CONDITIONS";
String actualTitle = driver.getTitle();
//System.out.println(actualTitle);
Assert.assertEquals(actualTitle, expectedTitle); 

} */

//Registration with all valid data
@Test
public void validRegistrationTest() throws InterruptedException{ 
	
	WebDriverWait wait = new WebDriverWait(driver, 1000);
	
Select Salutation = new Select(driver.findElement(By.id("ddlSalutation")));
Salutation.selectByVisibleText("Dr");
Thread.sleep(2000);

WebElement FirstName = driver.findElement(By.id("txtFirstName"));
FirstName.sendKeys("test");

WebElement LastName = driver.findElement(By.id("txtLastName"));
LastName.sendKeys("Name");

WebElement email = driver.findElement(By.id("txtBusinessEmailAddress"));
email.sendKeys("test6.testing@gmail.com");

		String expectedErrorMsg = "Already Registered";
		
		WebElement exp = driver.findElement(By.xpath("//div[@id='availability']"));
		
		String actualErrorMsg = exp.getAttribute("placeholder");
		
		Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

WebElement CompanyName = driver.findElement(By.id("txtCompanyName"));
CompanyName.sendKeys("SIPL");

WebElement CompanyAddress = driver.findElement(By.id("txtCompanyAddress"));
CompanyAddress.sendKeys("SIPL");
Thread.sleep(2000);

WebElement City = driver.findElement(By.id("txtCity"));
City.sendKeys("Kalyan");

Select Country = new Select(driver.findElement(By.xpath("//select[contains(@name,'ddlCountry')]")));
Country.selectByVisibleText("Angola");
//Thread.sleep(2000);

WebElement State = driver.findElement(By.id("txtState"));
State.sendKeys("Delhi");
Thread.sleep(2000);

WebElement MobileNumber = driver.findElement(By.id("txtMobileNumber"));
MobileNumber.sendKeys("9876543210");
Thread.sleep(2000);

WebElement BusinessPhoneNumber = driver.findElement(By.id("txtBusinessPhoneNumber"));
BusinessPhoneNumber.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("chkTermsConditions"));
termsOfServices.click();

Thread.sleep(2000);

/*ChromeOptions options = new ChromeOptions();

options.addArguments("start-maximized");

options.addArguments("disable-infobars");

options.addArguments("--disable-extensions");

new WebDriverWait(driver, 10).until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.xpath("//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")));

new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='recaptcha-checkbox-border']"))).click();

Thread.sleep(2000);


String expectedErrorMsg = "Please enter your First Name";

WebElement exp = driver.findElement(By.xpath("//input[@placeholder='Please enter your First Name']"));

String actualErrorMsg = exp.getAttribute("placeholder");

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

*/
//WebElement signUp = driver.findElement(By.id("btnSubmit"));
//signUp.click();

Thread.sleep(2000);

/*
String expectedURL = "https://accounts.lambdatest.com/email/verify";
String actualURL = driver.getCurrentUrl();
Assert.assertEquals(actualURL, expectedURL);

String expectedTitle = "Verify Your Email Address - LambdaTest";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);

*/
}

/*
//Verifying redirection to the terms and conditions page
@Test
public void termsRedirectionTest()
{
WebElement termsLink = driver.findElement(By.xpath("//a[contains(text(),'Terms')]"));
termsLink.click(); 

Set <String> allWindows = driver.getWindowHandles();

for(String handle : allWindows)
{
driver.switchTo().window(handle);
} 

String expectedURL = "https://www.lambdatest.com/terms-of-service";
String actualURL = driver.getCurrentUrl();
//System.out.println(actualURL);
Assert.assertEquals(actualURL, expectedURL);

String expectedTitle = "Terms of Service - LambdaTest";
String actualTitle = driver.getTitle();
//System.out.println(actualTitle);
Assert.assertEquals(actualTitle, expectedTitle); 
}

//Verifying Privacy policy page redirection
@Test
public void privacyPolicyRedirectionTest()
{
WebElement privacyPolicyLink = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));
privacyPolicyLink.click();

Set <String> allWindows = driver.getWindowHandles();

for(String handle : allWindows)
{
driver.switchTo().window(handle);
} 

String expectedURL = "https://www.lambdatest.com/privacy";
String actualURL = driver.getCurrentUrl();
//System.out.println(actualURL);
Assert.assertEquals(actualURL, expectedURL);

String expectedTitle = "Privacy Policy | LambdaTest";
String actualTitle = driver.getTitle();
//System.out.println(actualTitle);
Assert.assertEquals(actualTitle, expectedTitle);
} 
*/
/*
//Verifying redirection to the Login page from Registration page
@Test
public void loginRedirectionTest()
{
WebElement loginLink = driver.findElement(By.xpath("//a[contains(text(),'Login')]"));
loginLink.click();

String expectedURL = "https://accounts.lambdatest.com/login";
String actualURL = driver.getCurrentUrl();
//System.out.println(actualURL);
Assert.assertEquals(actualURL, expectedURL);

String expectedTitle = "Login - LambdaTest";
String actualTitle = driver.getTitle();
//System.out.println(actualTitle);
Assert.assertEquals(actualTitle, expectedTitle); 
}

//Verifying redirection to the landing page
@Test
public void landingPageRedirectionTest()
{
WebElement lambdaTestLogo = driver.findElement(By.xpath("//p[@class='logo-home']//a//img"));
lambdaTestLogo.click();

String expectedURL = "https://www.lambdatest.com/";
String actualURL = driver.getCurrentUrl();
Assert.assertEquals(actualURL, expectedURL);


}*/

/*
// Registration with all valid data
@Test
public void validRegistrationTest(){ 

WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test6.lambdatest@gmail.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@12345");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedURL = "https://accounts.lambdatest.com/email/verify";
String actualURL = driver.getCurrentUrl();
Assert.assertEquals(actualURL, expectedURL);

String expectedTitle = "Verify Your Email Address - LambdaTest";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);


}
*/
/*
// Registration without providing Company Name field
@Test
public void emptyCompanyNameTest()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test7.lambdatest@gmail.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@12345");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();


* Set <String> allWindows = driver.getWindowHandles();
* 
* for(String handle : allWindows) { driver.switchTo().window(handle); }

String expectedURL = "https://accounts.lambdatest.com/email/verify";
String actualURL = driver.getCurrentUrl();
Assert.assertEquals(actualURL, expectedURL);

String expectedTitle = "Verify Your Email Address - LambdaTest";
String actualTitle = driver.getTitle();
Assert.assertEquals(actualTitle, expectedTitle);
}

// Registration without providing Name field
@Test
public void emptyNameTest()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test@test.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@123");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedErrorMsg = "Please enter your Name";

WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Please enter your Name')]"));
String actualErrorMsg = exp.getText();

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

}

// Registration without providing user email field
@Test
public void emptyEmailTest()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("test");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@123");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedErrorMsg = "Please enter your Email Address";

WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Please enter your Email Address')]"));
String actualErrorMsg = exp.getText();

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
}

// Registration with email id which already have account
@Test
public void invalidEmailTest()
{

WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test@test.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@123");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedErrorMsg = "This email is already registered";

WebElement exp = driver.findElement(By.xpath("//p[@class='error-mass']"));
String actualErrorMsg = exp.getText();

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
}

// Registration without providing password field
@Test
public void emptyPasswordTest()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test@test.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedErrorMsg = "Please enter a desired password";

WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Please enter a desired password')]"));
String actualErrorMsg = exp.getText();

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
}

// Registration with invalid password
@Test
public void inValidPasswordTest()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test@test.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("T");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedErrorMsg = "Password should be at least 8 characters long";

WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Password should be at least 8 characters long')]"));
String actualErrorMsg = exp.getText();

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
//Password should be at least 8 characters long
}

// Registration without providing user phone number field
@Test
public void emptyPhoneTest()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test@test.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@123");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedErrorMsg = "The phone field is required.";

WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'The phone field is required.')]"));
String actualErrorMsg = exp.getText();

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);
}

// Registration with providing invalid user phone number field
@Test
public void inValidPhoneTest()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test@test.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@123");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("98");

WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedErrorMsg = "Please enter a valid Phone number";

WebElement exp = driver.findElement(By.xpath("//p[contains(text(),'Please enter a valid Phone number')]"));
String actualErrorMsg = exp.getText();

Assert.assertEquals(actualErrorMsg, expectedErrorMsg);

//Please enter a valid Phone number
}

// Registration without accepting terms and condition tickbox
@Test
public void uncheckedTerms()
{
WebElement companyName = driver.findElement(By.name("organization_name"));
companyName.sendKeys("TestCompany");

WebElement fullName = driver.findElement(By.name("name"));
fullName.sendKeys("TestName");

WebElement email = driver.findElement(By.name("email"));
email.sendKeys("test@test.com");

WebElement password = driver.findElement(By.name("password"));
password.sendKeys("Test@123");

WebElement phone = driver.findElement(By.name("phone"));
phone.sendKeys("9876543210");

//WebElement termsOfServices = driver.findElement(By.id("terms_of_service"));
//termsOfServices.click();

WebElement signUp = driver.findElement(By.xpath("//button[contains(@class,'btn sign-up-btn-2 btn-block')]"));
signUp.click();

String expectedTermsErrorMessage = "To proceed further you must agree to our Terms of Service and Privacy Policy";
WebElement uncheckedTermCheckbox = driver.findElement(By.xpath("//p[@class='error-mass mt-2']"));
String actualTermsErrorMessage = uncheckedTermCheckbox.getText();
//To proceed further you must agree to our Terms of Service and Privacy Policy

Assert.assertEquals(actualTermsErrorMessage, expectedTermsErrorMessage);
}
*/
// Closing the browser session after completing each test case
@AfterClass
public void tearDown() throws Exception {
//if (driver != null) {
//((JavascriptExecutor) driver).executeScript("lambda-status=" + status);
//driver.quit();
}
}

