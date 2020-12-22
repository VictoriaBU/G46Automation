package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public abstract class BasePage {
    private By logoButton = By.xpath("//summary[@aria-label='View profile and more']");
    private By signOutButton = By.xpath(".//*/button[contains(text(),'Sign')]");

    protected WebDriver driver;
    protected Logger log;

       public BasePage(WebDriver driver) {
        this.driver = driver;
        this.log = LogManager.getLogger();

    }
    public HomePage logOut() {
        Assert.assertTrue(this.driver.findElement(logoButton).isDisplayed());
        driver.findElement(logoButton).click();
        Assert.assertTrue(this.driver.findElement(signOutButton).isDisplayed());
        driver.findElement(signOutButton).click();
        return new HomePage(driver);
    }

}
