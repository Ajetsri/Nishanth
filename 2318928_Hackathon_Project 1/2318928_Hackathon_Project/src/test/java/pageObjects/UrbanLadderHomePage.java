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
* Class Name     : UrbanLadderHomePage                                             * 
* Description    : To Get all the web elements present in the website              *
* 				   Home Page and there corresponding actions.                      *
*                                                                                  *
************************************************************************************/
public class UrbanLadderHomePage extends BasePage
{
	BaseClass bclass;
	public UrbanLadderHomePage(WebDriver driver) 
	{
		super(driver);
	}
	
	@FindBy(xpath="//input[@id='search']")
	WebElement inputBoxSearch;
	
	@FindBy(xpath="//button[@id=\"search_button\"]")
	WebElement btnSearch;
	

	// Handling Search Button
	public void inputBox()
	{
		bclass = new BaseClass();
		bclass.ExplicitlyWait(inputBoxSearch);
		inputBoxSearch.click();
		inputBoxSearch.sendKeys("Bookshelves");
	}
	// Clicking on the Search button
	public void clickSearch()
	{
		bclass.ExplicitlyWait(btnSearch);
		btnSearch.click();
	}
	

}
