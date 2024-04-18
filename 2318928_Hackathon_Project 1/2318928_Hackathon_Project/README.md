
# URBANLADDER # [Github Repo Link](https://github.com/Ajetsri/Hackathon/tree/master).

This is a Selenium based Automation Project on a website named https://UrbanLadder.com

## Project Description ##

### Display Bookshelves ###
	
1. Search for "BookShelves" with price below Rs. 15000, Category any one (like Wall Shelves / Kid Bookshelves / Study Tables, etc) &  exclude out of stock. Sort by price "High to Low", fetch the top 3 items & print all details in console output.
2. From Living, retrieve all items under any one of sub-menu items like  "Seating & Chairs" or "Living Storage". Also print the same in console output.
3. Under "Gift cards", choose "Birthday/Anniversay"; Fill "Customize your gift card" with valid price & date and click "Next" button; Fill "To" & "From" details under "who is this lucky person" with any one email id invalid (example: without @ symbol) and click "Submit"; Capture & display the error message in console output. Then give valid email id & validate all the given details in the "Confirm Details" section

## Tech Stack ##

- Java(Maven Project)
- Eclipse (4.30.0)

### It is implemented by integrating Framework: ###

- ApachePOI (5.2.5)
- TestNG and (7.9.0)
- Cucumber (7.15.0)

### along with: ###

- Jenkins (2.426.3)
- ExtentReport (1.14.0)
- extentreports-cucumber7-adapter (1.14.0)
- Page Object Model Concept
- JSON (1.1.1)
- Selenium Grid(selenium-server-4.18.1)

## Folder Structure ##

```bash
- src/test/java

 Package 1: pageObjects
   Class 1: BasePage.java
   Class 2: BookshelvesHomePage.java
   Class 3: GiftsCardHomePage.java
   Class 4: LivingSubMenuPage.java
   Class 5: SubmittedFormDetailsPage.java
   Class 6: UrbanLadderHomePage.java

 Package 2: StepDefinitions
   Class 1: StepDefinitionFile.java
   Class 2: Hooks.java

  Package 3: testBase
    Class 1: BaseClass.java

  Package 4: testScenarios
    Class 1: TC_0001_SearchBookshelve.java
    Class 2: TC_0002_BookshelvesDetails.java
    Class 3: TC_0003_LivingMenuItems.java
    Class 4: TC_0004_GiftCards.java
    Class 5: TC_0005_ConfirmingFormDetails java
    Class 6: TestRunnereFile.java (run this file to run using Cucumber)

   Package 5: utilities
     Class 1: ExcelWrite.java
     Class 2: ExtentReportManager.java
     Class 3: JsonRead.java

 - src/test/resources
	Config.properties (to run using grid uncomment- execution_env=remote and to run locally use- execution_env=local)
	extent.properties (create cucumber Extent report)
	GiftCardInput.json
	Log4j2.xml

 - excel
	UrbanLadderData.xlsx (contains the retrived data from WebPage)
- ExtentReports
	- SparkReport_Current_Date_and_Time
		- ExcelReports
			ExcelReport.xlsx
		- Report
			CucumberExtentReport.html (cucumber extent Report)
 - FeatureFiles
	UrbanLadder.feature

 - logs
	automation.log

 - reports
	myreportCucumber.html(Cucumber Normal Report)
 	Test-Report-Current_Date_Time(TestNG Extent Report)


-	Screenshot

-	Test-output
		index.html (TestNG normal report)

-	crossBrowserTest.xml (run this file to run on different browsers using TestNG)

-	groupingTest.xml (run this file to run groups using TestNG- need to uncomment @BeforeGroup and @AfterGroup in BaseClass and comment @BeforeTest and @AfterTest)

-	Master.xml (run this file to run all testCases using testNG)

-	ParallelBrowserTest.xml (run this file to run on different browsers using TestNG)

-	Pom.xml (right click run as maven test to run using maven)

-	runBat.bat (double click to run project using bat file)

```

## Test Cases ##

There are total 5 Test Cases classes

```bash
  Test Case 1 : Search the Bookshelve on UrbanLadder Website(consist 2 test methods)
```
```bash
  Test Case 2 : Fetch and store and print all Bookshelves in required conditions(consist 12 test methods )
```
```bash
  Test Case 3 : Fetch and store and print all submenu options under Living options(consist 5 test methods)
```
```bash
  Test Case 4 : Get Gift Card option and Fill Form for Gifts with valid and invalid details (consist 22 test methods)
  ```
```bash
  Test Case 5 : verify the submitted data on confirmation page(consist 9 test methods)
```

## Running the Project ##

We can run it Parallelly, serially and through XML files.and use TestRunner to run using cucumber. run using POM.xml and Bat file using maven. 
In order to run the project please make sure you have TestNg and Cucumber plugin installed in your Eclipse and Maven installed locally to run outside eclipse. and if want to run using grid use selenium-server-4.18.1 jar file.



*Use* ```Master.xml:to run Project using chrome with TestNG```

*Use* ```crossbrowsertest.xml:to run Project using chrome and edge with TestNG serially.```

*Use* ```parallelbrowsertest.xml:to run Project using chrome and edge parallelly with TestNG.```

*Use* ```CucumberTestRun.java:to run Project with Cucumber```

*Use* ```pom.xml:right click and run as Maven Test.```

* ```To run using grid use selenium-server-4.18.1 jar,cmd "java -jar selenium-4.18.1.jar standalone" open on browser "http://localhost:4444/" and uncomment- execution_env=remote and to run locally use- execution_env=local in config file and run using TestNG or Cucumber it will run on Grid ```

## Report and Screenshots ##

```bash
- Cucumber Extent Report (//ExtentReports//SparkReport//Report//CucumberExtentReport.html)
- Cucumber Report (//reports//myreportCucumber.html)
- TestNG Extent Report(//reports//Test-report.html)
- TestNg Report (//test-output//index.html)
- Screenshots(//screenshots//TestCases_Name.png)
- ExcelData(//excel)
```


## A Result folder is present where I placed all the results of Last run with in pdf's


## Author

- Ramavath Rathod(2318928)
