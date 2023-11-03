package TestCases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

import javax.swing.plaf.PanelUI;
import java.time.Duration;

import static pageResources.Resources.*;

public class TC_Login {

    WebDriver driver;
    HomePage homePage;
    @BeforeMethod
    public void setup () {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.navigate().to(url);
        homePage=new HomePage(driver);
    }
    @AfterMethod
    public void end()throws Exception {
        Thread.sleep(3000);
        driver.quit();

    }
    @Test
    public void TC01 (){
        homePage.enterUsername();
        homePage.enterPassWord().sendKeys(password01);
        homePage.clickButton().click();
        Assert.assertEquals(homePage.curl(),expectedUrl);
        System.out.println(homePage.curl());
    }


}
