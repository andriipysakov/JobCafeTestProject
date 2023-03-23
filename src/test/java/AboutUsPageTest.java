import Pages.AboutUsPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AboutUsPageTest extends UseCaseBase {
    private static AboutUsPage aboutUsPage;
    public static final Logger logger = LogManager.getLogger(AboutUsPageTest.class);

    @BeforeAll
    public static void classSetup() {
        aboutUsPage = new AboutUsPage();
    }

    @BeforeEach
    public void beforeTest() {
        webDriver.get(AboutUsPage.navigateToAboutUsPage());
    }

    @Test
    public void aboutUsPageLoadTest() {
        logger.info("About Us Page load test");
        Boolean success = aboutUsPage.isAboutUsPageLoaded();
        aboutUsPage.takeScreenshot("AboutUsPageTest");
        assertTrue(success);
    }

    @Test
    public void aboutUsPageLogoVisibleTest() {
        logger.info("Home Page load test");
        Boolean success = aboutUsPage.isLogoVisible();
        aboutUsPage.takeScreenshot("HomePageTest");
        assertTrue(success);
    }




}
