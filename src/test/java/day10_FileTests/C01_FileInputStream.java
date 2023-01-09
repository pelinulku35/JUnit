package day10_FileTests;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_FileInputStream {

   @Test
   public void test01() throws FileNotFoundException {

       String dosyaYolu ="C:\\Users\\pelın\\Desktop\\MerhabaJava.rtf";
       FileInputStream fis=new FileInputStream(dosyaYolu);

       //File testlerinde genellikle downloads'a indirilecek bir dosyanin indirildigini test
       //etmek veya masaüstündeki bir dosyanın web'e yüklenebildigini test etmek isteriz ancak herkesin
       //bilgisayarinin ismi , kullanici isimleri gibi farkliliklar olacagindan testler tek bir bilgisayarda
       //calisacak gibi yazilmak zorunda kalinir
       //Bu karişikligin önüne gecebilmek için java 2 basit kod blogu sunmuş


       System.out.println(System.getProperty("user.dir"));
       // o anda calisan dosyanin (C01_FileInputStreeam) yolunu verir
       // /Users/pelin/IdeaProjects/com.Team105JUnit


       System.out.println(System.getProperty("user.home"));
       // kullanicinin temel path'ini verir.
       // /Users/pelin

       // Masaustune gitmek istersek
       // /Users/pelin + /Desktop eklememiz yeterlidir

       // Downloads'a gitmek istersek
       // /Users/pelin + /Downloads eklememiz yeterlidir

       // Kodlarimizin dinamik olmasi yani kisinin bilgisayarindaki
       // kullanici adi gibi detaylara takilmamasi icin
       // File testlerinde kullanilacak dosya yolunu
       // user.home... temel path'ini calistigi bilgisayardan alacak sekilde
       // olustururuz



       // dosyaYolu="C:\\Users\\pelin\\Desktop\\MerhabaJava.rtf";
         String dinamikDosyaYolu= System.getProperty("user.home") + "\\Desktop\\MerhabaJava.rtf";



   }


}
