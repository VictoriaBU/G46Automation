package pages;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PomPage extends BasePage {
    private final static Logger LOG = LogManager.getLogger();

    public PomPage(WebDriver driver) {

        super(driver);
    }

    private By seleniumVersion = By.id("LC33");

        public PomPage versionCompare() {
        Assert.assertEquals("3.141.59", driver.findElement(seleniumVersion).getText().replaceAll("[ <></>]+[a-zA-Z]+[</>]", ""));
        LOG.info("selenium version is " + driver.findElement(seleniumVersion).getText().replaceAll("[ <></>]+[a-zA-Z]+[</>]", ""));
        return this;
    }

}