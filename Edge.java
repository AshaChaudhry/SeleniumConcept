package LocatorConcept;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.concurrent.TimeUnit;

public class Edge {
    public static void main(String[] args) {
        WebDriverManager.edgedriver().setup();
        WebDriver driver= new EdgeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.manage().window().fullscreen();
        //Thread.sleep(2000);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();

        driver.findElement(By.className("ico-login")).click();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.header > div.header-upper > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a")).click();
        driver.findElement(By.id("Email")).sendKeys("Tester1@gmail.com");

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        //Thread.sleep(2000);
        driver.findElement(By.id("Password")).sendKeys("Test@1");
        driver.findElement((By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div > div > div.page-body > div.customer-blocks > div.returning-wrapper.fieldset > form > div.buttons > button"))).click();






    }
}
