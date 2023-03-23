import Pages.AboutUsPage;
import Pages.LoginPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginPageTest extends UseCaseBase {
    private static LoginPage loginPage;
    public static final Logger logger = LogManager.getLogger(LoginPageTest.class);

    @BeforeAll
    public static void classSetup() {
        loginPage = new LoginPage();
    }


    // These tests are not working, because link is incorrect <BUG!!!>
    @BeforeEach
    public void beforeTest() {
        webDriver.get(LoginPage.navigateToLoginPage());
    }

    // This test is not working, because link is incorrect <BUG!!!>
    @Test
    public void loginPageLoadTest() {
        logger.info("Login Page load test");
        Boolean success = loginPage.isLoginPageOpened();
        loginPage.takeScreenshot("LoginPageTest");
        assertTrue(success);
    }

    // This test is not working, because link is incorrect <BUG!!!>
    @Test
    public void jobPageLoadTest() {
        logger.info("Job Page load test");
        WebElement login = webDriver.findElement(By.id("Login"));
        login.click();
        login.sendKeys("john");
        WebElement password = webDriver.findElement(By.id("Password"));
        password.click();
        password.sendKeys("12345");
        webDriver.findElement(By.id("Submit")).click();
        Boolean success = loginPage.isJobPageOpened();
        loginPage.takeScreenshot("JobPageTest");
        assertTrue(success);
    }




}
