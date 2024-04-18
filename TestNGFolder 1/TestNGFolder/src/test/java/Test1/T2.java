package Test1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T2 {
WebDriver driver;
	
	//@BeforeClass        // Here this Annotation will execute before executing another methods i.e it will execute First
	@Test(priority=10)
	void openApp()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	
	@Test(priority=50)
	void login()
	{
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[normalize-space()='Login']")).click();
	}
	
	//@AfterClass       // // Here this Annotation will execute After executing another methods i.e it will execute Last
	@Test(priority=100)
	void closeApp()
	{
		driver.quit();
	}
}
