package day08;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_Allerts {
    /*
    Bir web sitesine gridiğimizde karsimiza bir uyari mesaji ya da bir butona tikladimizda bir uyari(alert)
    cikabilir.Eger bu uyariya incele(mause sag tik-incele) yapabiliyorsak bu tur alert'lere HTML Alert denir.
    Ve istedigimiz locate'i alabilirz. Ama gelen uyari kutusuna mudehale (sag tik-incele) edemiyorsak bu tur alert'lere
    Java Script (JS) alert denir. JS alert'lere mudehale edebilmek icin;
    - Tamam ya da ok icin "driver.switchTo().alert().accept()" kullanilir,
    - Iptal icin "driver.switchTo().alert().dismiss()" kullanilir.
    - Allert icindeki mesaji almak icin "driver.switchTo().alert().getText()"  kullanilir
    -Alert mesaj istiyorsa "driver.switchTo().alert().senKeys("")" kullanilir
     */
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
        //driver.close();
    }

         /*
        ●Bir class olusturun:Alerts
        ●https://the-internet.herokuapp.com/javascript_alerts adresine gidin.

        ●Bir metod olusturun:acceptAlert○1.
        butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        "You successfully clicked an alert" oldugunu test edin.

        ●Bir metod olusturun:dismissAlert○2. butona tıklayın,
        uyarıdaki Cancel butonuna tıklayın ve resultmesajının"successfuly" icermedigini test edin.

        ●Bir metod olusturun:sendKeysAlert○3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
         */

    @Test
    public void test1() throws InterruptedException {
        //●https://the-internet.herokuapp.com/javascript_alerts adresine gidin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");

        // ●Bir metod olusturun:acceptAlert○1.
        //butona tıklayın, uyarıdaki OK butonuna tıklayın ve result mesajının
        //"You successfully clicked an alert" oldugunu test edin.
        driver.findElement(By.xpath("//*[text()='Click for JS Alert']")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept(); //"Tamam" tusuna basamadigimiz icin alert() kullandik."accept()" tamam demek.
        WebElement mesaj = driver.findElement(By.xpath("//*[@id='result']"));
        String actualMesaj = mesaj.getText();
        String expectedMesaj = "You successfully clicked an alert";
        Assert.assertEquals(actualMesaj,expectedMesaj);
    }
    @Test
    public void test2() throws InterruptedException {
        //Bir metod olusturun:dismissAlert○2. butona tıklayın,
        //uyarıdaki Cancel butonuna tıklayın ve resultmesajının"successfuly" icermedigini test edin.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Confirm']")).click();
        //Alert uzerindeki mesaji yazdirin
        System.out.println("'.buton Alert Mesajı = " + driver.switchTo().alert().getText());
        Thread.sleep(1500);
        driver.switchTo().alert().dismiss();

        String actualMesaj = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedMesaj = "successfuly";
        Assert.assertFalse(actualMesaj.contains(expectedMesaj)); //actualMesaj,expectedMesaj'ında yazanı iceriyor mu ?
    }
    @Test
    public void tes3() throws InterruptedException {
        // ●Bir metod olusturun:sendKeysAlert○3. butona tıklayın, uyarıdaki metin kutusuna isminizi yazin,
        //OK butonuna tıklayın ve result mesajında isminizin görüntülendiğini doğrulayın.
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//*[text()='Click for JS Prompt']")).click();
        //Alert uzerindeki mesajı yazdirin
        Thread.sleep(2000);
        System.out.println("3. Butonun alert mesaji = " + driver.switchTo().alert().getText());
        driver.switchTo().alert().sendKeys("zeyneb sumeyye");
        Thread.sleep(1500);
        driver.switchTo().alert().accept();
        String actualMesaj = driver.findElement(By.xpath("//*[@id='result']")).getText();
        String expectedMesaj = "zeyneb sumeyye";
        Assert.assertTrue(actualMesaj.contains(expectedMesaj));
    }
}
