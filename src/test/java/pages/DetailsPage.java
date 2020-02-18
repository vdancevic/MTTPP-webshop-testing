package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DetailsPage {
    @FindBy(xpath = "/html/body/section/div[2]/div/div[1]/div[2]/div[3]/a[1]")
    private WebElement addToCartButton;

    public void addToCart() {
        addToCartButton.click();
    }

}


