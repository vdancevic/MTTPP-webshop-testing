package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {
    @FindBy(xpath = "/html/body/div[4]/div/div[2]/div[4]/div[2]/div[1]/div[1]/ul/li[1]/a")
    private WebElement firstArticle;

    public void selectFirstArticle() {
        firstArticle.click();
    }

}

