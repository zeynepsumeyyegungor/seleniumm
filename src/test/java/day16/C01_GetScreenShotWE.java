package day16;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

import java.io.File;
import java.io.IOException;
import java.security.Key;

public class C01_GetScreenShotWE extends TestBaseBeforeAfter {
    @Test
    public void test1() throws IOException {
        //Amazon sayfasina gidin.
        driver.get("https://amazon.com");
        //Nutella aratalim
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Nutella", Keys.ENTER);
        //Arama sonucunun resmini alalim
        WebElement aramaSonucu = driver.findElement(By.xpath("//*[@class='a-section a-spacing-small a-spacing-top-small']"));
                File nutellaAramaSonucu = aramaSonucu.getScreenshotAs(OutputType.FILE);
        //Sadece Web elementin resmini alacaksak TakeScreenShot classini kullanmama gerek yok
        //Locate ettigimiz WebElementi direk gecici bir file'a atip FileUtils ile kopyalayip yolunu (path) belirtiniz
        FileUtils.copyFile(nutellaAramaSonucu,new File("target/ekranGoruntusuWE/WebSS.jpeg"));

    }
}
