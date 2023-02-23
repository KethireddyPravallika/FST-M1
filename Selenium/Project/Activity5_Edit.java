package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Activity5_Edit {
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
        driver.findElement(By.id("menu_pim_viewMyDetails")).click();
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("personal_txtEmpFirstName")).sendKeys("ABC");
        driver.findElement(By.id("personal_txtEmpLastName")).sendKeys("bin");
        driver.findElement(By.id("personal_optGender_2")).click();
        Thread.sleep(2000);
        Select dropdown = new Select(driver.findElement(By.id("personal_cmbNation")));
        dropdown.selectByVisibleText("Indian");
        Thread.sleep(2000);
        driver.findElement(By.id("personal_DOB")).sendKeys("20130212");
        Thread.sleep(2000);
        driver.findElement(By.id("btnAddAttachment")).click();
        Thread.sleep(2000);
        //driver.quit();



    }
}
