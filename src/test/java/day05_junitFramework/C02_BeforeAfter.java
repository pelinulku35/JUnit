package day05_junitFramework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class C02_BeforeAfter  {
   // 3 farkli test methodu olusturun
   //her bir method'un basinda driver'i olusturup
   //amazon.com
   // wısequarter.com
    //youtube.com'a gidip
    //title'lari yazdirin ve method'dan sonra driver'i kapatın.


    public void setup(){

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));





    }






}












