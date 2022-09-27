package day11;

import org.junit.Assert;
import org.junit.Test;
import utilities.TestBaseBeforeAfter;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C04_FileExists {
    @Test
    public void test1() {

        System.out.println(System.getProperty("user.dir"));//C:\Users\zeyneps�meyye\IdeaProjects\com.BatchJUnit
        //Şuanki içinde bulunduğum yolu gösterir
        System.out.println(System.getProperty("user.home"));//C:\Users\zeyneps�meyye
        //Geçerli kullanıcının ana dizinini verir

        String farkliBolum = System.getProperty("user.home");
       // "C:\Users\zeynepsümeyye\OneDrive\Masaüstü\test.txt" --> masa üstündeki dosyanın yolu
        String ortakBolum = "\\OneDrive\\Masaüstü\\test.txt";

        String masaUstuDosyaYolu = farkliBolum+ortakBolum; // --> Masaüstündeki dosya yolunu gösterir

        //System.out.println(masaUstuDosyaYolu); //C:\Users\zeyneps�meyye
        //System.out.println(Files.exists(Paths.get(dosyaYolu)));
        //Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


      String dosyaYolu = "C:\\Users\\zeynepsümeyye\\OneDrive\\Masaüstü\\test.txt";
      System.out.println(Files.exists(Paths.get(dosyaYolu)));
      Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));


        /*
        Bir web sitesinden indirdiğimiz yada windows içinde oluşturduğumuz dosyanın indiğini yada orda olduğunu
        test edebilmem için o dosyanın üzerine shift tuşuna basılı olarak sağ klik yapıp dosyanın yolunu kopyalayıp
        bir string değişkene atarız ve dosyayı doğrulamak için
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu))); bu methodu kullanırız
         */
    }
}
