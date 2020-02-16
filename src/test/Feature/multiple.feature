Feature: Access wesites through internet
  Scenario Outline: Access multiple websites
    Given I am a chrome user
    When I access "<websiteName>" website
    Then i see websiteName with "<websiteTitle>"

    Examples:
    |websiteName|websiteTitle|
    |facebook|Facebook|
    |booking|Booking.com |
    |santander|Santander|

Scenario Outline:identify the elements of facebook login page
  Given I am a chrome user
  When I access facebook websites
  Then I see "<elementsName>" is visible

  Examples:
  |elementsName|
  |email       |
  |pass        |
  |u_0_b       |





