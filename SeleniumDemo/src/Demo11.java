import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo11 {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			// driver.get("https://www.facebook.com/");

			driver.navigate().to("https://www.mytra.com/");
			driver.manage().window().maximize();
			Thread.sleep(1000);
			WebElement as=driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
			as.sendKeys("kurta",Keys.ENTER);
			
			
	}

}
