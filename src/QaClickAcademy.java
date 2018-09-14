import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class QaClickAcademy {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Eclipse IDE 4.3\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		
		driver.get("http://qaclickacademy.com/interview.php");
		
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[1]")).getText());
		//softassertion(driver);
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());	
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[2]")).getText());
		//softassertion(driver);
		driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).click();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.findElement(By.xpath("//*[@id='tablist1-tab1']/following-sibling::li[3]")).getText());
		System.out.println(driver.findElement(By.xpath("//*[contains(@text(),'selenium')]")).getText());
		//softassertion(driver);
	
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
	public static void softassertion(WebDriver driver){
		
		try {
			Thread.sleep(5000);
			driver.navigate().back();
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println(e);
		}
		
	}
}
