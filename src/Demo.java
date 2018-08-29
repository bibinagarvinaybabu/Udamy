import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class Demo {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();		
		options.addArguments("--disable-extensions");
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
		//driver.close();
		
	
		
		
		quitmethod(driver);
	}

	public static void quitmethod(WebDriver driver){
		driver.quit();
	}
}
