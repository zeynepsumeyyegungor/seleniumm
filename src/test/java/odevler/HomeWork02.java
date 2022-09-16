package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork02 {
     // 1.Bir Class olusturalimYanlisEmailTesti
     // 2.http://automationpractice.com/index.php sayfasinagidelim
     // 3.Sign in butonunabasalim
     // 4.Email kutusuna @isareti olmayan bir mail yazipenter'a
     // bastigimizda "Invalid email address" uyarisi ciktigini testedelim

    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get("http://automationpractice.com/index.php");
    }
    @AfterClass
    public static void tearDown(){
      //  driver.close();
    }
    @Test
    // Sign in butonuna basalim
    public void test1(){
        driver.findElement(By.xpath("(//*[@class='login'])[1]")).click();
    }
    @Test
    // E-mail kutusuna @isareti olmayan bir mail yazip
    public void test2(){
        driver.findElement(By.xpath("(//*[@class='is_required validate account_input form-control'])[1]"))
                .sendKeys("zeynebgmail.com", Keys.ENTER);
    }
    @Test
    // enter'a bastigimizda "Invalid email address" uyarisi ciktigini testedelim
    public void test3(){
        Assert.assertFalse(driver.findElement(By.xpath("(//*[@class='alert alert-danger'])[1]")).isDisplayed());
    }
}
