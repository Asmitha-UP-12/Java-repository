import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo10 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");

		driver.navigate().to("https://www.google.com/");
		driver.manage().window().maximize();
		//String title = driver.getTitle();
		WebElement as1=driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		as1.sendKeys("java");
		Thread.sleep(1000);
		List<WebElement> as=driver.findElements(By.xpath("//div[@jsmodel=\"vWNDde\"]"));
		for(WebElement a:as)
		{
			System.out.println(a.getText());
		}
		
		
		
	}

}
