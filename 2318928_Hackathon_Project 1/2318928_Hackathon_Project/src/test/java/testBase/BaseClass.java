package testBase;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Platform;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
/***********************************************************************************
*                                                                                  *
* Class Name     : BaseClass                                               		   * 
* Description    : include all the methods reused in project .                     *
*                                                                                  *
************************************************************************************/
public class BaseClass {
	public static JSONParser parser;
	public static JSONObject jsonObject;
	public static Object obj;
	public static String amount;
	public static String recipientName;
	public static String recipientEmail;
	public static String customerName;
	public static String customerEmail;
	public static String customerMobile;
	public static String message;
	static Logger logger;
	
	public static WebDriver driver;
	public Properties p;//to import properties file 
	
	@SuppressWarnings("deprecation")   // Say the compilier to supress specific warning
	@BeforeTest // Run Before Every Test
	@Parameters({"os","browser"})  // set the values
	public void driverSetup(String os,String br) throws IOException
	{
		
		
		//loading properties file
		FileReader file = new FileReader(".//src/test/resources/config.properties");//class
		p=new Properties();//creating obj of Properties
		p.load(file);//load properties file
	
		
		
		
		//check on which envt want to run grid or local from config properties file
		if(p.getProperty("execution_env").equalsIgnoreCase("remote"))
		{
			DesiredCapabilities capabilities = new DesiredCapabilities();
			
			//decide os
			if(os.equalsIgnoreCase("windows"))
			{
				capabilities.setPlatform(Platform.WINDOWS);
			}
			else if(os.equalsIgnoreCase("mac"))
			{
				capabilities.setPlatform(Platform.MAC);
			}
			else
			{
				System.out.println("No matching OS...");
			}
			//decide browser
			switch(br.toLowerCase())
			{
			case "chrome" :
				capabilities.setBrowserName("chrome");
				break;
			case "edge":
				capabilities.setBrowserName("MicrosoftEdge");
				break;
			default :
				System.out.println("No matching browser..");
				return;
			}
			driver = new RemoteWebDriver(new URL("http://10.66.136.196:4444"),capabilities);//node/grid URL is fixed

		}
		
		else if(p.getProperty("execution_env").equalsIgnoreCase("local"))
		{
			
			//1.launch based on condition-locally
			switch(br.toLowerCase())
			{
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("not matching browser");
				return;

			}
		}
		

			driver.manage().deleteAllCookies();
			driver.get(p.getProperty("appURL"));
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	
	
	
	public void ExplicitlyWait(WebElement elem)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfAllElements(elem));
	}
	
	
	public void ExplicitlyWaitList(List<WebElement> elem)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
	    wait.until(ExpectedConditions.visibilityOfAllElements(elem));
	}
	
	public  static Logger getLogger() 
	{	
		logger=LogManager.getLogger(); //Log4j
		return logger;
	}
	
	public void writeToFile(String fileName,String content) throws IOException
	{
		try(FileWriter fileWriter = new FileWriter(fileName))
		{
			fileWriter.write(content);
		}catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	
	
	public String captureScreen(String tname) throws IOException
	{
		// Extent Report
		String timeStamp = new SimpleDateFormat("yyyMMddhhmmss").format(new Date());
		
		TakesScreenshot ts= (TakesScreenshot) driver;
		File sourceFile = ts.getScreenshotAs(OutputType.FILE);
		
		String targetFilePath= System.getProperty("user.dir")+"\\screenshotsofReport\\" + tname +"_" + timeStamp + ".png";
		File targetFile= new File(targetFilePath);
		FileUtils.copyFile(sourceFile, targetFile);
		
		return targetFilePath;
	}
	

}
