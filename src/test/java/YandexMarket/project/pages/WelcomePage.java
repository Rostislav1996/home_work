package YandexMarket.project.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WelcomePage {

    private By sigIn = By.xpath("/html/body/div[1]/div[3]/noindex/div/div/div[2]/div[3]/div[1]/div[6]/div/div/div[1]/a/span");

    private WebDriver driver;

    public WelcomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignIn() {
        driver.findElement(sigIn).click();
    }

}
