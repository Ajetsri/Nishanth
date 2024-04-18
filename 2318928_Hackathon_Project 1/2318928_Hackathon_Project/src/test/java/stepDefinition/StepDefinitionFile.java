package stepDefinition;
import java.io.FileReader;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import java.io.IOException;
import java.util.Properties;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import testBase.BaseClass;
import testScenarios.TC_0001_SearchBookshelve;
import testScenarios.TC_0002_BookshelvesDetails;
import testScenarios.TC_0003_LivingMenuItems;
import testScenarios.TC_0004_GiftCards;
import testScenarios.TC_0005_ConfirmingFormDetails;
/***********************************************************************************
*                                                                                  *
* Class Name     : StepDefinitionFile                                              * 
* Description    : This is Cucumber Step Definition File implemented               *
* 				   all this steps written in feature file.                         *
*                                                                                  *
************************************************************************************/
public class StepDefinitionFile {
	BaseClass bs;
	TC_0001_SearchBookshelve tc0001;
	TC_0002_BookshelvesDetails tc0002;
	TC_0003_LivingMenuItems tc0003;
	TC_0004_GiftCards tc0004;
	TC_0005_ConfirmingFormDetails tc0005;
	
	@Given("User is already on UrbanLadder WebPage")
	public void user_is_already_on_urban_ladder_web_page() throws IOException {
		
		FileReader file = new FileReader(".//src/test/resources/config.properties");
		Properties p = new Properties();
		p.load(file);
		
		bs = new BaseClass();
		bs.driverSetup(p.getProperty("os"),p.getProperty("browser"));

	}

	@Then("User search for Bookshelves in Search Box") 
	public void user_search_for_bookshelves_in_search_box() {
		tc0001 = new TC_0001_SearchBookshelve();
		tc0001.sendInSearch();
		

	}

	@Then("User Click Search button")
	public void user_click_search_button() {
		tc0001.clicksearch();
		
	}

	@Then("User Close the popup")
	public void user_close_the_popup() {
		tc0002= new TC_0002_BookshelvesDetails();
		tc0002.closePopUp();

	}

	@Then("User Scroll Down page Till Bookshelves Available")
	public void user_scroll_down_page_till_bookshelves_available() {
		tc0002.scrollDown();

	}

	@When("User Hover to the Category option")
	public void user_hover_to_the_category_option() {
		tc0002.hoverCategory();

	}

	@Then("User Select category as Bookshelve")
	public void user_select_category_as_bookshelve() {
		tc0002.bookshelveCategory();

	}

	@When("User Hover to Price option")
	public void user_hover_to_price_option() {
		tc0002.hoverToPrice();

	}

	@Then("User wait for Price Slide Bar")
	public void user_wait_for_price_slide_bar() {
		tc0002.waitPriceSlider();

	}

	@Then("User slide Max price to {double}")
	public void user_slide_max_price_to(Double double1) throws InterruptedException {
		tc0002.slidePriceamount();

	}

	@When("User hover to SortBy option")
	public void user_hover_to_sort_by_option() {
		tc0002.hoverSortBy();

	}

	@Then("User Select Sort By Price High to Low")
	public void user_select_sort_by_price_high_to_low() {
		tc0002.sortAccToPrice();

	}

	@Then("User select in stock option")
	public void user_select_in_stock_option() {
		tc0002.inStock();

	}

	@Then("User fetch all the Available Bookshelves and Store Top three in excel")
	public void user_fetch_all_the_available_bookshelves_and_store_top_three_in_excel() {
		tc0002.collectingBookShelvesList();

	}

	@Then("User Print the top three Bookshelves on console")
	public void user_print_the_top_three_bookshelves_on_console() {
		tc0002.displayingBookShelves();

	}

	@Then("User scroll page up till living is present")
	public void user_scroll_page_up_till_living_is_present() {
		tc0003 = new TC_0003_LivingMenuItems();
		tc0003.scrollUp();

	}

	@When("User hover to living option")
	public void user_hover_to_living_option() {
		tc0003.hoverToLiving();

	}

	@Then("User wait for submenu to appear")
	public void user_wait_for_submenu_to_appear() {
		tc0003.waitforSubmenu();

	}

	@Then("User fetch all option Available under Seating and Chair and store in excel")
	public void user_fetch_all_option_available_under_seating_and_chair_and_store_in_excel() {
		tc0003.submenuSeatingandChairStoreInExcel();

	}

	@Then("User Print the Available items on Console")
	public void user_print_the_available_items_on_console() {
		tc0003.displaySubMenuSeatingandChair();

	}

