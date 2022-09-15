package day06;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C01_RadioButton {
    WebDriver driver;

    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    @After
    public void tearDoew(){
       // driver.close();
    }
    /*
    1-Gerekli yapiyi olusturun ve aşağıdaki görevitamamlayın.
    2-https://www.facebook.com adresine gidin
    3-Cookies'i kabuledin
    4-"Create an Account" button'unabasin
    5-"radio buttons" elementlerini locate edin
    6-Secili degilse cinsiyet butonundan size uygun olanisecin
    */

    @Test
    public void test2() throws InterruptedException {
        // https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        //Cookies'i kabuledin
        //"Create an Account" button'unabasin
        driver.findElement(By.xpath("(//*[@role='button'])[2]")).click();

        //"radio buttons" elementlerini locate edin
        WebElement femaleButton = driver.findElement(By.xpath("//input[@value='1']"));
        WebElement maleButton = driver.findElement(By.xpath("//input[@value='2']"));
        WebElement customButton = driver.findElement(By.xpath("//input[@value='-1']"));
        //    Secili degilse cinsiyet butonundan size uygun olani secin
        if (!maleButton.isSelected()){
            maleButton.click();
        }
        Thread.sleep(2000);
        femaleButton.click();
        Thread.sleep(2000);
        customButton.click();
    }
}
