package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class IndexPage {
    private WebDriver driver;

    public IndexPage(WebDriver driver) {
        this.driver = driver;
    }

    @FindBy(xpath = "/html/body/header/div/ul/li[5]/a")
    private WebElement loginButton;

    @FindBy(xpath = "/html/body/header/div/ul/li[4]/a")
    private WebElement registerButton;

    @FindBy(xpath = "/html/body/header/div/ul/li[2]/a")
    private WebElement cartButton;

    @FindBy(xpath = "/html/body/header/div/div/form/ul/li[1]/input")
    private WebElement searchBar;

    @FindBy(xpath = "/html/body/header/div/div/form/ul/li[2]/a/span")
    private WebElement searchBoxConfirmButton;

    public void goToLogin() {
        loginButton.click();
    }

    public void goToRegister() {
        registerButton.click();
    }

    public void gotToCart() {
        cartButton.click();
    }

    public void customSearch(String searchString) {
        searchBar.sendKeys(searchString);
    }

    public void confirmSearch() {
        searchBoxConfirmButton.click();
    }
}


