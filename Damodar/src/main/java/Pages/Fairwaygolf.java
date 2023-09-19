package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import CommonFunctions.GenericMethods2;

public class Fairwaygolf extends GenericMethods2{
	
	@FindBy(xpath= "//a[text() ='Login']")
	private WebElement Login;
	
	@FindBy(xpath= "//a[text() ='New Account'']")
	private WebElement Newaccount;
	
	@FindBy(xpath= "//input[@id ='firstname']")
	private WebElement firstname;
	
	@FindBy(xpath ="//input[id='lastname']")
	private WebElement lastname;
	
	@FindBy(xpath ="//input[id='email']")
	private WebElement emailid;
	
	@FindBy(xpath ="//input[id='password']")
	private WebElement password;
	
	@FindBy(xpath ="//input[id='password2']")
	private WebElement password2;
	
	@FindBy(xpath ="//input[id='suburb']")
	private WebElement streetaddress;
	
	@FindBy(xpath ="//input[id='city']")
	private WebElement cityname;
	
	@FindBy(xpath ="//input[id='zone']")
	private WebElement state;
	
	
	@FindBy(xpath ="//input[id='postcode']")
	private WebElement postcode;
	
	@FindBy(xpath ="//input[id='country']")
	private WebElement country;
	
	@FindBy(xpath ="//input[id='telephone']")
	private WebElement telephone;
	
	@FindBy(xpath ="//input[id='newsletter']")
	private WebElement checkbox;
	
	@FindBy(xpath ="//input[id='submit']")
	private WebElement submit;
	
	@FindBy(xpath ="//img[@alt='fairway golf USA']")
	private WebElement Homepage;
	
	@FindBy(xpath ="//a[text()='CUSTOM CLUBS']")
	private WebElement customoption;
	
	@FindBy(xpath ="//a[text()='Custom Wedges']")
	private WebElement customwidges;
	
	@FindBy(xpath ="(//img[@class='lazy loaded'])[1]")
	private WebElement itemselected;
	

	@FindBy(xpath ="//input[@id='OptionId100-1']")
	private WebElement finishoption;
	
	@FindBy(xpath ="//input[@id='OptionId101-1']")
	private WebElement customcolor;
	
	@FindBy(xpath ="//select[@id='Option1_2']")
	private WebElement bouncecolor;
	
	@FindBy(xpath ="//select[@id='Option1_3']")
	private WebElement linecolor;
	
	@FindBy(xpath ="//select[@id='Option1_4']")
	private WebElement grindcolor;
	
	@FindBy(xpath ="//select[@id='Option1_5']")
	private WebElement lightcharcoal;
	
	
	
	
	public Fairwaygolf() 	
	{
		
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 4), this);
	}
	
	public void newregistration(WebDriver driver) 
	
	
	{
		    click(driver, Newaccount);
			sendkeys(driver, lastname, "Ghule");
			sendkeys(driver, emailid, "prashanth123@gmail.com");
			sendkeys(driver, password, "Hello@123");
			sendkeys(driver, password2, "Hello@123");
			sendkeys(driver, streetaddress, "123");
			sendkeys(driver, cityname, "Hyderabad");
			selectclass(driver, state, "Georgia");
			sendkeys(driver, postcode, "500059");
			selectclass(driver, country, "Austria");
			sendkeys(driver, telephone, "5555555555");
			click(driver, checkbox);
			click(driver, submit);
			
			
	}
	
	public void login(WebDriver driver) 
	
	{
	 	click(driver, Newaccount);
		
	}
	
	public void itemaddtocart(WebDriver driver) 
	
	{
		click(driver, Homepage);
		movetoelement(driver, customoption);
		click(driver, customwidges);
		click(driver, itemselected);
		click(driver, finishoption);
		click(driver, customcolor);
		selectclass(driver, bouncecolor, "Blue");
		
		
		
		
		
	}
	
	
	
	
	
	
	

}
