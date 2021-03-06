import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class salesForce {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://login.salesforce.com/");
		driver.findElement(By.xpath("//input[@id = 'username']")).sendKeys("Hello");
		driver.findElement(By.xpath("//input[@id = 'password']")).sendKeys("12345");
		try {
			driver.findElement(By.xpath("//input[@id='Login']")).click();
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(driver.findElement(By.xpath("//div[@id='error'][@class='loginError']")).getText());
		//regular expressions in xpath
		/*//tagName[contains(@attribute,'attribute value')]
		 * 
		 * 
		 */
		//regular expression for CSS
		/* tagName[Attribute* = 'value']
		 * 
		 * 
		 * 
		 */
		
		
		
		
		//driver.close();
		quitmethod(driver);
	}

	public static void quitmethod(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
}
