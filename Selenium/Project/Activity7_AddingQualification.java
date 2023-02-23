package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity7_AddingQualification {
    WebDriver driver;

    @Test
    public void logintest() throws Exception {
        System.setProperty("webdriver.firefox.driver", "c:\\firefoxdriver.exe");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(1000);
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        Thread.sleep(1000);
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        Thread.sleep(1000);
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/div[1]/ul/li[9]/a")).click();
        driver.findElement(By.id("addWorkExperience")).click();
        driver.findElement(By.id("experience_employer")).sendKeys("IBM");
        driver.findElement(By.id("experience_jobtitle")).sendKeys("manager");
        driver.findElement(By.id("btnWorkExpSave")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}

