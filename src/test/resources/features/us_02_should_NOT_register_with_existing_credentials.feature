@registered_customer
Feature: registered_customer_login
  Scenario Outline: TC02_<PositiveTest>registered_customer_login_test
    Given user navigates to "https://pearlymarket.com/"
    And user clicks on home page Register button
    And user enters "<username>" and "<email>" and "<password>"
    And user clicks the button to aggree the privacy policy
    Then click on the Sign Up button to register.
    Then verify "An account is already registered with your email address." visible.
    Examples:
      | username   | email                | password    |
      | johnnydeep | johnnydeep@gmail.com | whereisdeep |
      | bradpitt   | bradpitt12@gmail.com | whereisbrad |


