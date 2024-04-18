package vigneshcr;

public class p14 {
	
	/*
	 Day-31
------
Broken links

Capture screenshot

Headless testing - without UI , we can execute test cases backend.
	Advantage: faster execution/performance is good
	Dis Advantage: we can't explore the functionality/ we can't see the actions/validations.
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//CaptureScreenshot
		/*
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		//Capture full page screenshot - selenium 3 & 4
		/*TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\pavan\\Aug19Batch\\seleniumproject\\screenshots\\fullpage.png");
		FileUtils.copyFile(src, trg);
		 */
		// capture screenshot of specific area from webpage -- selenium 4+
		/*WebElement featuredproducts=driver.findElement(By.xpath("//div[@class='product-grid home-page-product-grid']"));
		
		File src=featuredproducts.getScreenshotAs(OutputType.FILE);
		File trg=new File("C:\\Users\\pavan\\Aug19Batch\\seleniumproject\\screenshots\\featureproducts.png");
		FileUtils.copyFile(src, trg);
		*/
		// capture screenshot of specific Web element -- selenium 4+
		/*
			WebElement logo=driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
			File src=logo.getScreenshotAs(OutputType.FILE);
			File trg=new File("C:\\Users\\pavan\\Aug19Batch\\seleniumproject\\screenshots\\logo.png");
			FileUtils.copyFile(src, trg);
		 */
		
		// HeadlessTesting
		
		/*
		 
 ////////    chrome browser    ///////////		
		
		//Appraoch1) Headless mode
		/*ChromeOptions options=new ChromeOptions();
		options.setHeadless(true);
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver(options);
		*/
		
		//Appraoch2) WDM 5.1+
		//ChromeOptions options=new ChromeOptions();
		//options.setHeadless(true);
		
		//WebDriver driver=WebDriverManager.chromedriver().capabilities(options).create();
		
//////////    edge browser    /////////////
		
		//Appraoch1
	    /*EdgeOptions options=new EdgeOptions();
		options.setHeadless(true);
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver(options);
		*/
		
		//Appraoch 2
		/*
		EdgeOptions options=new EdgeOptions();
		options.setHeadless(true);
		
		WebDriver driver=WebDriverManager.edgedriver().capabilities(options).create();
		
				
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
			
		driver.findElement(By.name("username")).sendKeys("Admin");
			 
		driver.findElement(By.name("password")).sendKeys("admin123");
				
		driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		
		// validation
		
		String act_title=driver.getTitle();
		String exp_title="OrangeHRM";
		
		if(act_title.equals(exp_title))
		{
			System.out.println("Login test passed");
		}
		else
		{
			System.out.println("Login Test failed");
		}
		
	//7. close browser
		
		driver.quit();
		 */
		
	}

}
