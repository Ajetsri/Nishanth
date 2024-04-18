package pageObjects;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import java.util.List;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import testBase.BaseClass;
/***********************************************************************************
*                                                                                  *
* Class Name     : BookshelevesHomePage                                            * 
* Description    : To Get all the web Elements present in the website              *
* 				  Booksheleve homepage and there corresponding actions.            *
*                                                                                  *
************************************************************************************/
public class BookshelevesHomePage extends BasePage{
	BaseClass bclass;
	public BookshelevesHomePage(WebDriver driver) {
		super(driver);
	}
	Actions action;
	
	@FindBy(xpath="//a[@class='close-reveal-modal hide-mobile']")
	WebElement popupSignUp;
	
	@FindBy(xpath="//h2[contains(text(),\"Search results for\")]")
	WebElement txtScrollTill;
	
	@FindBy(xpath="//li[@data-group='category' and @class='item']")
	WebElement optHovercategory;
	
	@FindBy(xpath="//input[@type='checkbox' and @value='Bookshelves']")
	WebElement chkboxBookShelves;
	
	@FindBy(xpath="//li[@data-group='price' and @class='item']")//price
	WebElement optHoverPrice;
	
	
	@FindBy(xpath="//div[@class='noUi-handle noUi-handle-upper']")//max slider point
	WebElement sliderPrice;
	
	
	@FindBy(xpath="//input[@value='In Stock Only']")
	WebElement btnInStock;
	
	@FindBy(xpath="//div[@data-group='sorting' and @class='item']")
	WebElement optHoverSort;
	
	@FindBy(xpath="//ul[@class=\"sortoptions\"]//li[3]")
	WebElement optHighToLowPrice;
	
	@FindAll(@FindBy(xpath="//*[@id='content']//div[3]//ul//li//div//div[5]//a//div[1]//span"))
	List<WebElement> listBookShelvesName;
	
	@FindAll(@FindBy(xpath="//*[@id='content']//div[3]//ul//li//div//div[5]//a//div[2]//span"))
	List<WebElement> listBookShelvesPrice;
	
	
	// Handling the pop-up
	public void popupclose() {
		
		try {
			bclass= new BaseClass();
			bclass.ExplicitlyWait(popupSignUp);
			popupSignUp.click();	
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
	}
	
	
	// Scrolling to the "Search Results For 'Bookshelf'" Text
	public void scroll()
	{
		
		bclass.ExplicitlyWait(txtScrollTill);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    js.executeScript("arguments[0].scrollIntoView(true);",txtScrollTill); // show ele at top
	}
	
	// Handling the Category Hover
	public void hoverCategory()
	{
		action= new Actions(driver);
		bclass.ExplicitlyWait(optHovercategory);
		action = new Actions(driver);
		action.moveToElement(optHovercategory).perform();
	}
	
	// Checking the BookSelf in Category
	public void selectCategory()
	{
		bclass.ExplicitlyWait(chkboxBookShelves);
		chkboxBookShelves.click();
	}
	// Hovering the Price button
	public void hoverPrice()
	{
		bclass.ExplicitlyWait(optHoverPrice);
		action.moveToElement(optHoverPrice).perform();
	}
	// Waiting for the slider to display
	public void waitForSlider()
	{
		bclass.ExplicitlyWait(sliderPrice);
	}
	
	// Setting the slider range below 15000
	public void slidePrice() throws InterruptedException 
	{
		//The Current position of the Max slider is(576, 412)
		System.out.println("The Current position of the Max slider is"+sliderPrice.getLocation());
		Thread.sleep(2000);
		// This action perform (576-212=364)
		action.moveToElement(sliderPrice).dragAndDropBy(sliderPrice, -212, 0).perform();
		//The Current position of the Max slider is(364, 412)
		System.out.println("The Current position of the Max slider is"+sliderPrice.getLocation());
	}
	
	// Handling the Sorting button
	public void hoverSort()
	{
		bclass.ExplicitlyWait(optHoverSort);
		action.moveToElement(optHoverSort).perform();
	}
	// Handling High to low Sorting
	public void selectSortHighToLow()
	{
		bclass.ExplicitlyWait(optHighToLowPrice);
		optHighToLowPrice.click();
	}
	// Handling the "Exclude out of Stock"
	public void inStockSelction()
	{
		bclass.ExplicitlyWait(btnInStock);
		btnInStock.click();
	}
	// Return the List of Bookshelves names
	public List<WebElement> bookShelvesNames()
	{
		bclass.ExplicitlyWaitList(listBookShelvesName);
		return listBookShelvesName;
	}
	// Return the price of the Bookshelves price
	public List<WebElement> bookShelvesPrice()
	{
		bclass.ExplicitlyWaitList(listBookShelvesPrice);
		return listBookShelvesPrice;
	}
	
	

}
