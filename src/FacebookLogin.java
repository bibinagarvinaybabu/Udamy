import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("vinay210292@gmail.com");
		
		
		
		
		
		//driver.close();
		quitmethod(driver);
	}

	public static void quitmethod(WebDriver driver) throws InterruptedException{
		Thread.sleep(5000);
		driver.quit();
	}
}
