package com.uitest.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    private WebDriver driver;

    //Page URL
    private static String PAGE_URL = "https://www.credify.tech/portal/login";

    // Web Element for User Name text-box
    @FindBy(how = How.NAME, using = "username")
    private WebElement userName;

    // Web Element for User Passwrod text-box
    @FindBy(how = How.NAME, using = "password")
    private WebElement userPassword;

    // Web Element for Sign In button
    @FindBy(how = How.XPATH, using = "//button[@type='submit']")
    private WebElement signInBtn;

    //Constructor
    public LogInPage(WebDriver driver) {
        this.driver = driver;
        driver.get(PAGE_URL);
        //Initialise Elements
        PageFactory.initElements(driver, this);
    }

    public void logIn(String Name, String Password) {
        userName.clear();
        userName.sendKeys(Name);
        userPassword.clear();
        userPassword.sendKeys(Password);
        signInBtn.click();
    }
}
