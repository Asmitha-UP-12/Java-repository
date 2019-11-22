import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo12 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
		
		driver.navigate().to("https://www.facebook.com/");
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("asmithaup97@gmail.com");
		
		WebElement pas=driver.findElement(By.id("pass"));
		pas.sendKeys("123sai123");
		WebElement next=driver.findElement(By.id("identifierNext"));
		
        next.click();
		
		String title = driver.getTitle();
	}

}
