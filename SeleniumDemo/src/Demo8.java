import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.google.com/");
		String title = driver.getTitle();
		WebElement as=driver.findElement(By.name("q"));
		
		as.sendKeys("java");
		Thread.sleep(1000);
		
		
		WebElement button=driver.findElement(By.name("btnK"));
		
		button.click();
		
		Thread.sleep(1000);
	     WebElement a=driver.findElement(By.xpath("//a[contains(.,'Images')]"));
		a.click();
		
		
		Thread.sleep(1000);
		WebElement as1=driver.findElement(By.id("//img[@id=\"rT8rqQKh8jt3DM:\"]"));
		as1.click();
		
	}

}
