import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
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
		 WebElement as1=driver.findElement(By.name("q"));
	        
		as1.clear();
		Thread.sleep(3000);
        as1.sendKeys("seleniun");
        Thread.sleep(1000);
        WebElement button1=driver.findElement(By.className("FAuhyb"));
		
		button1.click();
		driver.navigate().back();
		
		
		

		
		
		

	}

}
