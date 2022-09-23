package day12;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.TestBaseBeforeAfter;

public class C02_FileExistsUpload extends TestBaseBeforeAfter {
    @Test
    public void test1(){
        driver.get("https://the-internet.herokuapp.com/upload");
        WebElement dosyaSec = driver.findElement(By.id("file-upload"));
        String dosyaYolu = "C:\\Users\\zeynepsümeyye\\OneDrive\\Masaüstü\\test.txt";
        dosyaSec.sendKeys(dosyaYolu);
        driver.findElement(By.xpath("//*[@id='file-submit']")).click();
        WebElement resultWE = driver.findElement(By.xpath("//h3[text()='File Uploaded!']"));
        String expectedText = "File Uploaded!";
        String actualText = resultWE.getText();
        Assert.assertEquals(expectedText, actualText);
    }
}
