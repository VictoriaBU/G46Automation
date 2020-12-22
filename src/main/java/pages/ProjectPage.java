package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static helper.ColorPrinter.printMessageInColor;
import static helper.ConsoleColors.*;

public class ProjectPage extends BasePage{
    private By pomFile = By.xpath(".//*/a[contains(text(),'pom')]");

    private By codeTab = By.xpath(".//*/span[contains(text(),'Code')]");
    private By issuesTab = By.xpath(".//*/span[contains(text(),'Issues')]");
    private By pullTab = By.xpath(".//*/span[contains(text(),'Pull')]");
    private By actionsTab = By.xpath(".//*/span[contains(text(),'Actions')]");
    private By projectsTab = By.xpath(".//*/span[contains(text(),'Projects')]");
    private By wikiTab = By.xpath(".//*/span[contains(text(),'Code')]");
    private By securityTab = By.xpath(".//*/span[contains(text(),'Wiki')]");
    private By insightsTab = By.xpath(".//*/span[contains(text(),'Insights')]");
    private By settingsTab = By.xpath(".//*/span[contains(text(),'Settings')]");

    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public PomPage pomSearch() {

        Assert.assertTrue(this.driver.findElement(pomFile).isDisplayed());
        driver.findElement(pomFile).click();
        return new PomPage(driver);

    }
    public ProjectPage tabsSearch() {
        Assert.assertTrue(this.driver.findElement(codeTab).isDisplayed());
        driver.findElement(codeTab).getText();
        Assert.assertTrue(this.driver.findElement(issuesTab).isDisplayed());
        driver.findElement(issuesTab).getText();
        Assert.assertTrue(this.driver.findElement(pullTab).isDisplayed());
        driver.findElement(pullTab).getText();
        Assert.assertTrue(this.driver.findElement(actionsTab).isDisplayed());
        driver.findElement(actionsTab).getText();
        Assert.assertTrue(this.driver.findElement(projectsTab).isDisplayed());
        driver.findElement(projectsTab).getText();
        Assert.assertTrue(this.driver.findElement(wikiTab).isDisplayed());
        driver.findElement(wikiTab).getText();
        Assert.assertTrue(this.driver.findElement(securityTab).isDisplayed());
        driver.findElement(securityTab).getText();
        Assert.assertTrue(this.driver.findElement(insightsTab).isDisplayed());
        driver.findElement(codeTab).getText();
        Assert.assertTrue(this.driver.findElement(settingsTab).isDisplayed());
        driver.findElement(settingsTab).getText();
        return new ProjectPage(driver);
    }
    public ProjectPage tabsPrint(){

        printMessageInColor(driver.findElement(codeTab).getText(), BLUE, log);
        printMessageInColor(driver.findElement(issuesTab).getText(), YELLOW, log);
        printMessageInColor(driver.findElement(pullTab).getText(), GREEN, log);
        printMessageInColor(driver.findElement(actionsTab).getText(), RED, log);
        printMessageInColor(driver.findElement(projectsTab).getText(), PURPLE, log);
        printMessageInColor(driver.findElement(wikiTab).getText(), CYAN, log);
        printMessageInColor(driver.findElement(securityTab).getText(), BLUE, log);
        printMessageInColor(driver.findElement(insightsTab).getText(), YELLOW, log);
        printMessageInColor(driver.findElement(settingsTab).getText(), GREEN, log);
        return new ProjectPage(driver);

    }
}
