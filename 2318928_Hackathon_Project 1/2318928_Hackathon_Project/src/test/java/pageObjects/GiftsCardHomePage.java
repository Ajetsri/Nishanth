package pageObjects;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;
import utilities.JsonRead;
/***********************************************************************************
*                                                                                  *
* Class Name     : GiftsCardHomePage                                               * 
* Description    : To Get all the web elements present in the website              *
* 				   GiftCard Page and there corresponding actions.                  *
*                                                                                  *
************************************************************************************/
public class GiftsCardHomePage extends BasePage{
	BaseClass bclass;
	JavascriptExecutor js ;
	public String validationMessage;

	public GiftsCardHomePage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//a[contains(text(),'Gift Cards')]")
	WebElement btnscrolltoGift;
	
	@FindBy(xpath="//a[text()='Gift Cards']")
	WebElement btnGiftCards;
	
	@FindBy(xpath="//h2[contains(text(),'1. First, choose an occasion')]")
	WebElement txtscrollTillGifts;
	
	@FindBy(xpath="//h3[contains(text(),'Birthday')]")
	WebElement optbirthDayOrAnniversary;
	
	@FindBy(xpath="//input[@placeholder='Amount']")
	WebElement txtBoxfindingAmount;
	
	@FindBy(xpath="//button[text()='Next']")
	WebElement btnnextButton;
	
	@FindBy(name="recipient_name")
	WebElement txtBoxrecepientName;
	
	@FindBy(name="recipient_email")
	WebElement txtBoxrecepientEmail;
	
	@FindBy(name="recipient_mobile_number")
	WebElement txtBoxrecipientMobile;
	
	@FindBy(name="customer_name")
	WebElement txtBoxcustomerName;
			
	@FindBy(name="customer_email") 
	WebElement txtBoxcustomerEmail;
	
	@FindBy(name="customer_mobile_number")
	WebElement txtBoxcustomerMobileNumber;
	
	
	@FindBy(name="customer_address")
	WebElement txtBoxcustomerAddress ;
	
	@FindBy(name="zip")
	WebElement txtBoxZip;
		
	@FindBy(name="message")
	WebElement txtBoxoptionalMessage;
	
	@FindBy(xpath="//button[text()='Confirm']")
	WebElement btnconfirmButton;
	
	@FindBy(xpath="//h2[contains(text(),'Confirm the details')]")
	WebElement txtConfirmDetailsHeading;
	
