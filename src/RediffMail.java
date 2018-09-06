import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;




public class RediffMail {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://www.rediff.com/");
		
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
		driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//a[@title = 'Already a user? Sign in']")).click();
		driver.findElement(By.cssSelector("#login1")).sendKeys("vinay test");
		driver.findElement(By.xpath("//*[contains(@id,'passwo')]")).sendKeys("12345");
		driver.findElement(By.cssSelector("#remember[type = 'checkbox']")).click();
		driver.findElement(By.xpath("//input[@title = 'Sign in']")).click();
		System.out.println(driver.getTitle());
		
		//driver.close();
		quitmethod(driver);
	}

	public static void quitmethod(WebDriver driver) throws InterruptedException{
		Thread.sleep(2000);
		driver.quit();
	}
}
