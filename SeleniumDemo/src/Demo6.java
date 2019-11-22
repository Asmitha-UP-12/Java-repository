import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Demo6 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		// driver.get("https://www.facebook.com/");?
		driver.navigate().to("https://www.urbanladder.com/");
		driver.manage().window().maximize();
		WebElement as=driver.findElement(By.xpath("//span[contains(.,'Bedroom')]/parent::li/descendant::ul[@class='taxonslist']/li"));
		
		
		//Thread.sleep(10000);
		//driver.findElement(By.xpath("//a[@class=\"close-reveal-modal hide-mobile\"]")).click();
		//Thread.sleep(10000);
		//List<WebElement> as=driver.findElements(By.xpath("//ul[@class='_1r0R5']/li"));
		//for(WebElement a:as)
		//{
			//System.out.println(a.getText());
		//}

		//WebElement as3 = driver.findElement(By.xpath("//li[@class=\"topnav_item diningunit\"]"));
		//System.out.println(as3.getText());
		 //WebElement as=driver.findElement(By.xpath("//input[@class='textfield email required input_authentication email-suggest error']"));
		 //as.sendKeys("asmithaup97@gmail.com");
		 
		 //WebElement as1=driver.findElement(By.xpath("//a[@class=\"hide-password link-color small\"]"));
		 //as1.sendKeys("a123");
		//WebElement as2=driver.findElement(By.xpath("//input[@class='button primary signup']"));
		

		 //as2.click();
	}
}