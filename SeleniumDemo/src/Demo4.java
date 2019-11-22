import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo4 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.actitime.com/login.do");
		String title = driver.getTitle();
		WebElement as=driver.findElement(By.name("username"));
		as.sendKeys("admin");
		WebElement as1=driver.findElement(By.name("pwd"));
		as1.sendKeys("manager");
		Thread.sleep(2000);
		WebElement as2=driver.findElement(By.id("loginButton"));
		as2.click();
		}

}
