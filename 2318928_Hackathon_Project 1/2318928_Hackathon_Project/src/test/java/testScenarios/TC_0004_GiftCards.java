package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pageObjects.GiftsCardHomePage;
import testBase.BaseClass;
/***********************************************************************************
*                                                                                  *
* Class Name     : TC_0004_GiftCards                                               * 
* Description    : Get the Gift Card option and fill the Form of gift Card.        *
*                                                                                  *
************************************************************************************/
public class TC_0004_GiftCards extends BaseClass{
	
	GiftsCardHomePage gcp;
	JavascriptExecutor js ;
	
	@Test(priority = 20,groups = { "Smoke Test two" })
	public void scrollPage() throws InterruptedException
	{
		getLogger().info("**********Starting TC_0004_GiftCards************");
		getLogger().info("**********Scrolling Page Up Gift Cards button***********");
		
		gcp =new GiftsCardHomePage(driver);
		gcp.scrollpage();
		
		getLogger().info("**********scrollPage() successfully passed***********");
	}
	
	@Test(priority = 21,groups = { "Smoke Test two" })
	public void clickGiftCardsButton()
	{
		getLogger().info("**********Clicking the Gift Cards Button***********");
		
		gcp.clickGiftCards();

		getLogger().info("**********clickGiftCardsButton() successfully passed***********");
	}
	
	@Test(priority = 22,groups = { "Smoke Test two" })
	public void loadTheJSONFile()
	{
		getLogger().info("**********loading JSON file***********");
		
		gcp.testCaseReadJSON();
		
		getLogger().info("**********loadTheJSONFile() successfully passed***********");
	}

	
	@Test(priority = 23,groups = { "Smoke Test two" })
	public void scrollDownToGiftsOptions()
	{
		getLogger().info("**********Scrolling to all gift options present***********");
		
		gcp.scrollDownToGifts();
		
		getLogger().info("**********scrollDownToGiftsOptions() successfully passed***********");
	}
	
	@Test(priority = 24,groups = { "Smoke Test two" })
	public void selectBirthdayOrAnniversary() 
	{
		getLogger().info("**********Selcting Birthday And Anniversary card***********");
		
		gcp.clickOnBirthdayOrAnniversary();
		
		getLogger().info("**********selectBirthdayOrAnniversary() successfully passed***********");
	}
	
	@Test(priority = 25,groups = { "Smoke Test two" })
	public  void enteringPriceAmount() 
	{
		getLogger().info("**********Entring Price for Card***********");
		
		gcp.enteringAmount();
		
		getLogger().info("**********enteringPriceAmount() successfully passed***********");
	}
	
	@Test(priority = 26,groups = { "Smoke Test two" })
	public  void clickOnNextbtn() 
	{
		getLogger().info("**********Clicking on next Button***********");
		
		gcp.clickOnNext();
		
		getLogger().info("**********clickOnNextbtn() successfully passed***********");
	}
	
	@Test(priority = 27,groups = { "Smoke Test two" })
	public  void enterNameofRecipient() 
	{
		getLogger().info("**********Entring Recipient name***********");
		
		gcp.enterRecipientName();
		
		getLogger().info("**********lenterNameofRecipient() successfully passed***********");
	}
	
	@Test(priority = 28,groups = { "Smoke Test two" })
	public void enterEmailofRecipient() 
	{
		getLogger().info("**********Entering the invalid recipient email***********");
		
		gcp.enterRecipientEmail();
		
		getLogger().info("**********EnterEmailofRecipient() successfully passed***********");
	}
	@Test(priority = 29,groups = { "Smoke Test two" })
	public void enterMobileofRecipient() 
	{
		getLogger().info("**********Entring Recipient Mobile number***********");
		
		gcp.enterRecipientMobile();
		
		getLogger().info("*********enterMobileofRecipient() successfully passed***********");
	}
	
	
	@Test(priority = 30,groups = { "Smoke Test two" })
	public void enterNameofCustomer() 
	{
		getLogger().info("**********Entering Name of Customer***********");
		
		gcp.enterCustomerName();
		
		getLogger().info("*********enterNameofCustomer() successfully passed***********");
	}
	
