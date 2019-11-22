import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");

		
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.google.com/");
		WebElement a=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		a.sendKeys("java");
		
		
	WebElement b=driver.findElement(By.xpath("//span[@class=\"nS8rZ z1asCe MZy1Rb\"]"));
		b.click();
	}

}
