package pomPackage;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import org.openqa.selenium.support.ui.WebDriverWait;

import pomUtility.ElementWait;

public class Loginpage
{
	WebDriver driver;

	
	@FindBy(xpath="//h5[text()='Login']")
	private WebElement logo;
	
	@FindBy(xpath="//label[text()='Username']")
	private WebElement nameofusertextbox;
	
	@FindBy(xpath="//input[@name='username']")
	private WebElement username;
	
	@FindBy(xpath=" //input[@name='password']")
	private WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement loginbutton;
	
	@FindBy(xpath="//span[text()='Required']")
	private WebElement errormsgofuser;
	
	@FindBy(xpath="(//span[text()='Required'])[2]")
	private WebElement errormsgofpassword;
	
	@FindBy(xpath="//label[text()='Password']")
	private WebElement nameofpsdtextbox;
	
	
	
	public Loginpage(WebDriver driver)
	{   
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
    public void inputinsideusername(String inputinuser)
	{
		username.sendKeys(inputinuser);
		ElementWait.waitForElement("//input[@name='username']",10,driver);
	}
	public void inputinsidepassword(String inputinpsd)
	{
		password.sendKeys(inputinpsd);
	}
	
	public void verifytextpsd(String expectedtext)
	{
		String actualtext=nameofpsdtextbox.getText();
		if(actualtext.equals(expectedtext))
		{
			System.out.println("test case pass for text");
		}
		else
		{
			System.out.println("test case fail for text");
		}
	}

	public void verifytext(String expectedtext)
	{
		String actualtext=nameofusertextbox.getText();
		if(actualtext.equals(expectedtext))
		{
			System.out.println("test case pass for text");
		}
		else
		{
			System.out.println("test case fail for text");
		}
	}

	
	public void getplaceholdertextpsd(String expectedarialtext)
	{
		String actualarial=password.getAttribute("placeholder");
		if(actualarial.equals(expectedarialtext))
		{
		 System.out.println("test case pass for placeholder value");
		}
		else
		{
		 System.out.println("test case fail for placeholder value");
		}
	}
	public void getplaceholdertextuser(String expectedarialtext)
	{
		String actualarial=username.getAttribute("placeholder");
		if(actualarial.equals(expectedarialtext))
		{
		 System.out.println("test case pass for placeholder value");
		}
		else
		{
		 System.out.println("test case fail for placeholder value");
		}
	}
	public void clicklogin()
	{
		loginbutton.click();
		
	}
	public void clickpassword()
	{
		password.click();
	}
	public void getTitle()
	{
		String actualtitle=driver.getTitle();
		String desiredtitle="OrangeHRM";
		if(actualtitle.equals(desiredtitle))
		{
			System.out.println("test pass for webpageTITLE");
		}
		else
		{
	       System.out.println("test fail for webpageTITLE");
		}
	}
	
	public boolean display()
	{
		boolean result=username.isDisplayed();
		return result;
	}
	
	public boolean url()
	{
		 String expectedurl="https://opensource-demo.orangehrmlive.com/web/index.php/dashboard/index";
		 String actual=driver.getCurrentUrl();
		 return expectedurl.equals(actual);
	}
	public void clearMethod()
	{   int n=1; 
		while(n<6)
		{username.sendKeys(Keys.BACK_SPACE);}
		
	}
	public void clearMethod2()
	{     int n=1; 
	      while(n<9)
		{password.sendKeys(Keys.BACK_SPACE);}
	}
	}
	
	
	


