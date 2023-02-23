package ProjectActivities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Activity4_Emp {
    WebDriver driver;
    @Test
    public void logintest() throws Exception
    {
        System.setProperty("webdriver.firefox.driver","c:\\firefoxdriver.exe");
        driver =new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("http://alchemy.hguy.co/orangehrm");
        Thread.sleep(2000);
        driver.findElement(By.id("txtUsername")).sendKeys("orange");
        Thread.sleep(2000);
        driver.findElement(By.id("txtPassword")).sendKeys("orangepassword123");
        Thread.sleep(2000);
        driver.findElement(By.id("btnLogin")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(2000);
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Pravallika");
        driver.findElement(By.id("lastName")).sendKeys("Kethireddy");
        driver.findElement(By.id("btnSave")).click();
        driver.findElement(By.id("menu_pim_viewPimModule")).click();
        Thread.sleep(1000);
        driver.findElement(By.id("empsearch_employee_name_empName")).sendKeys("Pravallika Kethireddy");
        driver.findElement(By.id("btnAdd")).click();
        driver.findElement(By.id("firstName")).sendKeys("Sai");
        driver.findElement(By.id("lastName")).sendKeys("Chandra");
        driver.findElement(By.id("btnSave")).click();
        Thread.sleep(1000);
        driver.quit();
    }
}

