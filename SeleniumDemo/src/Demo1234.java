import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1234 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement pass=driver.findElement(By.xpath("//input[@type='password']"));
		
		driver.findElement(By.xpath("//input[@type='password'])")).sendKeys(pass.getText());
		
	}

}
