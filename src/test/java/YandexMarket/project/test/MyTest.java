package YandexMarket.project.test;

import YandexMarket.framework.Browser;
import YandexMarket.project.pages.AuthorizationPage;
import YandexMarket.project.pages.Catalog;
import YandexMarket.project.pages.WelcomePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class MyTest extends BaseTest {
    @Test
    public void firstTest() {


        WebDriver driver= Browser.getDriver();
        driver.get("https://market.yandex.ru/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

        WelcomePage welcomePage = new WelcomePage(driver);
      welcomePage.clickSignIn();

        AuthorizationPage authorizationPage = new AuthorizationPage(driver);

        authorizationPage.autorizationOnWeb();
        Catalog catalog = new Catalog(driver);
        catalog.CatalogClickButton();
        catalog.catalogCountprint();
        catalog.sectionRandom();



    }


    }

