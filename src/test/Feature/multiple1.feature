Feature: Access websites through internet
  Scenario: verify forward and backward website pages
    Given I am a chrome user
    When  I am in facebook login page
    And I access  booking.com website
    And I go backward
    Then I see facebook

Scenario: verify forward website page
  Given I am a chrome user
  When I am in facebook login page
  And I access  booking.com website
  And I go backward
  And I go forward
  Then I see the booking.com