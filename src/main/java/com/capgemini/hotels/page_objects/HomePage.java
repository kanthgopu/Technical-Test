package com.capgemini.hotels.page_objects;

import com.capgemini.hotels.drivers.DriverHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Gopu on 12/11/2016.
 */
public class HomePage extends DriverHelpers {

    @FindBy(linkText = "Login")
    private WebElement loginLink;

    @FindBy(id = "username")
    private WebElement userNameTxt;

    @FindBy(id = "password")
    private WebElement passwordTxt;

    @FindBy(id = "doLogin")
    private WebElement submitBtn;

    @FindBy(id = "hotelName")
    private WebElement hotelTxt;

    @FindBy(id = "address")
    private WebElement addressTxt;

    @FindBy(id = "owner")
    private WebElement ownerTxt;

    @FindBy(id = "phone")
    private WebElement phoneTxt;

    @FindBy(id = "email")
    private WebElement emailTxt;

    @FindBy(id = "createHotel")
    private WebElement createBtn;

    @FindAll(@FindBy(css = " .col-sm-2>p"))
    private List<WebElement> entryList;

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    public void doLogin(String username, String password) {
        loginLink.click();
        userNameTxt.sendKeys(username);
        passwordTxt.sendKeys(password);
        submitBtn.click();
    }

    public void provideEntryDetails(String hotelName, String address, String owner, String phone, String email) {
        hotelTxt.sendKeys(hotelName);
        addressTxt.sendKeys(address);
        ownerTxt.sendKeys(owner);
        phoneTxt.sendKeys(phone);
        emailTxt.sendKeys(email);
        createBtn.click();
    }

    public List<String> isEntryFound() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        List<String> listOfHotels = new ArrayList<>();
        for (WebElement hotelName : entryList) {
            listOfHotels.add(hotelName.getText());
        }
        return listOfHotels;
   }

    public void deleteEntry(int index) {
        driver.navigate().refresh();
        driver.findElement(By.id(""+index/4)).click();
    }

}
