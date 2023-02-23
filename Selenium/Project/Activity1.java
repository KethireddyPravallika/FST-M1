package ProjectActivities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class Activity1 {
    WebDriver driver;

@Test
    public static void main(String[] args) {
        System.setProperty("webdriver.firefox.driver","c:\\firefoxdriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");

        // Close the browser
        driver.close();


    }
}
