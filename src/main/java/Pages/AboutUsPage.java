package Pages;

import Consts.Consts;
import org.openqa.selenium.By;

public class AboutUsPage extends BasePage {

    public static String navigateToAboutUsPage() {
        webDriver.get(Consts.HOME_PAGE_URL);
        webDriver.findElement(By.xpath("//a[@name='About Us']")).click();
        String result = webDriver.getCurrentUrl();
        return result;
    }

    public boolean isAboutUsPageOpened() {
        Boolean isAboutPageOpened = elementExists("//h3[contains(text(),'Voluptatem')]");
        return isAboutPageOpened;
    }
    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(Consts.LOGO_IMG);
        return isVisible;
    }
}
