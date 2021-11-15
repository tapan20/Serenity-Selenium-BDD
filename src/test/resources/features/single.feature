Feature: Lambda Test Scenarios

  Scenario: user wants to check the checkbox
    When user reaches the checkBox URL
    And user click the chechbox
    Then user should see checkbox selected

  Scenario: user wants to select Radio Button
    When user reach the radioBtn URL
    And user select radio button
    Then user should see radio button selected

  Scenario: user wants to fill form
    When user reaches the Fill Form URL
    And user Enter Values
    Then user Should See the Value

  Scenario: user wants to select Dates from a DatePicker
    When user reaches the datePicker URL
    And user selects the date
    Then user should see date selected

  Scenario: user wants to select number of rows and set pagination
    When user reaches the pagination URL
    And user selects the nb of rows to be displayed
    Then user should data as per rows selected

  Scenario: user wants to search the value from number of records and wants to perform sorting
    When user reaches the search and sort URL
    And user search the records and perform sorting
    Then user should see searched record and records should be sorted selected

  Scenario: user wants to download
    When user reaches the JQuery Progress Bar URL
    And user starts downloading
    Then user should see downloading progress

  Scenario: user wants to work with bootstap modals
    When user reaches the bootStrapModals URL
    And user works with bootstrap modals
    Then user should see the results

  Scenario: user wants to download file with set text
    When user reaches the fileDownload URL
    And user wants to download a file
    Then file should be downloaded after set text

  Scenario: user wants to move values from left table to right or vice-versa BootStrap
    When user reaches the bootstrap list box URL
    And user select values that need to move
    Then values should be moved

  Scenario: user wants to move values from left table to right or vice-versa JQuery
    When user reaches the JQuery list box URL
    And user select values that need to add or remove
    Then values should be added or removed accordingly
