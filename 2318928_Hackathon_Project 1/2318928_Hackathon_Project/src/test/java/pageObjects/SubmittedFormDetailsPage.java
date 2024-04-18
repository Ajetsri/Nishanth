package pageObjects;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;
/***********************************************************************************
*                                                                                  *
* Class Name     :  SubmittedFormDetailsPage                                       * 
* Description    : To Get all the web elements present in the website              *
* 				   Submitted Form Page and there corresponding actions.            *
*                                                                                  *
************************************************************************************/
public class SubmittedFormDetailsPage extends BasePage{
	BaseClass bclass;
	
	public SubmittedFormDetailsPage(WebDriver driver)
	{
		super(driver);
	}


	
	@FindBy(xpath="//div[@class=\"BCLqs\"]")
	WebElement amountEntered;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[1]")
	WebElement recipientName;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[2]")
	WebElement recipientEmail;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[1]//div[2]//div[3]")
	WebElement recipientMobile;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[1]")
	WebElement customerName;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[2]")
	WebElement customerEmail;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[3]")
	WebElement customerMobile;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[4]")
	WebElement customerCity;
	
	@FindBy(xpath="//div[@class=\"_3DI1w\"]//div[2]//div[2]//div[5]")
	WebElement customerPinCode;
	
	
	public WebElement amountEnetered()
	{
		bclass = new BaseClass();
		bclass.ExplicitlyWait(amountEntered);
		return amountEntered;
	}
	
	public WebElement recipientName()
	{
		bclass.ExplicitlyWait(recipientName);
		return recipientName;
	}
	
	public WebElement recipientEmail()
	{
		bclass.ExplicitlyWait(recipientEmail);
		return recipientEmail;
	}
	
	public WebElement recipientMobile()
	{
		bclass.ExplicitlyWait(recipientMobile);
		return recipientMobile;
	}
	
	public WebElement customerName()
	{
		bclass.ExplicitlyWait(customerName);
		return customerName;
	}
	
	public WebElement customerEmail()
	{
		bclass.ExplicitlyWait(customerEmail);
		return customerEmail;
	}
	public WebElement customerMobile()
	{
		bclass.ExplicitlyWait(customerMobile);
		return customerMobile;
	}
	
	public WebElement customerCity()
	{
		bclass.ExplicitlyWait(customerCity);
		return customerCity;
	}
	
	public WebElement customerPinCode()
	{
		bclass.ExplicitlyWait(customerPinCode);
		return customerPinCode;
	}
	
}

