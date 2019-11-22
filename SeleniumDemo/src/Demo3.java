import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//driver.navigate().to("https://www.gmail.com/");
		
		String title = driver.getTitle();

		WebElement email = driver.findElement(By.id("identifierId"));
		email.sendKeys("asmithaup97@gmail.com");
		//WebElement log1 = driver.findElement(By.id("identifierNext"));
		
		//log1.click();
		Thread.sleep(10000);
		
	}

}
