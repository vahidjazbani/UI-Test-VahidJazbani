package com.uitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class PersonalRatePage {

    private WebDriver driver;

    // Web Element for borrower first name text-box
    @FindBy(how = How.NAME, using = "borrowerFirstName")
    private WebElement borrowerFirstName;

    // Web Element for borrower last name text-box
    @FindBy(how = How.NAME, using = "borrowerLastName")
    private WebElement borrowerLasttName;

    // Web Element for borrower address text-box
    @FindBy(how = How.NAME, using = "borrowerStreet")
    private WebElement borrowerAddress;

    // Web Element for borrower city text-box
    @FindBy(how = How.NAME, using = "borrowerCity")
    private WebElement borrowerCity;

    // Web Element for borrower state text-box
    @FindBy(how = How.NAME, using = "borrowerState")
    private WebElement borrowerState;

    // Web Element for borrower zip code text-box
    @FindBy(how = How.NAME, using = "borrowerZipCode")
    private WebElement borrowerZipCode;

    // Web Element for borrower date of birth text-box
    @FindBy(how = How.NAME, using = "borrowerDateOfBirth")
    private WebElement borrowerDateOfBirth;

    // Web Element for borrower income text-box
    @FindBy(how = How.NAME, using = "borrowerIncome")
    private WebElement borrowerIncome;

    // Web Element for borrower additional income text-box
    @FindBy(how = How.NAME, using = "borrowerAdditionalIncome")
    private WebElement borrowerAdditionalIncome;

    // Web Element for borrower email text-box
    @FindBy(how = How.NAME, using = "username")
    private WebElement borrowerEmail;

    // Web Element for borrower password text-box
    @FindBy(how = How.NAME, using = "password")
    private WebElement borrowerPassword;

    // Web Element for borrower agreements check-box
    @FindBy(how = How.XPATH, using = "//div[@class='sc-hwwEjo sc-kPVwWT kPmyvl']")
    private WebElement agreementsCheckbox;

    // Web Element for check your rate button
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement checkYourRateBtn;

    //Constructor
    public PersonalRatePage(WebDriver driver) {
        this.driver = driver;
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void fillBasicInformationAndSubmmit(String firstName, String lastName, String userAddress,
                                               String userCity, String userState, String userZipCode,
                                               String userDateOfBirth, String userIncome, String userAdditionalIncome,
                                               String userEmail, String userpwd) {
        borrowerFirstName.clear();
        borrowerFirstName.sendKeys(firstName);
        borrowerLasttName.clear();
        borrowerLasttName.sendKeys(lastName);
        borrowerAddress.clear();
        borrowerAddress.sendKeys(userAddress);
        borrowerCity.clear();
        borrowerCity.sendKeys(userCity);
        borrowerState.clear();
        borrowerState.sendKeys(userState);
        borrowerZipCode.clear();
        borrowerZipCode.sendKeys(userZipCode);
        borrowerDateOfBirth.clear();
        borrowerDateOfBirth.sendKeys(userDateOfBirth);
        borrowerIncome.clear();
        borrowerIncome.sendKeys(userIncome);
        borrowerAdditionalIncome.clear();
        borrowerAdditionalIncome.sendKeys(userAdditionalIncome);
        borrowerEmail.clear();
        borrowerEmail.sendKeys(userEmail);
        borrowerPassword.clear();
        borrowerPassword.sendKeys(userpwd);
        agreementsCheckbox.click();
        checkYourRateBtn.click();
    }

}
