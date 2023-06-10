package Pages;

import Consts.Consts;
import org.openqa.selenium.By;

public class LoginPage extends BasePage {

    public static String navigateToLoginPage() {
        webDriver.get(Consts.HOME_PAGE_URL);
        webDriver.findElement(By.xpath("//a[@name='Log in/Register']")).click();
        String result = webDriver.getCurrentUrl();
        return result;
    }

    public boolean isLoginPageLoaded() {
        Boolean isLoginPageOpened = elementExists("//h3[contains(text(),'Log in')]");
        return isLoginPageOpened;
    }
//fgfdhrft
    public boolean isJobPageLoaded() {
        Boolean isJobPageOpened = elementExists("//h2[contains(text(),'Jobs')]");
        return isJobPageOpened;
    }
}
