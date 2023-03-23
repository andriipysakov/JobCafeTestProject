package Pages;

import Consts.Consts;
import org.openqa.selenium.By;

public class JobPage extends BasePage {


    public static String navigateToJobPage() {
        webDriver.get(Consts.HOME_PAGE_URL);
        webDriver.findElement(By.xpath("//a[@name='Find Job']")).click();
        String jobPageURL = webDriver.getCurrentUrl();
        return jobPageURL;
    }

    public boolean isJobPageLoaded() {
        Boolean isJobPageOpened = elementExists("//h2[contains(text(),'Jobs')]");
        return isJobPageOpened;
    }

}
