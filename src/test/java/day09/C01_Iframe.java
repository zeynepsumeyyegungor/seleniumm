package day09;

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

public class C01_Iframe {
    /*
    ● Bir class olusturun: IframeTest
    ● https://the-internet.herokuapp.com/iframe adresine gidin.
    ● Bir metod olusturun: iframeTest
       ○ “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
       ○ Text Box’a “Merhaba Dunya!” yazin.
       ○ TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu
         dogrulayin ve konsolda yazdirin
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
       // driver.close();
    }
    @Test
    public void test1() throws InterruptedException {
        //https://the-internet.herokuapp.com/iframe sayfasina gidin
        driver.get("https://the-internet.herokuapp.com/iframe");
       // “An IFrame containing….” textinin erisilebilir oldugunu test edin ve konsolda yazdirin.
        WebElement iframeYazisi = driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(iframeYazisi.isDisplayed());
        System.out.println(iframeYazisi.getText());
       // Text Box’a “Merhaba Dunya!” yazin.
        WebElement textBox = driver.findElement(By.id("mce_0_ifr")); //frame'e gecis yapmadan once orayi id ile locate edelim
        driver.switchTo().frame(textBox); //sonra locate ettigimiz frame'e gecmek icin bu methodu kullaniriz
        WebElement textBoxFrame = driver.findElement(By.xpath("//p")); //metin yazmak icin textbox'u locate ettik.
        textBoxFrame.clear();  //clear method'u textbox'u temizler.
        Thread.sleep(1500);
        textBoxFrame.sendKeys("Merhaba Dunya!"); //textbox'un icine yazacagimiz metini gonderir

       // TextBox’in altinda bulunan “Elemental Selenium” linkini textinin gorunur oldugunu dogrulayin ve konsolda yazdirin
        driver.switchTo().defaultContent(); //ilk textbox'tan cikmak icin ana sayfayi incelemek icin yaptik.
         WebElement elemantel = driver.findElement(By.xpath("//*[text()='Elemental Selenium']"));
         Assert.assertTrue(elemantel.isDisplayed());
        System.out.println(elemantel.getText());
    }
}
