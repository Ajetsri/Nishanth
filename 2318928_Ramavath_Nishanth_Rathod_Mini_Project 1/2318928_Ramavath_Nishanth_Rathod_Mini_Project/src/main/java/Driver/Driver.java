package Driver;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Driver {

	// Variable of type WebDriver
	 public static WebDriver driver;
	 	
	 	// Method to Handle the Driver of different types
		public static WebDriver getWebDriver(String baseUrl) {
			System.out.println("Choose the browser below");
			System.out.println("1.Chrome");
			System.out.println("2.Edge");
			System.out.println("Enter the option number: ");
			Scanner read = new Scanner(System.in);
			byte num = read.nextByte();
			if(num==1) {
				// Creating the Object of the ChromeDriver
				driver = new ChromeDriver();
				driver.get(baseUrl);
				
			}
			else if(num==2) {
				// Creating the Object of the EdgeDriver
				driver = new EdgeDriver();
				driver.get(baseUrl);
			}
			read.close();
			// Returning the Driver
			return driver;
		}
}
