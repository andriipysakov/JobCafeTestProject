import Pages.HomePage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HomePageTest extends UseCaseBase {
    private static HomePage homePage;
    public static final Logger logger = LogManager.getLogger(HomePageTest.class);

    @BeforeAll
    public static void classSetup() {
        homePage = new HomePage();
    }

    @BeforeEach
    public void beforeTest() {
        homePage.navigateToHomePage();
    }

    @Test
    public void homePageLoadTest() {
        logger.info("Home Page load test");
        Boolean success = homePage.isLogoVisible();
        homePage.takeScreenshot("HomePageTest");
        assertTrue(success);
    }
    @Test
    public void homePageComingSoonImageTest() {
        logger.info("Coming Soon Image test");
        Boolean success = homePage.isComingSoonImageVisible();
        homePage.takeScreenshot("HomePageComingSoonImageTest");
        assertTrue(success);
    }


}
