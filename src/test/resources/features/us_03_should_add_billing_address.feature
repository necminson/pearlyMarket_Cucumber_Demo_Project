@add_billing_address
Feature: add_Billing_address
  Background: Sing in homepage
    Given user navigates to "https://pearlymarket.com/"

    Scenario: TC01_sign_up
      And user clicks on home page Register button
      And user enters "<username>" and "<email>" and "<password>" on sign up page
      And user clicks the button to aggree the privacy policy
      Then click on the Sign Up button to register.

    Scenario: TC02_Add_billing_address
      And user enters My Account page
      And user clicks on Address link button
      And user clicks on ADD button under Billing Address
      Then Verify Email address is filled automatically
      And capture the screenshot
      And user enters "<firstname>","<lastname>","<StreetAddress>","<Postcode>","<TownCity>" and "<Phone>"
      And user selects Country_region and Province
      And user clicks on Save Address button
      Then verify user added Billing Address successfully
      And close the application






