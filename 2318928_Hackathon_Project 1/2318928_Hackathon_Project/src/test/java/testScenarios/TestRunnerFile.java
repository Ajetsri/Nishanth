package testScenarios;
/***************************************
 *                                     *
 * AUTHOR       : Ramavath Rathod      *
 * DATE CREATED : 29-March-2024        *
 * PROJECT      : DisplayBookshelves   *
 *                                     *
 ***************************************/
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
/***********************************************************************************
*                                                                                  *
* Class Name     : TestRunnerFile                                                  * 
* Description    : This class used to run project using cucumber 				   *
*                   include feature file path,stepdefinition file pathand report   *
*                   path also group you want to run								   *
*                                                                                  *
************************************************************************************/


@RunWith(Cucumber.class)
@CucumberOptions( 
		features= {".//featureFiles/UrbanLadder.feature"},
		glue="stepDefinition",
		plugin= {"pretty",
				"html:reports/myreportCucumber.html",
				"rerun:target/rerun.txt",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"
				},
		tags="@sanity",
		
		//actual execution not done if dry run is true
		dryRun=false,//to check every methods in feature file is implemented in  step definition
		//monochrome = true,//remove junk characters from console output
		publish=true//share report to team gives url of report on console
		
		

		)
public class TestRunnerFile{
	

}