	// This is used for loading the json files 
	public void testCaseReadJSON() {
		try {
		JsonRead.readJSONFile();       // method is to initiate the process of reading data from a JSON file
		} catch(Exception e) {
		e.printStackTrace();	
		}	
	}
	// Scrolling the Gift card Button
	public void scrollpage() throws InterruptedException
	{
		
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", btnscrolltoGift);

	}
	// Clicking the Gift card Button
	public void clickGiftCards()
	{
		bclass = new BaseClass();
		bclass.ExplicitlyWait(btnGiftCards);
		//btnGiftCards.click();//getting itercepted error
		js.executeScript("arguments[0].click();",btnGiftCards);
	}
	// Scrolling to Gift Cards
	public void scrollDownToGifts()
	{
		js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);",txtscrollTillGifts);
	}
	// Clicking on the Birthday
	public void clickOnBirthdayOrAnniversary() 
	{
		
		bclass.ExplicitlyWait(optbirthDayOrAnniversary);
		optbirthDayOrAnniversary.click();		
	}
	
	// Entering the Amount
	public  void enteringAmount() {
		
		bclass.ExplicitlyWait(txtBoxfindingAmount);
		txtBoxfindingAmount.sendKeys(JsonRead.amount);
		
	}
	
	// Handling Next Button 
	public  void clickOnNext() 
	{
		
		bclass.ExplicitlyWait(btnnextButton);
		btnnextButton.click();
		
	}
	
	// Entering the Recipient Name
	public  void enterRecipientName() 
	{
		
		bclass.ExplicitlyWait(txtBoxrecepientName);
		txtBoxrecepientName.sendKeys(JsonRead.recipientName);
		
	}
	
	// Entering the Recipient incorrect Email
	public void enterRecipientEmail() 
	{
		bclass.ExplicitlyWait(txtBoxrecepientEmail);
		txtBoxrecepientEmail.sendKeys(JsonRead.recipientEmail);

		
	}
	// Entering the Recipient Number
	public void enterRecipientMobile()
	{
		bclass.ExplicitlyWait(txtBoxrecipientMobile);
		txtBoxrecipientMobile.sendKeys(JsonRead.recipientmobile);
	}
	// Entering the Customer Name
	public void enterCustomerName() 
	{
		bclass.ExplicitlyWait(txtBoxcustomerName);
		txtBoxcustomerName.sendKeys(JsonRead.customerName);	
	}
	
	// Entering the Customer Email
	public void enterCustomerEmail() 
	{
		
		bclass.ExplicitlyWait(txtBoxcustomerEmail);
		txtBoxcustomerEmail.sendKeys(JsonRead.customerEmail);
		
	}
	
	// Entering the Customer Number
	public void enterCustomerMobileNumber() 
	{
		bclass.ExplicitlyWait(txtBoxcustomerMobileNumber);
		txtBoxcustomerMobileNumber.sendKeys(JsonRead.customerMobile);

		
	}
	
	// Entering the Customer Address
	public void enterCustomerAddress() 
	{
		bclass.ExplicitlyWait(txtBoxcustomerAddress);
		txtBoxcustomerAddress.sendKeys(JsonRead.customerAddress);
		
	}
	
	// Entering the Customer Pin
	public void enterCustomerPin()
	{
		bclass.ExplicitlyWait(txtBoxZip);
		txtBoxZip.sendKeys(JsonRead.customerPin);
	}
	// Entering the Message
	public void enterMessage() 
	{
		
		bclass.ExplicitlyWait(txtBoxoptionalMessage);
		txtBoxoptionalMessage.sendKeys(JsonRead.message);
		
	}
	
	// Clicking on the Confirm button
	public void clickOnConfirm() throws InterruptedException 
	{
		bclass.ExplicitlyWait(btnconfirmButton);
		btnconfirmButton.click();
		Thread.sleep(3000);//used so we can see error message

		
	}
	// Error Meassage
	public void displayErrorMessage() 
	{
		System.out.println("The Error message got while filling details:-");
		// Attribute validationMessage will return the message, that will be showing if validation fails
		validationMessage = (String)js.executeScript("return arguments[0].validationMessage;",txtBoxrecepientEmail);
	    System.out.println(validationMessage);
	}
	// Clearing the Recipient Email Box
	public void clearRecipientEmailBox()
	{
		// Here the Keys.chord is used for performing the multiple actions in sequence of array
		//(like Key.Down,Key.Up)
		txtBoxrecepientEmail.sendKeys(Keys.chord(Keys.CONTROL,"a"));
		txtBoxrecepientEmail.sendKeys(Keys.DELETE);
	}
	// Entering the correct Email
	public void enterCorrectrecipientEmail()
	{
		bclass.ExplicitlyWait(txtBoxrecepientEmail);
		txtBoxrecepientEmail.sendKeys(JsonRead.correctemail);
	}
	// Clicking the Confirm Button
	public void clickConfirmafterCorrectEmail() throws InterruptedException 
	{
		bclass.ExplicitlyWait(btnconfirmButton);
		btnconfirmButton.click();
		Thread.sleep(3000);//used so we can see error message

		
	}
	// Returnin the Confirm Details Name for Furthur process
	public WebElement confirmationDetailsDisplay()
	{
		bclass.ExplicitlyWait(txtConfirmDetailsHeading);
		return txtConfirmDetailsHeading;
	}
	
	
}
