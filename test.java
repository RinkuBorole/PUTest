package sipl;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class test {





	public static void main(String[] args) throws IOException {

			System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\admin\\\\Desktop\\\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://polymerupdate.com");
			driver.findElement(By.xpath("//a[contains(.,'Register')]")).click();
			driver.findElement(By.xpath("(//a[contains(@target,'_blank')])[30]")).click();
			System.out.println(driver.getTitle());
			driver.close();
	}

}
