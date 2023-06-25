@add_shipping_address
  Feature: add_Shipping_address
    Background: Sing in homepage
      Given user navigates to "https://pearlymarket.com/"

      Scenario: TC_01_sign_up
        And user clicks on home page Register button
        And user enters "<username>" and "<email>" and "<password>" on sign up page
        And user clicks the button to aggree the privacy policy
        Then click on the Sign Up button to register.

      Scenario: TC_02_Add_shipping_address
        And user enters My Account page
        And user clicks on Shipping link button
        And user clicks on ADD button under Shipping Address
        Then Verify Shipping Email adress is filled automatically
        And capture the screenshot
        And user enters "<firstname>","<lastname>","<StreetAddress>","<Postcode>","<TownCity>" and "<Phone>"
        And user selects Country_region and Province in Billing Address
        And user clicks on Save Shipping Address button
        Then verify user added Shipping Address successfully
        And close the application