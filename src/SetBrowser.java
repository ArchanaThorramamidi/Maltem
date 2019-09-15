import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetBrowser {

	
	public static WebDriver setChromeDriver()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\jars\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
		return driver;
	}
	
	
	
}
