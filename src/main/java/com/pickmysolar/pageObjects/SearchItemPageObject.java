package com.pickmysolar.pageObjects;

import com.pickmysolar.cucumber.steps.BaseSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchItemPageObject extends BaseSteps
{
    WebDriver driver;

    public SearchItemPageObject(WebDriver driver)
    {
        this.driver = driver;
        //This initElements method will create all WebElements
        PageFactory.initElements(driver, this);
    }

    @FindBy(id="twotabsearchtextbox")
    private WebElement searchField;


    @FindBy(id="nav-search-submit-button")
    private WebElement searchButton;

    @FindBy(xpath="//a[@class='a-link-normal a-text-normal']")
    private List<WebElement> listOfsearchResultOnpage;

    @FindBy(id="add-to-cart-button")
    private WebElement addToCartButton;

    @FindBy(xpath="//input[@aria-labelledby='attach-sidesheet-view-cart-button-announce']")
    private WebElement viewCartButton;

    @FindBy(xpath="//span[@class='a-size-medium sc-product-title']")
    private List<WebElement> listOfItemsIncart;

    @FindBy(id="attach-sidesheet-view-cart-button-announce")
    private WebElement loaderOnCartPage;

    public WebElement getLoaderOnCartPage() {
        return loaderOnCartPage;
    }

    public void setLoaderOnCartPage(WebElement loaderOnCartPage) {
        this.loaderOnCartPage = loaderOnCartPage;
    }

    public void setViewCartButton(WebElement viewCartButton) {
        this.viewCartButton = viewCartButton;
    }

    public List<WebElement> getListOfItemsIncart() {
        return listOfItemsIncart;
    }

    public void setListOfItemsIncart(List<WebElement> listOfItemsIncart) {
        this.listOfItemsIncart = listOfItemsIncart;
    }

    public WebElement getViewCartButton() {
        return viewCartButton;
    }

    public WebElement getAddToCartButton() {
        return addToCartButton;
    }

    public void setAddToCartButton(WebElement addToCartButton) {
        this.addToCartButton = addToCartButton;
    }

    public List<WebElement> getListOfsearchResultOnpage() {
        return listOfsearchResultOnpage;
    }

    public void setListOfsearchResultOnpage(List<WebElement> listOfsearchResultOnpage) {
        this.listOfsearchResultOnpage = listOfsearchResultOnpage;
    }


    public WebElement getSearchButton() {
        return searchButton;
    }

    public void setSearchButton(WebElement searchButton) {
        this.searchButton = searchButton;
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public void setSearchField(WebElement searchField) {
        this.searchField = searchField;
    }
}
