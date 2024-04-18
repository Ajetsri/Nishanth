Feature: Bookshelve Search on UrbanLadder

  @sanity
  Scenario: Search Bookshelve
    Given User is already on UrbanLadder WebPage
    Then User search for Bookshelves in Search Box
    Then User Click Search button

  @sanity
  Scenario: Capture the Bookshelve Details
    Then User Close the popup
    Then User Scroll Down page Till Bookshelves Available
    When User Hover to the Category option
    Then User Select category as Bookshelve
    When User Hover to Price option
    Then User wait for Price Slide Bar
    Then User slide Max price to 15,000
    When User hover to SortBy option
    Then User Select Sort By Price High to Low
    Then User select in stock option
    Then User fetch all the Available Bookshelves and Store Top three in excel
    Then User Print the top three Bookshelves on console

  @sanity
  Scenario: Capture the Living Sub-Menu items
    Then User scroll page up till living is present
    When User hover to living option
    Then User wait for submenu to appear
    Then User fetch all option Available under Seating and Chair and store in excel
    Then User Print the Available items on Console

  @sanity
  Scenario: Gift Cards and Form Validation
    Then User scroll Page to Gifts Card button
    Then User Click Gift Cards button
    Then Load the Json File for input as in this project input taken from Json File
    Then User Scroll to All Gifts cards options present
    When User Select BirthdayOrAnniversary Gift option
    Then User Fill the Amount
    When User click Next button
    Then User Fill the Recipient Name
    Then User Fill the Incorrect Recipient Email
    Then User Fill the Recipient Mobile number
    Then User Fill the Customer Name
    Then User Fill the Customer Email
    Then User Fill the Customer Mobile Number
    Then User Fill the Customer Address
    Then User Fill the Customer Pin
    Then User Fill the Optional Message
    When User Click the Confirm button
    Then User Capture the Error Message and Print it on Console
    Then User Clear the Recipient Email Box
    Then User Fill the correct Recipient Email
    When User Again Click the Confirm button
    Then User Successfully submitted the details and on confirm details page

  @sanity
  Scenario: Validating Submitted Form Details
    Then User Verify amount Enetered
    Then User Verify Recipient Name
    Then User Verify Recipient Email
    Then User Verify Recipient Mobile
    Then User Verify Customer Name
    Then User Verify Customer Email
    Then User Verify Customer Mobile
    Then User Verify Customer City
    Then User Verify Customer PinCode
