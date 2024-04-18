package vigneshcr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class p12 {
	
	/*
	 
	 Day-29
----------
Mouse actions
----------

Mouse hover  -	 moveToElement(Element)
Right click      -  contextClick(Element)
Double click  - doubleClick(Element)
Drag and drop - dragAndDrop()
slider --- dragAndDropBy(Element, x,y);


Actions - class provided by selenium webdriver.

build() - create an action
perform() - can complete the action


<input  id='abc' > testing</input>      testing - inner text
findElement(Loc).getText()  ----- testing
findElement(Loc).getAttribute('value')   - return nothing

<input id='abc' value='testing' />       no innertext
findElement(Loc).getText()   - return nothing
findElement(Loc).getAttribute('value') --- testing


getText() --- returns inner text of the element

getAttribute("value") --- testing
getAttribute("id") ------ abc

build().perform()
perfom()


Assignment
-----

Drag and drop
http://demo.guru99.com/test/drag_drop.html
	  
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ActionsVsAction
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		
		Actions act=new Actions(driver);
		
		//act.contextClick(button).build().perform();
		
		
		Action myaction=act.contextClick(button).build();  // creating action and storing it in variable
		myaction.perform();  // completing action 
		
		//act.contextClick(button).perform(); //right click

		// DoubleClickDemo
		
		/*
		 
		 WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult"); // switch to frame
		
		WebElement f1=driver.findElement(By.xpath("//input[@id='field1']"));
		f1.clear();
		f1.sendKeys("Welcome");
		
		WebElement button=driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act=new Actions(driver);
		
		act.doubleClick(button).perform(); // double click action

		//validation
		WebElement f2=driver.findElement(By.xpath("//input[@id='field2']"));
		
		//String copiedtext=f2.getText();  // will not work
		String copiedtext=f2.getAttribute("value");  // this will work
		
		System.out.println("Copied text is:"+copiedtext);
		
		if(copiedtext.equals("Welcome"))
		{
			System.out.println("test passed");
		}
		else
		{
			System.out.println("test failed");
					
		}
		 
		 */
		
		// DragAndDropDemo
		
		/*
		 WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		// rome---> Italy
		WebElement rome=driver.findElement(By.xpath("//div[@id='box6']"));
		WebElement italy=driver.findElement(By.xpath("//div[@id='box106']"));
		
		act.dragAndDrop(rome, italy).perform(); // drag and drop
		
		
		// Wasington---> USA
		WebElement washington=driver.findElement(By.xpath("//div[@id='box3']"));
		WebElement usa=driver.findElement(By.xpath("//div[@id='box103']"));
		
		act.dragAndDrop(washington, usa).perform();
		 */
		
		// LocationOfElement
		/*
		 WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		WebElement logo=driver.findElement(By.xpath("//img[@alt='company-branding']"));
		
		
		System.out.println("Before maximizing window:"+logo.getLocation()); //(250, 202)
		
		driver.manage().window().maximize();
		System.out.println("After maximizing window:"+logo.getLocation());  //(660, 185)
		
		driver.manage().window().minimize();
		System.out.println("After minimizing window:"+logo.getLocation()); //(250, 157)
	
		driver.manage().window().fullscreen();
		System.out.println("After Full screen window:"+logo.getLocation());  //(660, 233)
		
		Point p=new Point(100,100);
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 100 * 100:"+logo.getLocation());  //(251, 159)
		
		 p=new Point(50,50);
		driver.manage().window().setPosition(p);
		System.out.println("After setting window 50 * 50:"+logo.getLocation());  //(252, 160)
		
		 */
		
		// MouseHoverDemo
		
		/*
		 
		 WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktops=driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement mac=driver.findElement(By.xpath("//a[normalize-space()='Mac (1)']"));
		
		
		Actions act=new Actions(driver);
		
		//Mouse hover
		
		//act.moveToElement(desktops).moveToElement(mac).click().build().perform();// creating action then perform 
		act.moveToElement(desktops).moveToElement(mac).click().perform(); // directly performing action
		
		 
		 */
		
		// RightClickDemo
		
		/*
		 
		 
		 WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		driver.get("http://swisnl.github.io/jQuery-contextMenu/demo.html");
		driver.manage().window().maximize();
		WebElement button=driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
		Actions act=new Actions(driver);
		//right click
		act.contextClick(button).perform();
		driver.findElement(By.xpath("//span[normalize-space()='Copy']")).click(); // click on copy option
		Thread.sleep(5000);
		driver.switchTo().alert().accept(); // close alert window
		 
		 */
		
		//SliderDemo
		
		/*
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
		driver.manage().window().maximize();
		Actions act=new Actions(driver);
		//Min slider
		WebElement min_slider=driver.findElement(By.xpath("//span[1]"));
		System.out.println("Current location of min slider:"+min_slider.getLocation());  //(59, 250) x,y
		act.dragAndDropBy(min_slider, 100, 250).perform();
		System.out.println("Location of min slider After moving:"+min_slider.getLocation());  
		//Max slider
		WebElement max_slider=driver.findElement(By.xpath("//span[2]"));
		System.out.println("Current location of max slider:"+max_slider.getLocation()); //(796, 250)
		act.dragAndDropBy(max_slider, -96, 250).perform();
		System.out.println("Location of max slider after moving:"+max_slider.getLocation()); 
		 */
		/*
		 
		 */
		
	}

}
