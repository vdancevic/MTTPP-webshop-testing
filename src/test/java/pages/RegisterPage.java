package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage {
    private WebDriver driver;

    public RegisterPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[1]/input")
    private WebElement emailEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[2]/input")
    private WebElement nameEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[3]/input")
    private WebElement surnameEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[4]/input")
    private WebElement addressEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[5]/input")
    private WebElement cityEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[6]/input")
    private WebElement postalCodeEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[7]/input")
    private WebElement phoneEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[10]/input")
    private WebElement passwordEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/div[11]/input")
    private WebElement rePasswordEditBox;

    @FindBy(xpath = "/html/body/div[2]/section/div/div/div/form/div[1]/div/button")
    private WebElement registerButton;


    public void writeRegisterInfo(String email, String firstName, String lastName, String address, String city, String postalCode, String phone, String password) {
        emailEditBox.sendKeys(email);
        nameEditBox.sendKeys(firstName);
        surnameEditBox.sendKeys(lastName);
        addressEditBox.sendKeys(address);
        cityEditBox.sendKeys(city);
        postalCodeEditBox.sendKeys(postalCode);
        phoneEditBox.sendKeys(phone);
        passwordEditBox.sendKeys(password);
        rePasswordEditBox.sendKeys(password);
    }

    public void register() {
        registerButton.click();
    }
}


