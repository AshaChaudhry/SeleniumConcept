import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Firstclass {
    WebDriver driver;

    @Test(priority = 1)
    void browser() {
        System.out.println("open browser");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
    }

    @Test(priority = 2)
    void computer() {
        System.out.println("select computer");
        driver.findElement(By.cssSelector(" body > div.master-wrapper-page > div.header-menu > ul.top-menu.notmobile > li:nth-child(1) > a ")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 3)
    void desktop() {
        System.out.println("select desktop");
        driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div > div.center-2 > div > div.page-body > div.category-grid.sub-category-grid > div > div:nth-child(1) > div > div > a > img")).click();
    }

    @Test(priority = 4)
    void Lenovo() {
        System.out.println("select Lenovo pc");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div[3]/div/div[2]/div[2]/div[2]/div/div/div[3]/div/div[2]/div[3]/div[2]/button[1]")).click();

    }

    @Test(priority = 5)
    void shoppingcart() {
        System.out.println("check item added to cart");
        driver.findElement(By.className("cart-label")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Test(priority = 6)
    void updateqty() {
        System.out.println("update qty to 3");
        driver.findElement(By.className("qty-input")).clear();
        driver.findElement(By.className("qty-input")).sendKeys("3");
        driver.findElement(By.id("updatecart")).click();
    }

    @Test(priority = 7)
    void checkout() {
        System.out.println("checkout the product");
        driver.findElement(By.id("termsofservice")).click();
        driver.findElement(By.id("checkout")).click();

    }

    @Test(priority = 8)
    void guest() {
        System.out.println("checkout as a guest");
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[1]/div[3]/button[1]")).click();

    }
@Test (priority = 9)
    void guestdetail(){
        System.out.println("enter guest details");
        driver.findElement(By.id("BillingNewAddress_FirstName")).sendKeys("tester");
        driver.findElement(By.id("BillingNewAddress_LastName")).sendKeys("Tester");
        driver.findElement(By.id("BillingNewAddress_Email")).sendKeys("Test1@gmail.com");
        Select dropdown=new Select(driver.findElement(By.id("BillingNewAddress_CountryId")));
        dropdown.selectByVisibleText("United Kingdom");

        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.findElement(By.id("BillingNewAddress_City")).sendKeys("london");
        driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("xyz");
        driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("abcdefg");
        driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("123456789");
        driver.findElement(By.xpath("//*[@id=\"billing-buttons-container\"]/button[4]")).click();
    }
@Test (priority = 10)
    void payment(){
    System.out.println("enter payment details");
driver.findElement(By.id("shippingoption_1")).click();
driver.findElement(By.xpath("//*[@id=\"shipping-method-buttons-container\"]/button")).click();
driver.findElement(By.id("paymentmethod_1")).click();
driver.findElement(By.xpath("//*[@id=\"payment-method-buttons-container\"]/button")).click();

    }
@Test (priority = 11)
    void carddetails(){
    System.out.println("enter card details");

    Select dropdown= new Select(driver.findElement(By.id("CreditCardType")));
    dropdown.selectByVisibleText("Master card");

    driver.findElement(By.id("CardholderName")).sendKeys("abcd");
    driver.findElement(By.id("CardNumber")).sendKeys("1233456678990");
    Select dropdown1= new Select(driver.findElement(By.id("ExpireMonth")));
    dropdown1.selectByVisibleText("06");
    //dropdown1.selectByVisibleText("2024");
    driver.findElement(By.id("CardCode")).sendKeys("023");
driver.findElement(By.xpath("//*[@id=\"payment-info-buttons-container\"]/button")).click();
driver.findElement(By.xpath("//*[@id=\"confirm-order-buttons-container\"]/button")).click();
    }
    }

