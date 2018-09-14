package CSSProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Css {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
			
			driver.findElement(By.cssSelector("input[id = 'username']")).sendKeys("hellocss");
			
			driver.findElement(By.cssSelector("input[id = 'password']")).sendKeys("12345");
			
			driver.findElement(By.cssSelector(".button.r4.wide.primary")).click();
			
			System.out.println(driver.findElement(By.cssSelector("div[id = 'error'][class='loginError']")).getText());
			
			Terminator(driver);

	}

	public static void Terminator(WebDriver driver){
		driver.close();
		driver.quit();
	}
}