	@Test(priority = 31,groups = { "Smoke Test two" })
	public void enterEmailofCustomer() 
	{
		getLogger().info("**********Entring Email of Customer***********");
		
		gcp.enterCustomerEmail() ;
		
		getLogger().info("**********enterEmailofCustomer() successfully passed***********");
	}
	
	@Test(priority = 32,groups = { "Smoke Test two" })
	public void enterMobileNumberofCustomer() 
	{
		getLogger().info("**********Entering Mobile number of Customer***********");
		
		gcp.enterCustomerMobileNumber();
		
		getLogger().info("**********enterMobileNumberofCustomer() successfully passed***********");
		
	}
	@Test(priority = 33,groups = { "Smoke Test two" })
	public void enterAddressofCustomer() 
	{
		getLogger().info("**********Entering Address of Customer***********");
		
		gcp.enterCustomerAddress();
		
		getLogger().info("**********enterAddressofCustomer() successfully passed***********");
		
	}
	
	@Test(priority = 34,groups = { "Smoke Test two" })
	public void enterPinofCustomerPin()
	{
		getLogger().info("**********Entering Pin code of Customer***********");
		
		gcp.enterCustomerPin();
		
		getLogger().info("**********enterPinofCustomerPin() successfully passed***********");
	}
	
	@Test(priority = 35,groups = { "Smoke Test two" })
	public void enterMessageIfAny() 
	{
		getLogger().info("**********Entering Message ***********");
		
		gcp.enterMessage();
		
		getLogger().info("**********enterMessageIfAny() successfully passed***********");
		
	}
	
	@Test(priority = 36,groups = { "Smoke Test two" })
	public void clickOnConfirmbtn() throws InterruptedException 
	{
		getLogger().info("**********Clicking confirm button***********");
	
		gcp.clickOnConfirm();
		
		getLogger().info("**********clickOnConfirmbtn() successfully passed***********");
		
	}

	@Test(priority = 37,groups = { "Smoke Test two" })
	public void getErrorMessage()
	{
		getLogger().info("**********Capturing Error Message***********");
		
		gcp.displayErrorMessage();
		
		getLogger().info("**********getErrorMessage() successfully passed***********");
	}
	
	@Test(priority = 38,groups = { "Smoke Test two" })
	public void clearrecipientmail()
	{
		getLogger().info("**********Clearing the email input box for recipient***********");
		
		gcp.clearRecipientEmailBox();
		
		getLogger().info("**********clearrecipientmail() successfully passed***********");
	}
	
	@Test(priority = 39,groups = { "Smoke Test two" })
	public void enterCorrectDeatils()
	{
		getLogger().info("**********Entering correct mail for recipient***********");
		
		gcp.enterCorrectrecipientEmail();
		
		getLogger().info("**********enterCorrectDeatils() successfully passed***********");
	}
	@Test(priority = 40,groups = { "Smoke Test two" })
	public void clickConfirmWithcorrectEmail() throws InterruptedException
	{
		getLogger().info("**********clicking on confirm button***********");
		
		gcp.clickConfirmafterCorrectEmail();
		
		getLogger().info("**********clickConfirmWithcorrectEmail() successfully passed***********");
	}
	
	@Test(priority = 41,groups = { "Smoke Test two" })
	public void confirmDetails()//if always pass testNG test either fails or pass
	{
		
		getLogger().info("**********Verfiying form submitted successfully***********");
		
		WebElement elem = gcp.confirmationDetailsDisplay();
		boolean b= elem.isDisplayed();//if confirm page heading diplayed after submission success
		if(b)
		{
			System.out.println("Successfully submitted Details and now on verify Details Page:");
		}
		else
		{
			System.out.println("Failed to submit Details and not on verify Details Page:");
		}
		getLogger().info("**********confirmDetails() successfully passed***********");
	}
	
}

