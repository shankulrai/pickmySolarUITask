package com.pickmysolar.cucumber.steps;

import com.pickmysolar.pageObjects.SearchItemPageObject;
import com.pickmysolar.testUtlis.DriverManager;
import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java8.En;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.Assert;

import java.net.MalformedURLException;

public class SearchItemAndAddItemToCartSteps extends BaseSteps implements En
{
    String currentWindowHandle;
    @Before
    public void setupLoginSteps(Scenario scenario) throws MalformedURLException {
        // initializing the driver
        initializeTheDriver() ;
        searchItem=new SearchItemPageObject(DriverManager.getDriver());

    }
    public SearchItemAndAddItemToCartSteps(){
        Given("^As a User I am on Homepage of Amazon$", () -> {
            implicitWait();
            //checking that user is on page by Identifying Search field
            checkElementIsDisplayedOnPage(searchItem.getSearchField());

        });
        When("^As a User search the \"([^\"]*)\" in search filed$", (String searchItemText) -> {
            //Inserting the search Item in field and searching
            enterTextInField(searchItem.getSearchField(),searchItemText);
            clickOnElemnt(searchItem.getSearchButton());
        });

        When("^User click on the first Item from list$", () -> {
            // click on the first search result getting
            currentWindowHandle=getCurrentWindowHandle();
            waitForElementToClickable(searchItem.getListOfsearchResultOnpage().get(0));
            clickOntheElementFromList(searchItem.getListOfsearchResultOnpage(), 0);
            // Now swtich to new tab for product detail screen
            switchToNewTab(currentWindowHandle);


        });

        Then("^User Clicked on the Cart button$", () -> {
        // search result is opening to new Tab
            waitForElementToClickable(searchItem.getAddToCartButton());
            clickOnElemnt(searchItem.getAddToCartButton());

        });

        Then("^verifies that Item is added to cart$", () -> {
            waitForElementToClickable(searchItem.getViewCartButton());
            clickOnElemnt(searchItem.getViewCartButton());

            // the number of items in the cart should be greater than 0
             Assert.assertTrue(searchItem.getListOfItemsIncart().size()>0);


        });


    }

    @After
    public void teardown(Scenario scenario) {
        if (scenario.isFailed()) {

            // Take a screenshot...
            final byte[] screenshot = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.embed(screenshot, "image/png");

        }
        System.out.println("test teardown!");
        System.out.println("Closing driver!");
        teardownTheDriver();

    }

}