	@Then("User scroll Page to Gifts Card button")
	public void user_scroll_page_to_gifts_card_button() throws InterruptedException {
		tc0004 = new TC_0004_GiftCards();
		tc0004.scrollPage();

	}

	@Then("User Click Gift Cards button")
	public void user_click_gift_cards_button() {
		tc0004.clickGiftCardsButton();

	}

	@Then("Load the Json File for input as in this project input taken from Json File")
	public void load_the_json_file_for_input_as_in_this_project_input_taken_from_json_file() {
		tc0004.loadTheJSONFile();

	}

	@Then("User Scroll to All Gifts cards options present")
	public void user_scroll_to_all_gifts_cards_options_present() {
		tc0004.scrollDownToGiftsOptions();

	}

	@When("User Select BirthdayOrAnniversary Gift option")
	public void user_select_birthday_or_anniversary_gift_option() {
		tc0004.selectBirthdayOrAnniversary();

	}

	@Then("User Fill the Amount")
	public void user_fill_the_amount() {
		tc0004.enteringPriceAmount();

	}

	@When("User click Next button")
	public void user_click_next_button() {
		tc0004.clickOnNextbtn();

	}

	@Then("User Fill the Recipient Name")
	public void user_fill_the_recipient_name() {
		tc0004.enterNameofRecipient();

	}

	@Then("User Fill the Incorrect Recipient Email")
	public void user_fill_the_incorrect_recipient_email() {
		tc0004.enterEmailofRecipient();

	}

	@Then("User Fill the Recipient Mobile number")
	public void user_fill_the_recipient_mobile_number() {
		tc0004.enterMobileofRecipient();

	}

	@Then("User Fill the Customer Name")
	public void user_fill_the_customer_name() {
		tc0004.enterNameofCustomer();

	}

	@Then("User Fill the Customer Email")
	public void user_fill_the_customer_email() {
		tc0004.enterEmailofCustomer();

	}

	@Then("User Fill the Customer Mobile Number")
	public void user_fill_the_customer_mobile_number() {
		tc0004.enterMobileNumberofCustomer();

	}

	@Then("User Fill the Customer Address")
	public void user_fill_the_customer_address() {
		tc0004.enterAddressofCustomer();

	}

	@Then("User Fill the Customer Pin")
	public void user_fill_the_customer_pin() {
		tc0004.enterPinofCustomerPin();

	}

	@Then("User Fill the Optional Message")
	public void user_fill_the_optional_message() {
		tc0004.enterMessageIfAny();

	}

	@When("User Click the Confirm button")
	public void user_click_the_confirm_button() throws InterruptedException {
		tc0004.clickOnConfirmbtn();

	}

	@Then("User Capture the Error Message and Print it on Console")
	public void user_capture_the_error_message_and_print_it_on_console() {
		tc0004.getErrorMessage();

	}

	@Then("User Clear the Recipient Email Box")
	public void user_clear_the_recipient_email_box() {
		tc0004.clearrecipientmail();

	}

	@Then("User Fill the correct Recipient Email")
	public void user_fill_the_correct_recipient_email() {
		tc0004.enterCorrectDeatils();

	}

	@When("User Again Click the Confirm button")
	public void user_again_click_the_confirm_button() throws InterruptedException {
		tc0004.clickConfirmWithcorrectEmail();

	}

	@Then("User Successfully submitted the details and on confirm details page")
	public void user_successfully_submitted_the_details_and_on_confirm_details_page() {
		tc0004.confirmDetails();

	}

	@Then("User Verify amount Enetered")
	public void user_verify_amount_enetered() {
		tc0005 = new TC_0005_ConfirmingFormDetails();
		tc0005.confirmamountEnetered();

	}

	@Then("User Verify Recipient Name")
	public void user_verify_recipient_name() {
		tc0005.confirmrecipientName();

	}

	@Then("User Verify Recipient Email")
	public void user_verify_recipient_email() {
		tc0005.confirmrecipientEmail();

	}

	@Then("User Verify Recipient Mobile")
	public void user_verify_recipient_mobile() {
		tc0005.confirmrecipientMobile();

	}

	@Then("User Verify Customer Name")
	public void user_verify_customer_name() {
		tc0005.confirmcustomerName();

	}

	@Then("User Verify Customer Email")
	public void user_verify_customer_email() {
		tc0005.confirmcustomerEmail();

	}

	@Then("User Verify Customer Mobile")
	public void user_verify_customer_mobile() {
		tc0005.confirmcustomerMobile();

	}

	@Then("User Verify Customer City")
	public void user_verify_customer_city() {
		tc0005.confirmcustomerCity();

	}

	@Then("User Verify Customer PinCode")
	public void user_verify_customer_pin_code() {
		tc0005.confirmcustomerPinCode();

	}

}
