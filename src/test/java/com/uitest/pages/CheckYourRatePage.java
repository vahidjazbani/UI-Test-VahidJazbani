package com.uitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class CheckYourRatePage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL = "https://www.credify.tech/phone/nonDMFunnel";

    // Web Element for Loan Amount textbox
    @FindBy(how = How.NAME, using = "desiredAmount")
    private WebElement loanAmountTextbox;


    // Web Element for Loan Purpose dropdown
    @FindBy(how = How.CLASS_NAME, using = "sc-dVhcbM iHtznt")
    private WebElement loanPurposeSelect;

    // Web Element for Check your rate button
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement checkYourRateBtn;

    //Constructor
    public CheckYourRatePage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void fillCheckYourRateForm (String amount, String purpose) {
        loanAmountTextbox.clear();
        loanAmountTextbox.sendKeys(amount);
        Select purposeDropdown=new Select(loanPurposeSelect);
        purposeDropdown.selectByValue(purpose);
        checkYourRateBtn.click();
    }

}
