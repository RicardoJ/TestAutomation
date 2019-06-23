#Author: rjdiazzh@gmail.com
Feature: Automated the your logo page

  Scenario: choose a product and it is displayed in the shopping cart successfully
    Given that I opened  browser at Your Logo page
    When  I look for 'dress' and select any for to go to shopping cart
    Then  in the shopping cart show the product is not 'null'
