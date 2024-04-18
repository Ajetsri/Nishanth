package Main;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;

import Driver.Driver;
import ExcelUtils.ExcelUtils;
import Requirements.Requirements;
import Screenshot.Screenshot;



public class Main {

	// Variable of type WebDriver
		public static WebDriver driver;
		
		// Setting the driver by making it as "static" 
		public static void setDriverMain() {
			// Setting the URL in the Browser
			driver=Driver.getWebDriver("https://trivago.in");
			// Maximizing the Browser Screen
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		}
		
		// Method for Handling all the methods of the Requirements class of type Static
		public static void setDataMain() throws IOException, InterruptedException {
			// Creating the Object of the Requirements
			ExcelUtils ex=new ExcelUtils();
			Requirements r=new Requirements(driver);
			Screenshot s=new Screenshot();
			
			s.TakeScreenshot(driver, "initial");
			r.setDestination(ex.getExcelDestination(0, 0));
			r.setCookiesHandle();
			s.TakeScreenshot(driver, "destination");
			r.setInOutDate();
			s.TakeScreenshot(driver, "date");
			r.setGuestRooms();
			s.TakeScreenshot(driver, "room");
			r.setSortBy();
//			r.setHotelPrice();
			r.setExcelPrice();
			s.TakeScreenshot(driver, "sort");
//			r.hotelMachingList();
			r.setCloseBrowser();
			r.setCompletion();
		}
		
		public static void main(String[] args) throws IOException, InterruptedException {
			// TODO Auto-generated method stub
			setDriverMain();
			setDataMain();
		}

}
