package zzzKendimeNotlar;

public class Zeyneb {
    //Eclipse, IntelliJ ==>> IDE(integrated development environment)
    //                       IDE, yazılım geliştirme için kapsamlı olanaklar sağlayan bir yazılım uygulamasıdır.
    //Java     ==>> Yazilim dili
    //HTML     ==>> Markup language
    //Selenium ==>> Web sayfasi aplikasyonlarini farklı tarayıcılarda ve dillerde test
    //              etmemize yardimci olan bir tooldur(aractir).
    //              Selenium, otomasyon yapmak  için kendi sınıflarına ve yöntemlerine sahip bir kütüphanedir.
    //Maven    ==>> Maven bir Java derleme aracıdır (build tool). Maven proje otomasyon ve yönetim
    //              aracıdır (automation and management tool).
    //JUnit    ==>> Bir test framework(test cercevesi) cesididir.Bir test kutuphanesidir.
    //TestNG   ==>> Bir test framework(test cercevesi) cesididir.Bir test kutuphanesidir.
    //              İsmi Next Generation Test kelimelerinden türetilmiştir.Junit’in yeni versiyonudur.
    //Cucumber ==>> BDD(Davranış güdümlü geliştirme) yaklaşımı için kullanılmakta olan açık kaynak
    //              kodlu bir kütüphanedir.
    //----------------------------------
    //- webElement.click(); Web Element'e click yapar
    //- webElement.sendKeys("Metin" ); Parametre olarak yazilan metni Web Elemente gönderi
    //- webElement.submit(); Web element ile islem yaparken Enter tusuna basma gorevi yapar
    //- webElement.sendKeys("Metin" + Keys.ENTER ); Istedigimiz metni yollayip, sonra ENTER'a basar.
    //- webElement.getText(); Web Element uzerindeki yaziyi getirir
    //- webElement.getAttribute("Att.ismi" ); Ismi girilen attribute'un degerini getirir
    //- webElement.getTagName(); Web elementin tag ismini getirir
    //- webElement.isEnable(); Web Element erisilebilir ise true yoksa false döner
    //- webElement.isDisplayed(); Web Element gorunur ise true yoksa false döner
    //- webElement.isSelected(); Web Element secili ise true yoksa false doner
    //-----------------------------------
    //    *  driver.get(String Url);                         --> String olarak girilen Url'e gider.
    //    *  driver.getTitle();                              --> Icinde olunan sayfanin basligini String olarak getirir.
    //    *  driver.getCurrentUrl();                         --> Icinde olunan sayfanin Url'ini String olarak getirir.
    //    *  driver.getPageSource();                         --> Icinde olunan sayfanin kaynak kodlarini String olarak getirir.
    //    *  driver.getWindowHandle();                       --> Icinde olunan sayfa ve/veya tab'larin
    //    *  driver.getWindowHandles();                      --> Handle degerini getirir
    //    *  driver.manage().window().maximize();            --> Browser'i maximize yapar.
    //    *  driver.manage().window().minimize();            --> Browser'i minimize yapar.
    //    *  driver.manage().window().fullscreen();          --> Browser'i full scren yapar.
    //    *  driver.mange().window().getPosition();          --> Browser'in koordinatlarini verir.
    //    *  driver.manage().window().getSize();             --> Brovser'in olculerini verir
    //    *  driver.manage().window().setPosition(new x:80,y:0));  --> Browser'i istenen koordinata tasir
    //    *  driver.manage().timeouts().impkicitlyWait(Duration.ofSeconds(10));   --> Istenen sayfa acilana kadar max. beklenen sureyi gosterir.
    //    --  bir web elementini tanimlamak icin 8 tane selenium locator vardır
    //    1- id
    //    2- name
    //    3- className
    //    4- tagName
    //    5- linkText
    //    6- partialLinkTexr
    //    7- xpath -> xpath yazmanin birden fazla yolu vardir
    //    8- cssSelector -> css yazmanin birden fazla yolu vardir
    //-------------------------------------
    //        1) Absolute XPath
    //      Öğeyi bulmanın doğrudan yoludur, ancak Absolute XPath’ın dezavantajı,
    //      öğenin yolunda herhangi bir değişiklik yapılması durumunda XPath’ın başarısız olmasıdır.
    //      Bu aslında tavsiye edilmeyen bir yoldur. Web üzerinde F12 tuşu ile inspect mode açılır.
    //      Elements bölümüne tıklanır. Öğe bulunduktan sonra yine sağ click ile Copy – Copy XPath seçilir.
    //        Aşağıda Absolute XPath örneğini görebilirsiniz.
    //         Absolute xpath:
    //       html/body/div[1]/section/div[1]/div/div/div/div[1]/div/div/div/div/div[3]/div[1]/div/h4[1]/
    //         Relative xpath:
    //         Relative Xpath için path (öğe yolu), HTML DOM yapısının ortasından başlar.
    //         Çift eğik çizgi (//) ile başlar, yani öğeyi web sayfasının herhangi bir yerinde arayabilir.
    //         HTML DOM yapısının ortasından başlayabilirsiniz ve uzun xpath yazmanıza gerek yoktur.
    //         Aşağıdaki ekranda gösterilen aynı öğenin göreli bir XPath ifadesi örneği verilmiştir.
    //          Bu, Relative XPath aracılığıyla öğeyi bulmak için kullanılan yaygın biçimdir.
    //          Relative XPath’in faydası daha çok kullanılabilir olması ve daha az bakım/maliyet gerektirmesidir.
    //          Relative xpath: //*[@class=’featured-box’]//*[text()=’Testing’]
    //        Bazı temel XPath ifadeleri:
    //        Xpath=//input[@type=’text’]
    //        Xpath= //label[@id=’message23′]
    //        Xpath= //input[@value=’RESET’]
    //        Xpath=//*[@class=’barone’]
    //        Xpath=//a[@href=’http://demo.guru99.com/’]
    //        Xpath= //img[@src=’//cdn.guru99.com/images/home/java.png’]
    //        //tagName[@attributeName='value']
    //        Yukardaki password için yer alan kod bloğunun aşağıdaki gibi tag-name ve
    //        attribute üzerinden dört şekilde xpathini yazabiliriz.
    //        //input[@id='login-password-input']
    //        //input[@type='password']
    //        //input[@name='login-password']
    //        //input[@data-testid='password-input']
    //        //: Geçerli düğümü seçin.
    //        Tagname: Belirli düğümün etiket adı.
    //        @: Öznitelik seçin.
    //        Öznitelik: Düğümün öznitelik adı.
    //        Değer: Özelliğin değeri.
    //        Xpath = // tagname [@ attribute = 'değer']
    //        Relative XPath: xml dokümanındaki elementi verir ve // ile başlar
    //         Örn://*[@class='featured-box']//*[text()='Testing']
    //         Selenium Kodu
    //         driver.findElement(By.xpath("//input[@id='Lid']"));
    //         input : tag adı
    //         @ :attribute u seç
    //         id : attribute
    //         Lid : attribute değeri
    //         Html Kodu
    //         <input id = "Lid" ..... >
    //         Selenium Kodu
    //         driver.findElement(By.xpath("//*[@id='Lid']"));
    //        Html Kodu
    //        <td align = "right">Login</td>
    //         Selenium Kodu
    //        driver.findElement(By.xpath("//td[text()='Login']"));
    //---------------------------------------
    //        Xpath ve css selector arasındaki fark
    //        css yalnızca ileri yönde çalışırken, xpath ile öğeleri geriye veya ileriye doğru arayabiliriz…
    //        Xpath metinle çalışabilir, css çalışamaz
    //        Xpath daha fazla kombinasyona sahiptir ve indexe göre arama yapabilir,
    //        css indexe göre arama yapamaz, ancak css xpath'ten daha hızlı çalışıyor


