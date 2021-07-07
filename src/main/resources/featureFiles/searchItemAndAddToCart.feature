@web
Feature: Search Item on Amazon and Add to Cart

  Scenario Outline: Search Item and the Item from the list to cart
    Given As a User I am on Homepage of Amazon
    When As a User search the "<searchItem>" in search filed
    And User click on the first Item from list
    Then User Clicked on the Cart button
    And verifies that Item is added to cart

    Examples:
      | searchItem        |
      | Apple macbook Pro |
      | Iphone            |