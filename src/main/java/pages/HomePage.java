package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static pageResources.Resources.*;

public class HomePage {
    WebDriver driver;


    //1- Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    //2-Elements
    private final By enterUserName = By.id("user-name");
    private final By enterPassword = By.id("password");
    private final By clickLoginButton = By.id("login-button");

    //3-Actions
    public void enterUsername () {
 //      return driver.findElement(enterUserName);
        driver.findElement(enterUserName).sendKeys(username01);
    }
    public WebElement enterPassWord () {
        return driver.findElement(enterPassword);
    }
    public WebElement clickButton () {
        return driver.findElement(clickLoginButton);
    }
    public String curl () {
        return driver.getCurrentUrl();
    }
}
