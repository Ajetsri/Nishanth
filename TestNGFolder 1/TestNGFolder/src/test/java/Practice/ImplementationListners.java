package Practice;

import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class ImplementationListners extends TestListenerAdapter{
	public void onTestStart(ITestResult result) {
		System.out.println("Starting ...");
	};
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Passed ...");
	};
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Failed ...");
	};
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skipped ...");
	};
	public void onFinish(ITestResult result) {
		System.out.println("Execution Completed ...");
	};
}
