import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Myntra {
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");

			
			WebDriver driver = new ChromeDriver();
			// driver.get("https://www.facebook.com/");

			driver.navigate().to("https://www.myntra.com/");
			Thread.sleep(1000);
			WebElement e=driver.findElement(By.xpath("//input[@placeholder=\"Search for products, brands and more\"]"));
			e.sendKeys("kurta");
			WebElement e1=driver.findElement(By.xpath("//span[@class=\"myntraweb-sprite desktop-iconSearch sprites-search\"]"));
			e1.click();
			WebElement e2=driver.findElement(By.xpath("//img[@src=\"https://assets.myntassets.com/dpr_2,q_60,w_210,c_limit,fl_progressive/assets/images/2477343/2018/2/22/11519301743689-Libas-Women-Green-Woven-Design-Pathani-Kurta-4531519301743438-1.jpg\"]"));
			e2.click();
			
			
			
	}

}
