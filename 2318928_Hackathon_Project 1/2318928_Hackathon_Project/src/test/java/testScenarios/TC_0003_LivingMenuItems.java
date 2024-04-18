package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.testng.annotations.Test;
import pageObjects.LivingSubMenuPage;
import testBase.BaseClass;
import utilities.ExcelWrite;
/***********************************************************************************
*                                                                                  *
* Class Name     : TC_0003_LivingMenuItems                                         * 
* Description    : store and print all the seating and chair options available     *
* 					according to requirements.									   *
* (Here we impliment regression testing as we are getting items in living)                                     										   *
*                                                                                  *
************************************************************************************/
public class TC_0003_LivingMenuItems extends BaseClass{
	
	public static String[] submenuitems;
	LivingSubMenuPage lmp;
	
	@Test(priority = 15,groups = { "Regression Test one" })
	public void scrollUp()
	{
		getLogger().info("**********Starting TC_0003_LivingMenuItems************");
		getLogger().info("**********Scrolling Page Up to Living************");
		
		lmp=new LivingSubMenuPage(driver);
		lmp.scrollPageUp();
		getLogger().info("**********scrollPageUp() Successfuly passed************");
	}
	
	
	@Test(priority = 16,groups = { "Regression Test one" })
	public void hoverToLiving()
	{
		getLogger().info("*********Hovering to Living option************");
		
		lmp.hoverLiving();
		
		getLogger().info("**********hoverToLiving() Successfuly passed************");
	}
	
	@Test(priority = 17,groups = { "Regression Test one" })
	public void waitforSubmenu()
	{
		getLogger().info("*********Waiting for Submenu to appear************");
		
		lmp.waitForSubmenuToAppear();
		
		getLogger().info("**********waitforSubmenu() Successfuly passed************");
	}
	
	@Test(priority = 18,groups = { "Regression Test one" })
	public void submenuSeatingandChairStoreInExcel()
	{
		getLogger().info("*********Fetching and Storing Submenu Items in Excel************");
		
		submenuitems= new String[lmp.listOFseatingAndChair().size()];
		
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			submenuitems[i]= lmp.listOFseatingAndChair().get(i).getText();
		}
		ExcelWrite.setDataExcel(submenuitems, lmp.listOFseatingAndChair().size());
		getLogger().info("**********submenuSeatingandChairStoreInExcel() Successfuly passed************");
	}
	@Test(priority = 19,groups = { "Regression Test one" })
	public void displaySubMenuSeatingandChair()
	{
		getLogger().info("*********Printing the Submenu options on console************");
		
		System.out.println("The submenu items under Seating and Chaires:");
		for(int i=0;i<lmp.listOFseatingAndChair().size();i++)
		{
			System.out.println(submenuitems[i]);
		}
		getLogger().info("*********Waiting for Submenu to appear************");
		getLogger().info("**********displaySubMenuSeatingandChair() successfully passed************");
	}


}
