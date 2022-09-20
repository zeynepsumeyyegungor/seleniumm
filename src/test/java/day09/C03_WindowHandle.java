package day09;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C03_WindowHandle {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @After
    public void tearDown(){
        driver.quit();
    }
    @Test
    public void test1(){
        //Amazon anasayfa adresine gidin.
        driver.get("https://amazon.com");

        //Sayfa’nin window handle degerini String bir degiskene atayin
        String amazonWindowsHandle = driver.getWindowHandle();

        //Sayfa title'in "Amazon" icerdigini test edelim
        String expectedTitle = "Amazon";
        String actualTitle = driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        //Yeni bir tab olusturup, acilan tab'da techproeducation.com adresine gidin
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://techproeducation.com");

        //Sayfa Title'in "TECHPROEDUCATION" icerdigini test edin
        Assert.assertFalse(driver.getTitle().contains("TECHPROEDUCATION"));

        //Yeni bir window olusturun "wallmart.com" sayfasina gidin
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://walmart.com");

        //Sayfa Title'in "Walmart" icerdigini test et
        Assert.assertTrue(driver.getTitle().contains("Walmart"));

        //Ilk acilan sayfaya donun ve amazon sayfasina dondugumuzu test edin
        driver.switchTo().window(amazonWindowsHandle);
        Assert.assertTrue(driver.getTitle().contains(actualTitle));
    }
}
