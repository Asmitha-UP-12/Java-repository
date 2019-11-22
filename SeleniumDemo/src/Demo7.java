import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.flipkart.com/");
		WebElement as=driver.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]"));
		as.click();
		
		Thread.sleep(5000);
		List<WebElement> as1=driver.findElements(By.xpath("//ul[@class='_114Zhd']/li"));
		for(WebElement name:as1)
		{
			System.out.println(name.getText());
		}

}
}
