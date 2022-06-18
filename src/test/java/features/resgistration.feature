@test
  Feature: Registration
    Scenario: User should be able to register successfully on NopeCommerce

      Given The user is on registration page
      When  The user enters all the fields or details
      And Click on register submit button
      Then The user should be able to register successfully