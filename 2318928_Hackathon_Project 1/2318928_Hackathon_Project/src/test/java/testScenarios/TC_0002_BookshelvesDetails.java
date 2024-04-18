package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pageObjects.BookshelevesHomePage;
import testBase.BaseClass;
import utilities.ExcelWrite;
/***********************************************************************************
*                                                                                  *
* Class Name     : TC_0002_BookshelvesDetails                                      * 
* Description    : Get all the Bookshelves available according to requirement      *
* 					store and display.                                        	   *
*                                                                                  *
************************************************************************************/
public class TC_0002_BookshelvesDetails extends BaseClass{
	
    BookshelevesHomePage bhp;
	public static Actions action;
	public static String[] bookShelves;
	public static String[] prices;
	
	
	@Test(priority = 3,groups = { "Smoke Test one" })
	public void closePopUp() {
		bhp = new BookshelevesHomePage(driver);
		bhp.popupclose();
		
	}
	@Test(priority = 4,groups = { "Smoke Test one" })
	public void scrollDown()
	{
		getLogger().info("**********Starting TC_0002_BookshelvesDetails************");
		getLogger().info("**********Scrolling Down to Bookshelves************");
		
		bhp.scroll();
		
		getLogger().info("**********scrollDown() successfully passed************");
	}
	@Test(priority = 5,groups = { "Smoke Test one" })
	public void hoverCategory()
	{
		getLogger().info("**********Hovering to category************");
		
		bhp.hoverCategory();
		
		getLogger().info("**********hoverCategory() successfully passed************");
	}
	@Test(priority = 6,groups = { "Smoke Test one" })
	public void bookshelveCategory()
	{
		getLogger().info("**********Selecting Bookshelve category************");
		
		bhp.selectCategory();
		
		getLogger().info("**********bookshelveCategory() successfully passed************");
	}
	@Test(priority = 7,groups = { "Smoke Test one" })
	public void hoverToPrice()
	{
		getLogger().info("**********Hovering to price************");
		
		bhp.hoverPrice();
		
		getLogger().info("**********hoverToPrice() successfully passed************");
	}
	@Test(priority = 8,groups = { "Smoke Test one" })
	public void waitPriceSlider()
	{
		getLogger().info("**********Waiting for Price Slider************");
		
		bhp.waitForSlider();
		
		getLogger().info("**********waitPriceSlider() successfully passed************");
	}
	@Test(priority = 9,groups = { "Smoke Test one" })
	public void slidePriceamount() throws InterruptedException
	{
		getLogger().info("**********Sliding price************");
		
		bhp.slidePrice();
		
		getLogger().info("**********slidePriceamount() successfully passed************");
	}

	@Test(priority = 10,groups = { "Smoke Test one" })
	public void hoverSortBy()
	{
		getLogger().info("**********Hovering to sort By************");
		
		bhp.hoverSort();
		
		getLogger().info("**********hoverSortBy() successfully passed************");
	}
	@Test(priority = 11,groups = { "Smoke Test one" })
	public void sortAccToPrice()
	{
		getLogger().info("**********Selecting sorting High to low************");
		
		bhp.selectSortHighToLow();
		
		getLogger().info("**********sortAccToPrice() successfully passed************");
	}
	
	@Test(priority = 12,groups = { "Smoke Test one" })
	public void inStock()
	{
		getLogger().info("**********Selecting In Stock option************");
		
		bhp.inStockSelction();
		
		getLogger().info("**********inStock() successfully passed************");
	}
	
	@Test(priority = 13,groups = { "Smoke Test one" })
	public void collectingBookShelvesList() {
		getLogger().info("**********Collecting Bookshelves and Storing to Excel************");
		
		bookShelves = new String[bhp.bookShelvesNames().size()];
		prices = new String[bhp.bookShelvesPrice().size()];
		
		
		for(int i=0; i<4; i++){
			
			bookShelves[i] = bhp.bookShelvesNames().get(i).getText();
			prices[i] = bhp.bookShelvesPrice().get(i).getText();
			prices[i] = prices[i].replaceAll("[^0-9]", "");
			
		}
		ExcelWrite.setDataExcel(bookShelves , prices , 3);
		
		getLogger().info("**********collectingBookShelvesList() successfully passed************");
	}
	
	@Test(priority = 14,groups = { "Smoke Test one" })
	public void displayingBookShelves() {
		
		getLogger().info("**********Printing the Bookshelves on console************");
		
		System.out.println("The Bookshelevs under 15000:-");
		for(int i=0; i<3; i++) {
			System.out.println(bookShelves[i] + " - Rs." + prices[i]);
			
		}
		getLogger().info("**********displayingBookShelves() successfully passed************");
		getLogger().info("**********Finished TC_0002_BookshelvesDetails************");
	}
	
	

}
