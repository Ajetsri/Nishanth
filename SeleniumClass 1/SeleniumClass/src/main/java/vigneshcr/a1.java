package vigneshcr;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 Assignement
----------------
1) Launch browser
2) open URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
3) Provide username  - admin@yourstore.com
4) Provide password  - admin
5) Click on Login button 
6) Verify the title of dashboard page Exp title : Dashboard / nopCommerce administration
7) Verify Dasboad
 */
public class a1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//1) Launch browser
		WebDriver driver=new ChromeDriver();
		
		//2) open URL: https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		Thread.sleep(5000);
		
		// Maximizing the screen
		driver.manage().window().maximize();
		
		//3) Provide username  - admin@yourstore.com
		
		/*
		WebElement a=driver.findElement(By.id("Email"));
		System.out.println(a.getAttribute("value"));
		*/
		driver.findElement(By.id("Email")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("Email")).sendKeys("admin@yourstore.com");
		// 4) Provide password  - admin
		driver.findElement(By.id("Password")).clear();
		Thread.sleep(1000);
		driver.findElement(By.id("Password")).sendKeys("admin");
		// 5) Click on Login button 
		WebElement log=driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button"));
		log.click();
		
		//6) Verify the title of dashboard page Exp title : Dashboard / nopCommerce administration
		String t=driver.getTitle();
		String verify="Dashboard / nopCommerce administration";
		if(t.equals(verify)) {
			System.out.println("Test Passed 1...");
		}else {
			System.out.println("Test Failed 1...");
		}
		
		//7) Verify Dasboad
		String oDash=null;
		try {
		oDash=driver.findElement(By.xpath("/html/body/div[3]/aside/div/div[4]/div/div/nav/ul/li[1]")).getText();
		}catch(NoSuchElementException e) {
			oDash="";
		};
		String vDash="Dashboard";
		if(oDash.equals(vDash)) {
			System.out.println("Test Passed 2...");
		}else {
			System.out.println("Test Failed 2...");
		}
		
		
		Thread.sleep(3000);
		driver.quit();
		
		
	}

}