    /*
1. assertEquals
assertEquals , beklenen sonucu gerçek sonuç ile karşılaştırmak için kullanılır.
Beklenen sonuç ile gerçek sonuç eşit değil ise gerçekleştirilen test senaryosu
sonucunda assertionError hatası fırlatır.
2. assertTrue
assertTrue, beklenen bir sonucun true olduğunun kabul edilmesi gerektiği zaman kullanılır.
Parametre olarak iki değer alır. İlk parametre de bir mesaj gönderilir ikinci parametrede
ise gönderilen mesajın doğruluğu için koşul belirlenir.
3. assertFalse
assertFalse, beklenen bir sonucun false olması durumunda kullanılır. İki parametre alır.
Parametrelerden biri mesajdır diğeri ise koşuldur. assertFalse ile koşul yerine getirilmez
ise assertionError hatası fırlatır.
4.assertNull
assertNull, beklenen bir sonucun null olup olmadığı kontrol edilmesi için kullanılır.
Bir nesneyi parametre olarak alır ve nesne null değil ise assertionError hatası fırlatır.
5.assertNotNull
assertNotNull, beklenen bir sonucun null olmadığını doğrulamak için kullanılır.
Bir nesneyi parametre olarak alır ve nesne null ise assertionError hatası fırlatır.
6.assertSame
assertSame, parametre olarak verilen iki nesnenin aynı nesneye karşılık gelip gelmediğini kontrol eder.
Eğer nesneler aynı nesneyi karşılamıyor ise assertionError hatası fırlatır.
7.assertNotSame
assertNotSame, parametre olarak verilen iki nesnenin birbirine eşit olmadığı kontrolünü eder.
Eğer aynı nesneye karşılık geliyor ise assertionError hatası fırlatır.
8.assertArrayEquals
assertArrayEquals, parametre olarak verilen iki dizinin eşit olup olmadığını kontrol eder.
Her iki dizi içinde null değeri var ise bunlar eşit olarak kabul edilir. Eğer eşit değil ise assertionError hatası fırlatır.
*/
}
