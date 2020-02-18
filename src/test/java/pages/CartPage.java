package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class CartPage {

    @FindBy(xpath = "/html/body/header/div/ul/li[2]/a")
    private WebElement shoppingCartButton;

    @FindBy(how = How.XPATH, using = "/html/body/div[2]/section/div/div/div[2]/div[2]/div/div[3]/a")
    private WebElement removeFromCartButton;

    public void openShoppingCart() {
        shoppingCartButton.click();
    }

    public void removeFromCart() {
        removeFromCartButton.click();
    }
}