package odevler;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration;
public class HomeWork01 {
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
    @BeforeClass // Tüm testlerden önce 1 kez bu class çalışır.
    public static void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
   @AfterClass // Tüm testlerden sonra 1 kez bu class çalışır.
    public static void tearDown () {
        driver.close();
   
    }
    @Test
    public void testCase01_01 (){
        // 2. 'http://automationexercise.com' url'sine gidin
        driver.get("http://automationexercise.com");
    }
    @Test
    public void testCase01_02 (){
        // 3. Ana sayfanın başarıyla görünür olduğunu doğrulayın
        String actualTitle = driver.getTitle();
        String expectedTitle = "Automation Exercise";
        if(actualTitle.contains(expectedTitle)) {
            System.out.println("Title tes passed.");
        }else System.out.println("Title tes failed");
    }
    @Test
    public void testCase01_03 () throws InterruptedException {
        // 4. 'Kayıt Ol / Giriş Yap' düğmesine tıklayın
        driver.findElement(By.linkText("Signup / Login")).click();
        Thread.sleep(3000);
    }
    @Test
    public void testCase01_04 () {
        // 5. 'Yeni Kullanıcı Kaydı'nın görünür olduğunu doğrulayın!
        driver.get("http://automationexercise.com");
        driver.findElement(By.linkText("Signup / Login")).click();
        System.out.println(driver.findElement(By.xpath("//*[text()='New User Signup!']")).isDisplayed());
    }
    @Test
    public void testCase01_05 () {
        // 6. Adı ve e-posta adresini girin
        driver.get("http://automationexercise.com");
        driver.findElement(By.linkText("Signup / Login")).click();
        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("zeyneb");
        driver.findElement(By.xpath("(//input[@type='email'])[2]")).sendKeys("zeyneb123@gmail.com");
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
    }
    @Test
    public void testCase01_06 () {
        // 7. 'Kaydol' düğmesini tıklayın
        driver.findElement(By.xpath("(//*[@class='btn btn-default'])[2]")).click();
    }
    @Test
    public void testCase01_07 () {
        // 8. 'HESAP BİLGİLERİNİ GİRİN' ifadesinin görünür olduğunu doğrulayın
        driver.findElement(By.xpath("//*[text()='Enter Account Information']")).isDisplayed();
    }
    @Test
    public void testCase01_08 () throws InterruptedException {
        // 9. Doldurma ayrıntıları: Unvan, Ad, E-posta, Şifre, Doğum tarihi
        driver.findElement(By.id("uniform-id_gender1")).click();
        driver.findElement(By.xpath("(//*[@class='form-control'])[3]")).sendKeys("abc123");
        driver.findElement(By.xpath("(//*[@class='form-control'])[4]")).sendKeys("24");
        driver.findElement(By.xpath("(//*[@class='form-control'])[5]")).sendKeys("January");
        driver.findElement(By.xpath("(//*[@class='form-control'])[6]")).sendKeys("1992");
        Thread.sleep(5000);
    }
}