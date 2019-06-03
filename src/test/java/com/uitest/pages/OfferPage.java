package com.uitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class OfferPage {

    private WebDriver driver;

    // Web Element for loan amount
    @FindBy(how = How.CLASS_NAME, using = "sc-cSHVUG hrpZHk")
    private WebElement loanAmount;

    // Web Element for loan term
    @FindBy(how = How.CLASS_NAME, using = "section--xs")
    private WebElement loanTerm;

    // Web Element for APR
    @FindBy(how = How.XPATH, using = "//div[@class='sc-bsbRJL gYniIX']//div")
    private WebElement apr;

    // Web Element for Monthly Payment
    @FindBy(how = How.XPATH, using = "//span[@data-auto='defaultMonthlyPayment']")
    private WebElement monthlyPayment;

    // Web Element for Menu link
    @FindBy(how = How.CLASS_NAME, using = "header-nav__toggle")
    private WebElement menuLink;

    // Web Element for Logout link
    @FindBy(how = How.XPATH, using = "//a[contains(text(),'Sign Out')]")
    private WebElement logOutLink;

    //Constructor
    public OfferPage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void logOut() {
        menuLink.click();
        logOutLink.click();
    }
}
