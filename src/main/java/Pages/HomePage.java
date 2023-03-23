package Pages;

import Consts.Consts;
import org.openqa.selenium.By;

public class HomePage extends BasePage {


    public void navigateToHomePage() {
        webDriver.get(Consts.HOME_PAGE_URL);
    }

    public boolean isLogoVisible() {
        Boolean isVisible = elementExists(Consts.LOGO_IMG);
        return isVisible;
    }

    public boolean isComingSoonImageVisible() {
        Boolean isComSoonImageVisible = elementExists("//img[@alt='coming soon']");
        return isComSoonImageVisible;
    }



}
