

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class CustomisedXpath {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.xpath("//div[@class = 'lst-c']/div/div[2]/div/input")).sendKeys("Selenium Automation");
		driver.findElement(By.xpath("//input[@value = 'Google Search']s")).click();
	
		//driver.close();
		quitmethod(driver);
	}

	public static void quitmethod(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
}
