import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.*;

import java.util.concurrent.TimeUnit;

public class MikronisTestFirefox{
        private WebDriver driver;

        @BeforeClass
        public static void setupClass() {
            WebDriverManager.firefoxdriver().setup();
        }

        @BeforeMethod
        public void setupTest() {
            driver = Browsers.startBrowser(Inputs.FIREFOX_TEST, Inputs.BASE_URL);
        }

        @Test(description = "Registration of new account")
        public void registerTest() throws InterruptedException {
            IndexPage mainPage = PageFactory.initElements(driver, IndexPage.class);
            mainPage.goToLogin();

            LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
            loginPage.goToRegister();

            RegisterPage registerPage = PageFactory.initElements(driver, RegisterPage.class);
            registerPage.writeRegisterInfo(
                    Inputs.REGISTER_EMAIL,
                    Inputs.REGISTER_NAME,
                    Inputs.REGISTER_SURNAME,
                    Inputs.REGISTER_ADDRESS,
                    Inputs.REGISTER_CITY,
                    Inputs.REGISTER_POSTALCODE,
                    Inputs.REGISTER_PHONE,
                    Inputs.REGISTER_PASSWORD
            );
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            registerPage.register();
        }

        @Test(description = "Login into users account")
        public void loginTest() throws InterruptedException {
            IndexPage mainPage = PageFactory.initElements(driver, IndexPage.class);
            mainPage.goToLogin();
            LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
            loginPage.writeLoginInfo(Inputs.LOGIN_NAME, Inputs.LOGIN_PASSWORD);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            loginPage.login();
        }

        @Test(description = "Searching particular item")
        public void queryTest() {
            IndexPage mainPage = PageFactory.initElements(driver, IndexPage.class);
            mainPage.customSearch(Inputs.CUSTOM_SEARCH);
            mainPage.confirmSearch();
        }

        @Test(description = "Adding item into shopping cart")
        public void addToCartTest() {
            queryTest();
            SearchPage searchResultPage = PageFactory.initElements(driver, SearchPage.class);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            searchResultPage.selectFirstArticle();

            DetailsPage articleDetailPage = PageFactory.initElements(driver, DetailsPage.class);
            articleDetailPage.addToCart();
        }

        @Test(description = "Removing item from shopping cart")
        public void removeFromCart() {
            addToCartTest();
            CartPage cartPage = PageFactory.initElements(driver, CartPage.class);
            driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
            cartPage.openShoppingCart();
            cartPage.removeFromCart();
        }

        @AfterMethod
        public void teardownTest() {
            if (driver != null) {
                driver.quit();
            }
        }
}
