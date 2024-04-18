package pageObjects;

/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/***********************************************************************************
*                                                                                  *
* Class Name     : BasePage                                                        * 
* Description    : initialize the WebDriver instance and set up the PageFactory    *
* for the page objects.                                                            *
*                                                                                  *
************************************************************************************/


// Handling one Driver in Multiple Files 
public class BasePage {
    WebDriver driver;
    
    public BasePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
}
