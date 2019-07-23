package casestudy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class utility {
	static WebDriver driver;
	public static WebDriver startBrowser(String url)
	
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Training_C2a.05.01\\Desktop\\nan\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		return driver;
	
	}
}
