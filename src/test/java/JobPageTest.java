import Pages.AboutUsPage;
import Pages.JobPage;
import Utils.UseCaseBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

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




}
