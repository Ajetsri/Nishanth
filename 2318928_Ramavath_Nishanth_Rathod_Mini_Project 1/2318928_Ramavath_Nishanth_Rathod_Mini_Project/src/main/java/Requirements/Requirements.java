package Requirements;

import java.io.IOException;
import java.time.Duration;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import ExcelUtils.ExcelUtils;



public class Requirements {
	// Variable of type WebDriver
		public WebDriver driver;
		
		// Setting the Driver
		public Requirements(WebDriver driver) {
			this.driver = driver;
		}
		// Handling All the Cookies
		public void setCookiesHandle() {
			driver.manage().deleteAllCookies();
		}
		
		//Set Destination
		public void setDestination(String destination) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			try {
			driver.findElement(By.xpath("//input[@id='input-auto-complete']")).sendKeys(destination);
			driver.findElement(By.xpath("//*[@id=\"suggestion-list\"]/ul/li[1]")).click();
			
			}catch(Exception e) {};
		}
		// Set Check-in/Check-out Date
		public void setInOutDate() {
			
			LocalDate today = LocalDate.now();
			LocalDate nextWeek = today.plus(1, ChronoUnit.WEEKS);
			String strWeek=nextWeek.toString();
			String dateArr[]=strWeek.split("-");
			String dateYear=dateArr[0];
			String dateMonth=dateArr[1];
			String dateDay=dateArr[2];
			String b="valid-calendar-day-"+dateYear+"-"+dateMonth+"-"+dateDay;
			String dstr="//button[@data-testid='"+b+"']";
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			try {
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			WebElement dateButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(dstr)));
			// dateButton.click();
			//  Using JavaScript to click the element. This will bypass any elements that are overlaying the element
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", dateButton);

			}catch(StaleElementReferenceException e) {};

		}
		
		public void setGuestRooms() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
			// Handling Room Button
			try {
			WebElement buttonRoom = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='search-form-guest-selector']")));
			buttonRoom.click();
			}catch(StaleElementReferenceException e) {};
			// Handling Adult Button
			try {
			WebElement adultMinus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='adults-amount-minus-button']")));
			adultMinus.click();
			}catch(StaleElementReferenceException e) {};
			// Handling Apply Button
			try {
			WebElement applyButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='guest-selector-apply']")));
			// applyButton.click();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", applyButton);

			}catch(StaleElementReferenceException e) {};
			// Handling Search Button
			try {
			WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-testid='search-button-with-loader']")));
			// searchButton.click();
			JavascriptExecutor executor = (JavascriptExecutor)driver;
			executor.executeScript("arguments[0].click();", searchButton);

			}catch(StaleElementReferenceException e) {};	
		}
		
		public void setSortBy() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			// Sorting the elements by ratings
			try {
			driver.findElement(By.xpath("//*[@id='sorting-selector']/option[5]")).click();
			}catch(StaleElementReferenceException e) {};
		}
		

		public void setHotelPrice() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			//Handling Price of the Hotels Displayed
			List<WebElement> priceArr=driver.findElements(By.xpath("//*[@data-testid='recommended-price']"));
			System.out.println("==========================");
			for(WebElement y:priceArr) {
				System.out.println(y.getText());
			}
		}
		
		public void setExcelPrice() throws IOException, InterruptedException {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			//Handling Price of the Hotels Displayed in Excel
			List<WebElement> priceArr=driver.findElements(By.xpath("//*[@data-testid='recommended-price']"));
			int size=priceArr.size();
			ExcelUtils rx=new ExcelUtils();
			rx.outputExcelData(priceArr, size);

		}
		
		public void hotelMachingList() {
			// Handling Case By making the List Same (Matching)
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
			List<WebElement> hotelName = driver.findElements(By.xpath("//*[@itemprop='name']"));
			List<WebElement> hotelPrice = driver.findElements(By.xpath("//*[@itemprop='price']"));
			
			System.out.println("==========================");
			for(int i=0; i<hotelPrice.size(); i++) {
		        if(i < hotelName.size() && i < hotelPrice.size()) {
		            System.out.println(hotelName.get(i).getText()+" : "+hotelPrice.get(i).getText());
		        }
		    }
		};
		public void setCloseBrowser() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
			// Closing the Browser
			driver.quit();
		}
		public void setCompletion() {
			System.out.println("***** Project Execution Completed ********");
		}
}
