package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity6_Directory {
    WebDriver driver;

    @Test
    public void logintest() throws Exception {
        System.setProperty("webdriver.firefox.driver", "c:\\firefoxdriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(2000);
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        boolean t =driver.findElement(By.id("menu_directory_viewDirectory")).isDisplayed();
        if (t) {
            System.out.println("Element is dispalyed");
        } else {
            System.out.println("Element is not dispalyed");
        }
        boolean y =driver.findElement(By.id("menu_directory_viewDirectory")).isEnabled();
        if (y) {
            System.out.println("Element is clickable");
        } else {
            System.out.println("Element is not clickable");
        }
        driver.getPageSource().contains("Search Directory");
        System.out.println("search directory is present");




    }
}
