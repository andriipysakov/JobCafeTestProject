package Pages;

import Consts.Consts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

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

    public void searchLocationLoadTest() {
        WebElement searchLocationField = webDriver.findElement(By.xpath("//input[@name='location']"));
        searchLocationField.click();
        searchLocationField.sendKeys("Toronto, Tel-Aviv, Chicago, New-York");
        webDriver.findElement(By.xpath("//button[text()='search']")).click();
    }

    public void searchPositionLoadTest() {
        WebElement searchPositionField = webDriver.findElement(By.xpath("//input[@name='position']"));
        searchPositionField.click();
        searchPositionField.sendKeys("QA, Developer, Project Manager");
        webDriver.findElement(By.xpath("//button[text()='search']")).click();
    }public void searchCompanyLoadTest() {
        WebElement searchCompanyField = webDriver.findElement(By.xpath("//input[@name='company']"));
        searchCompanyField.click();
        searchCompanyField.sendKeys("Apple, Facebook, Google");
        webDriver.findElement(By.xpath("//button[text()='search']")).click();
    }

}
