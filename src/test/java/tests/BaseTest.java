package tests;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public abstract class BaseTest {
    protected static WebDriver driver;

    @Before
    public void SetUp() {
        System.setProperty(
                "webdriver.chrome.driver",
                System.getProperty("user.dir") +
                        "/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        driver.get("https://github.com/login");
    }

    @After
    public void tearDown() {
        driver.quit();
    }

}

