
public class Maltem_Steps extends Maltem_Actions{

	public static void runTestCase1() throws InterruptedException
	{
		openHomePage();
	}
	public static void runTestCase2()
	{
		try {
			openHomePage();
			clickChapterLink(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			if(checkAndClickRadioButton())
			{
				System.out.println("System displays radio button and user is able to select the radio button ");
			}
			else
			{
				System.out.println("Radio button is not displayed");
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public static void runTestCase3()
	{
		try {
			openHomePage();
			clickChapterLink(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(checkTitleIsDisplayed())
		{
			System.out.println("Title is displayed on the homepage");
		}
	}
	public static void runTestCase4()
	{
		try {
			openHomePage();
			clickChapterLink(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		clickLink();
		
	}
	public static void runTestCase5() throws InterruptedException
	{
		openHomePage();
		clickChapterLink(1);
		clickLink3();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void runTestCase6() throws InterruptedException
	{
		openHomePage();
		clickChapterLink(1);
		clickLink3();
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static void runTestCase7() throws InterruptedException
	{
		openHomePage();
		clickChapterLink(4);
		clickDropDown();
		selectDropdownElement();
	}
public static void runTestCase8()throws InterruptedException
{
	openHomePage();
	clickChapterLink(3);
	String text1=checkTheDynamicText();
	Thread.sleep(500);
	clickIndex();
	String text2=checkTheDynamicText();

	if(text1.equalsIgnoreCase(text2))
			{
		System.out.println("The text is not dynamic");
			}
	else
	{
		System.out.println("The text is dynamic");
	}
}
}

