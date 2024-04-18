package Screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Screenshot {
	public static void TakeScreenshot(WebDriver driver, String Name) throws IOException{
    	File fileobj = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
    	FileUtils.copyFile(fileobj, new File("C:\\Users\\2318928\\eclipse-workspace\\2318928_Ramavath_Nishanth_Rathod_Mini_Project\\src\\test\\resources\\screenshots"+Name+".png"));
    }
}
