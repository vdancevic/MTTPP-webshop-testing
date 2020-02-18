package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

    private WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[1]/input")
    private WebElement usernameEditBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[2]/input")
    private WebElement passwordEditBox;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[1]/form/div[4]/button")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/div[4]/div/div/div[2]/div/a")
    private WebElement goToRegisterButton;

    public void writeLoginInfo(String username, String password) {
        usernameEditBox.sendKeys(username);
        passwordEditBox.sendKeys(password);
    }
    public void login() {
        loginButton.click();
    }

    public void goToRegister() {
        goToRegisterButton.click();
    }

}
