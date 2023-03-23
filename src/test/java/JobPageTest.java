import Pages.AboutUsPage;
import Pages.JobPage;
import Utils.UseCaseBase;
import com.sun.jdi.Value;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.core.util.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class JobPageTest extends UseCaseBase {
    private static JobPage jobPage;
    public static final Logger logger = LogManager.getLogger(JobPageTest.class);

    @BeforeAll
    public static void classSetup() {
        jobPage = new JobPage();
    }

    @BeforeEach
    public void beforeTest() {
        webDriver.get(JobPage.navigateToJobPage());
    }

    @Test
    public void jobPageLoadTest() {
        logger.info("Job Page load test");
        Boolean success = jobPage.isJobPageLoaded();
        jobPage.takeScreenshot("JobPageTest");
        assertTrue(success);
    }

    @Test
    public void searchLocationTest() {
        logger.info("Job location search test");
        jobPage.searchLocationLoadTest();
        // Search 1 location
        WebElement location1 = webDriver.findElement(By.xpath("//*[text()='Toronto, ON, Canada']"));
        String actualResult1 = location1.getText();
        assertEquals("Toronto, ON, Canada", actualResult1);
        // Search 2 location
        WebElement location2 = webDriver.findElement(By.xpath("//*[text()='Chicago, IL, USA']"));
        String actualResult2 = location2.getText();
        assertEquals("Chicago, IL, USA", actualResult2);

    }

    @Test
    public void searchPositionTest() {
        logger.info("Job position search test");
        jobPage.searchPositionLoadTest();
        // Search 1 position
        WebElement position1 = webDriver.findElement(By.xpath("//h2[contains(text(),'Developer')]"));
        String actualResult1 = position1.getText();
        assertEquals(true, actualResult1.contains("Developer"));
        // Search 2 position
        WebElement position2 = webDriver.findElement(By.xpath("//h2[contains(text(),'QA')]"));
        String actualResult2 = position2.getText();
        assertEquals(true, actualResult2.contains("QA"));

    }

    @Test
    public void searchCompanyTest() {
        logger.info("Job company search test");
        jobPage.searchCompanyLoadTest();
        // Search 1 company
        WebElement company1 = webDriver.findElement(By.xpath("//b[contains(text(),'Apple')]"));
        String actualResult1 = company1.getText();
        assertEquals(true, actualResult1.contains("Apple"));

    }

    @Test
    public void searchCombinedTest() throws InterruptedException {
        logger.info("Job combined search test");
        jobPage.searchCombinedLoadTest();
        Thread.sleep(1000);
        WebElement combinedSearch = webDriver.findElement(By.xpath("//li[@class='entry-content']"));
        String actualResult = combinedSearch.getText();
        assertEquals(true, actualResult.contains("Google"));
        assertEquals(true, actualResult.contains("USA"));
        assertEquals(true, actualResult.contains("manager"));

    }
    @Test
    public void searchNoResultTest() throws InterruptedException {
        logger.info("Job No result search test");
        jobPage.searchNoResultLoadTest();
        Thread.sleep(1000);
        WebElement noResult = webDriver.findElement(By.xpath("//div[@class='col-lg-8 entries']"));
        String actualResult = noResult.getText();
        assertEquals("found 0 items", actualResult);

    }

}
