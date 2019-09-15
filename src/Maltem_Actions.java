import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Maltem_Actions {
	
	static WebDriver driver= SetBrowser.setChromeDriver();
	static String HomePage="http://book.theautomatedtester.co.uk";
	static By radioButtonLink= By.xpath("//*[@id='radiobutton']");
	static By titleLink = By.xpath("//*[text()='Assert that this text is on the page']");		
	static By  Link1 = By.xpath("//*[@id='multiplewindow'][1]");
	static By Link2= By.xpath("//*[@id='multiplewindow'][2]");
	static By Link3 = By.xpath("//*[text()='Click this link to load a page with AJAX']");
	static By ajaxText1 = By.xpath("//*[contains(text(),'The following text has been']");
	static By dropDownLink = By.xpath("//*[@id='selecttype']");
	static By dropDownElementLink = By.xpath("//*[@id='selecttype']/option[2]");
	public static void clickChapterLink(int num)
	{
		driver.findElement(By.xpath("//*[text()='Chapter"+num+"']")).click();
	}
	public static void openHomePage() throws InterruptedException
	{
		
		driver.manage().window().maximize();
		driver.get(HomePage);
		
		//driver.wait(100);
		//driver.close();
//		driver.getTitle();
		
	}	
	public static boolean checkAndClickRadioButton() throws InterruptedException
	{
		if(driver.findElement(radioButtonLink).isDisplayed())
		{
			
			driver.findElement(radioButtonLink).click();
			Thread.sleep(500);
			driver.close();
			return true;
		}
		return false;
	}
	public static boolean checkTitleIsDisplayed()
	{
		if(driver.findElement(titleLink).isDisplayed())
		{
			driver.close();
			return true;
		}
		
		return false;
	}
	
	public static void clickLink()
	{
		
		
		driver.findElement(Link1).click();
		
		driver.findElement(Link2).click();
		driver.close();
	}
	public static void clickLink3()
	{
		driver.findElement(Link3).click();
		if(driver.findElement(ajaxText1).isDisplayed())
		{
			System.out.println("Text is diaplayed after ajax operation");
		}
	}
	public static void clickDropDown() {
		driver.findElement(dropDownLink).click();
	}
	public static void selectDropdownElement()
	{
		driver.findElement(dropDownElementLink).click();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.close();
	}
	public static String checkTheDynamicText()
	{
		return driver.findElement(By.xpath("//*[@id='leftdiv']")).getText();
	}
	public static void clickIndex()
	{
		driver.findElement(By.xpath("//*[text()='Index']")).click();
	}
}
