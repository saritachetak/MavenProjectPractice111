Feature: Accessing multiple website

  Scenario: verify facebook access
    Given I am a chrome user
    When I access facebook.com
    Then I see facebook login page

  Scenario: verify the santander wesite
    Given I am a chrome user
    When I access santander website.com
    Then  I see santander website.com

  Scenario: verify the booking.com website
    Given I am a chrome user
    When I access  booking.com website
    Then I see booking.com
