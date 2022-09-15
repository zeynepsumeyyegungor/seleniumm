package odevler;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class HomeWork {
        /*
       1. Tarayıcıyı başlatın
       2. 'http://automationexercise.com' url'sine gidin
       3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
       4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
       5. 'Yeni Kullanıcı Kaydı'nı doğrulayın! görünür
       6. Adı ve e-posta adresini girin
       7. 'Kaydol' düğmesini tıklayın
       8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünür olduğunu doğrulayın
       9. Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
       10. 'Bültenimize kaydolun!' onay kutusunu seçin.
       11. 'Ortaklarımızdan özel teklifler alın!' onay kutusunu seçin.
       12. Doldurma ayrıntıları: Ad, Soyadı, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarası
       13. 'Hesap Oluştur düğmesini' tıklayın
       14. 'HESAP OLUŞTURULDU!' görünür
       15. 'Devam' düğmesini tıklayın
       16. 'Kullanıcı adı olarak oturum açıldı' ifadesinin görünür olduğunu doğrulayın
       17. 'Hesabı Sil' düğmesini tıklayın
       18. 'HESAP SİLİNDİ!' görünür ve 'Devam' düğmesini tıklayın
         */


    static WebDriver driver;

    @BeforeClass
    public static void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
    }
    /*
    @AfterClass
    @Ignore
    public static void tearDown(){
        driver.close();

    }
     */
    //1. Tarayıcıyı başlatın
    //2. 'http://automationexercise.com' url'sine gidin
    //3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
    @Test
    public void test1(){
        driver.get("http://automationexercise.com");
    }
    //4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın






}
