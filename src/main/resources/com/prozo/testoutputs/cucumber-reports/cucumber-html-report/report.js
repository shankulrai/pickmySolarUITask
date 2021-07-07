$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("searchItemAndAddToCart.feature");
formatter.feature({
  "line": 2,
  "name": "Search Item on Amazon and Add to Cart",
  "description": "",
  "id": "search-item-on-amazon-and-add-to-cart",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Search Item and the Item from the list to cart",
  "description": "",
  "id": "search-item-on-amazon-and-add-to-cart;search-item-and-the-item-from-the-list-to-cart",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "As a User I am on Homepage of Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "As a User search the \"\u003csearchItem\u003e\" in search filed",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the first Item from list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicked on the Cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verifies that Item is added to cart",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "search-item-on-amazon-and-add-to-cart;search-item-and-the-item-from-the-list-to-cart;",
  "rows": [
    {
      "cells": [
        "searchItem"
      ],
      "line": 12,
      "id": "search-item-on-amazon-and-add-to-cart;search-item-and-the-item-from-the-list-to-cart;;1"
    },
    {
      "cells": [
        "Apple macbook Pro"
      ],
      "line": 13,
      "id": "search-item-on-amazon-and-add-to-cart;search-item-and-the-item-from-the-list-to-cart;;2"
    },
    {
      "cells": [
        "Iphone 12"
      ],
      "line": 14,
      "id": "search-item-on-amazon-and-add-to-cart;search-item-and-the-item-from-the-list-to-cart;;3"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 8527288242,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Search Item and the Item from the list to cart",
  "description": "",
  "id": "search-item-on-amazon-and-add-to-cart;search-item-and-the-item-from-the-list-to-cart;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "As a User I am on Homepage of Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "As a User search the \"Apple macbook Pro\" in search filed",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the first Item from list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicked on the Cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verifies that Item is added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:27"
});
formatter.result({
  "duration": 143092000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Apple macbook Pro",
      "offset": 22
    }
  ],
  "location": "SearchItemAndAddItemToCartSteps.java:33"
});
formatter.result({
  "duration": 1989419596,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:39"
});
formatter.result({
  "duration": 269779635,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:50"
});
formatter.result({
  "duration": 4452038468,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:57"
});
formatter.result({
  "duration": 3333540610,
  "status": "passed"
});
formatter.after({
  "duration": 171532675,
  "status": "passed"
});
formatter.before({
  "duration": 3338314648,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Search Item and the Item from the list to cart",
  "description": "",
  "id": "search-item-on-amazon-and-add-to-cart;search-item-and-the-item-from-the-list-to-cart;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 1,
      "name": "@web"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "As a User I am on Homepage of Amazon",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "As a User search the \"Iphone 12\" in search filed",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User click on the first Item from list",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "User Clicked on the Cart button",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "verifies that Item is added to cart",
  "keyword": "And "
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:27"
});
formatter.result({
  "duration": 88982387,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Iphone 12",
      "offset": 22
    }
  ],
  "location": "SearchItemAndAddItemToCartSteps.java:33"
});
formatter.result({
  "duration": 1706498376,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:39"
});
formatter.result({
  "duration": 229808289,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:50"
});
formatter.result({
  "duration": 3218934121,
  "status": "passed"
});
formatter.match({
  "location": "SearchItemAndAddItemToCartSteps.java:57"
});
formatter.result({
  "duration": 23572339349,
  "error_message": "java.lang.AssertionError: expected [true] but found [false]\n\tat org.testng.Assert.fail(Assert.java:94)\n\tat org.testng.Assert.failNotEquals(Assert.java:494)\n\tat org.testng.Assert.assertTrue(Assert.java:42)\n\tat org.testng.Assert.assertTrue(Assert.java:52)\n\tat com.pickmysolar.cucumber.steps.SearchItemAndAddItemToCartSteps.lambda$new$4(SearchItemAndAddItemToCartSteps.java:62)\n\tat ✽.And verifies that Item is added to cart(searchItemAndAddToCart.feature:9)\n",
  "status": "failed"
});
formatter.embedding("image/png", "embedded0.png");
formatter.after({
  "duration": 621637108,
  "status": "passed"
});
});