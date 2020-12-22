package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.BasePage;
import pages.ProjectPage;

public class MainPage extends BasePage {

    private By searchField = By.xpath("//*[@id=\"dashboard-repos-filter-left\"]");
    private By confirmButton = By.xpath("//*[@id=\"repos-container\"]/ul/li[1]/div/a");

    public MainPage(WebDriver driver) {
        super(driver);
    }

    public ProjectPage projectOpening() {
        Assert.assertTrue(this.driver.findElement(searchField).isDisplayed());
        driver.findElement(searchField).sendKeys("G46Automation");
        Assert.assertTrue(this.driver.findElement(confirmButton).isDisplayed());
        driver.findElement(confirmButton).click();
        return new ProjectPage(driver);

    }

}