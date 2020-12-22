package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class HomePage extends BasePage {
    private By element = By.xpath(".//*/h1[contains(text(),'Built')]");

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void logOutChecking() {
        Assert.assertEquals("Built for developers", driver.findElement(element).getText());

    }
}