import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class salesForce {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("Hello");
		driver.findElement(By.name("pw")).sendKeys("12345");
		try {
			driver.findElement(By.cssSelector("input[id='Login']")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(driver.findElement(By.cssSelector("div[id='error'][class='loginError']")).getText());
		
		
		
		
		
		
		//driver.close();
		quitmethod(driver);
	}

	public static void quitmethod(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
}
