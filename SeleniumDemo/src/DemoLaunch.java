import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoLaunch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", ".\\software\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.naukri.com/");
		String title = driver.getTitle();
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		String parent = driver.getWindowHandle();// it return parent
		System.out.println(parent);

		Set<String> wins = driver.getWindowHandles();// it returns both parent and its children
		//ArrayList<String> a=new ArrayList(wins);
		ArrayList<String> a=new ArrayList();
		a.addAll(wins);
		for(int i=a.size()-1;i>=0;i--)
		{
			driver.switchTo().window(a.get(i)).close();
		}
		//wins.remove(parent);
		//for (String win : wins) {
			//driver.switchTo().window(win).manage().window().maximize();
			//driver.close();
			
		//}
		/*driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.close();*/
	}

}
