package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity2_Header {

WebDriver driver ;

    @Test
    public void printURL(){
        System.setProperty("webdriver.firefox.driver","c:\\firefoxdriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/orangehrm");
        System.out.println(driver.findElement(By.xpath("//*[@id=\"divLogo\"]/img")).getAttribute("src"));


    }



}

