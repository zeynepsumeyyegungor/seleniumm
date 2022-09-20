package day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_WindowHandle {
    WebDriver driver;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void test1() {
        /*
        Eğer bize verilen task'te sayfalar arası geçiş varsa her driver.get() methodundan sonra
        driver'in window handle değerini string bir değişkene atarız
        Sonrasında farklı bir sayfaya yada sekmeye gittikten sonra tekrar ilk sayfaya dönmemiz istenirse
        String değişkene atadığımız window handle değerleriyle sayfalar arası geçiş yapabiliriz
         */
        // 1- Amazon sayfasina gidelim
        driver.get("https://amazon.com");
        String amazonWindowHandle = driver.getWindowHandle();

        // 2- Url'in "amazon" icerdigini test edelim
        String expectedUrl = "amazon";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrl));

        // 3- Yeni bir pencere acip bestbuy anasaufasina gidelim (https://www.bestbuy.com)
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://www.bestbuy.com");
        String bestbuyWindowsHandle = driver.getWindowHandle();

        // 4- Title'in "BestBuy" icerdigini test edelim.
        String expectedTitle = "Best Buy";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // 5- Ilk sayfaya donup sayfada "java" aratalim.
        driver.switchTo().window(amazonWindowHandle);
        WebElement searcbox = driver.findElement(By.id("twotabsearchtextbox"));
        searcbox.sendKeys("java", Keys.ENTER);

        // 6- Arama sonuclarinin java icerdigini test edelim
        WebElement aramaSonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
        String arananKelime = "java";
        String actualSonuc = aramaSonucu.getText();
        Assert.assertTrue(actualSonuc.contains(arananKelime));

        // 7- Yeniden bestbuy sayfasina gidelim
        driver.switchTo().window(bestbuyWindowsHandle);

        // 8- Logonun goruldugunu test edelim
        Assert.assertTrue(driver.findElement(By.xpath("(//*[@class='logo'])[1]")).isDisplayed());

        // 9- Sayfalari kapatalim
        // @After methodunda "driver.quit();" yapmistik.
    }
}
