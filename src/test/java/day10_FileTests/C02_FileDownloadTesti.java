package day10_FileTests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.ReusableMethods;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class C02_FileDownloadTesti extends TestBase {

    @Test
    public void test01(){

        //2. https://the-internet.herokuapp.com/download adresine gidelim.
         driver.get("https://the-internet.herokuapp.com/download");

        //3. cat.jpg dosyasını indirelim
        driver.findElement(By.xpath("//a[text()='cat.jpg']"));

        ReusableMethods.bekle(5);

        //4. Dosyanın başarıyla indirilip indirilmediğini test edelim
        String dosyaYolu=System.getProperty("user.home") + "\\Downloads\\cat.jpg";

         //Bir dosyanın bilgisayarinizda var oldugunu (exist) test etmek icin
        //Java'daki Files class'ından yardım alacagız

        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));

    }

    @Test
    public void test02(){

        //Masaüstünde MerhabaJava.rtf dosyası oldugunu test edin.


        //Dinamik dosya yolu olusturalım
        String dosyaYolu=System.getProperty("user.home")+"\\Desktop\\MerhabaJava.rtf";

        //Aseert edelim
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));



    }

}
