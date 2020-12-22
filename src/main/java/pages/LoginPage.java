package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {

    private By loginField = By.id("login_field");
    private By passwordField = By.id("password");
    private By signInButton = By.name("commit");

    public LoginPage(WebDriver driver) {

        super(driver);
    }

    public MainPage login(String login, String password) {
        driver.findElement(loginField).sendKeys(login);
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(signInButton).click();
        return new MainPage(driver);
    }

    public LoginPage checkAuthField() {
        Assert.assertTrue(this.driver.findElement(loginField).isDisplayed());
        Assert.assertTrue(this.driver.findElement(passwordField).isDisplayed());
        Assert.assertTrue(this.driver.findElement(signInButton).isDisplayed());
        return this;
    }

}