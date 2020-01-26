package pages;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrder extends Base {


    @FindBy(xpath = "//input[@name='Name']")
    WebElement name;

    @FindBy(xpath = "//div[@class='MuiFormControl-root MuiTextField-root testField']//input[@id='outlined-basic']")
    WebElement phone;

    @FindBy(xpath = "//div[@class='formHide']//div[2]//div[2]//div[1]//div[1]//input[1]")
    WebElement email;

    @FindBy(xpath = "//div[4]//div[1]//div[1]//div[1]//input[1]")
    WebElement city;

    @FindBy(xpath = "//textarea[@id='outlined-multiline-static']")
    WebElement address;

    @FindBy(xpath = "//div[@class='formHide']//div[2]//div[1]//div[1]//div[1]//input[1]")
    WebElement pincode;

    @FindBy(xpath = "//div[4]//div[2]//div[1]//div[1]//input[1]")
    WebElement landmark;

    @FindBy(xpath = "//button[@class='place-order']")
    WebElement orderButton;

    @FindBy(xpath = "//div[@class='continue']")
    WebElement contButton;

    @FindBy(xpath = "//span[contains(text(),'Home')]")
    WebElement radioButton;

    @FindBy(xpath = "//span[contains(text(),'Checkout')]")
    WebElement checkOutButton;


    @FindBy(xpath = "//span[@class='MuiButton-label']")
    WebElement contShopping;

    public PlaceOrder(WebDriver driver) {
        PageFactory.initElements(driver,this);
    }


    public void setName(String customerName) {
        name.sendKeys(customerName);
    }

    public void setEmail(String customerEmail) {
        email.sendKeys(customerEmail);
    }
    public void setPhone(String setPhone){
        phone.sendKeys(setPhone);
    }

    public void setCity(String cCity){
        city.sendKeys(cCity);
    }

    public void setPincode(String customerPincode){
        pincode.sendKeys(customerPincode);
    }

    public void setAddress(String customerAddress){
        address.sendKeys(customerAddress);
    }

    public void setLandmark(String customerlandmark){
        landmark.sendKeys(customerlandmark);
    }
    public void setOrderButton(){
        orderButton.click();
    }


    public void setContinueButton() {
        contButton.click();

    }

    public void setRadioButton(){
        radioButton.click();
    }

    public void setCheckOut(){
        checkOutButton.click();
    }

    public void setContShoppingButton(){
        contButton.click();
    }
}
