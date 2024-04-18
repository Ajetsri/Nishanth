package utilities;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import testBase.BaseClass;
/***********************************************************************************
*                                                                                  *
* Class Name     : ExtentReportManager                                             * 
* Description    : Create Extent report after the project run.                     *
*                                                                                  *
************************************************************************************/
public class ExtentReportManager implements ITestListener {
	public ExtentSparkReporter sparkReporter;//Ui of report
	public ExtentReports extent;//provide common information to report
	public ExtentTest test;//create actual test in report and update status and everything

	String repName;

	public void onStart(ITestContext testContext) {
		
		/*SimpleDateFormat df=new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss");//format
		Date dt=new Date();//create date
		String currentdatetimestamp=df.format(dt);
		*/
		//above 3 lines in one line
		String timeStamp = new SimpleDateFormat("yyyy.MM.dd.HH.mm.ss").format(new Date());// time stamp
		repName = "Test-Report-" + timeStamp + ".html";//report name dynamically generate with timestamp
		sparkReporter = new ExtentSparkReporter(".\\reports\\" + repName);// specify location of the report to maintain history of report generating timestamp and name

		sparkReporter.config().setDocumentTitle("Featured News Automation Report"); // Title of report
		sparkReporter.config().setReportName("Featured News Functional Testing"); // name of the report
		sparkReporter.config().setTheme(Theme.DARK);
		//common info:-
		extent = new ExtentReports();
		extent.attachReporter(sparkReporter);
		extent.setSystemInfo("Tester Name", "Ramavath Rathod");
		extent.setSystemInfo("Application", "UrbanLadder");
		extent.setSystemInfo("Module", "Bookshelves");
		extent.setSystemInfo("Sub Module", "display bookshelve, GiftCards,Living items");
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Environemnt", "QA");
		extent.setSystemInfo("Operatng System", "Windows");
		
		String browser = testContext.getCurrentXmlTest().getParameter("browser");
		extent.setSystemInfo("Browser", browser);
		
		List<String> includedGroups = testContext.getCurrentXmlTest().getIncludedGroups();
		if(!includedGroups.isEmpty()) {
		extent.setSystemInfo("Groups", includedGroups.toString());
		}
	}

	public void onTestSuccess(ITestResult result) {
	
		//test = extent.createTest(result.getTestClass().getName());//from result getclass get name of class
		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups()); // to display groups in report
		test.log(Status.PASS,result.getName()+" got successfully executed");
		test.log(Status.INFO,"this test belong to class:"+ result.getTestClass().getName());//getclass name
		
		try {
			String imgPath = new BaseClass().captureScreen(result.getName());//providing same name as method name to screenshot
			test.addScreenCaptureFromPath(imgPath);//adding image path to report
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}

	public void onTestFailure(ITestResult result) {
		//test = extent.createTest(result.getTestClass().getName());
		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		
		test.log(Status.FAIL,result.getName()+" got failed");
		test.log(Status.INFO, result.getThrowable().getMessage());
		test.log(Status.INFO,"this test belong to class:"+ result.getTestClass().getName());//getclass name
		
		try {
			String imgPath = new BaseClass().captureScreen(result.getName());//providing same name as method name to screenshot
			test.addScreenCaptureFromPath(imgPath);//adding image path to report
			
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}

	public void onTestSkipped(ITestResult result) {
		//test = extent.createTest(result.getTestClass().getName());
		test = extent.createTest(result.getName());
		test.assignCategory(result.getMethod().getGroups());
		test.log(Status.SKIP, result.getName()+" got skipped");
		test.log(Status.INFO, result.getThrowable().getMessage());
		test.log(Status.INFO,"this test belong to class:"+ result.getTestClass().getName());//getclass name
	}

	public void onFinish(ITestContext testContext) {
		
		extent.flush();//report genrated
		
		String pathOfExtentReport = System.getProperty("user.dir")+"\\reports\\"+repName;//open automatically report after test execution
		File extentReport = new File(pathOfExtentReport);
		
		try {
			Desktop.getDesktop().browse(extentReport.toURI());//capturing url using awt 
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
