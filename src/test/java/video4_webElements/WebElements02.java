package video4_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements02 {


    // https://www.facebook.com adresine gidin
    // cookies çıkarsa kabul et butonuna basın
    // e-posta kutusuna rasgele bir mail girin
    // sifre kısmına rasgele bir sifre girin
    // giriş yap butonuna basın
    // uyarı olarak "The email or mobile number you entered isn't connected to am account. Find your account and log in"
    // mesajının cıktıgını test edin
    // sayfayı kapatın

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // https://www.facebook.com adresine gidin
        driver.get("https://www.facebook.com");

        // cookies çıkarsa kabul et butonuna basın
        //driver.findElement(By.xpath("//button[@title='Allow essential and optional cookies']")).click();

        // e-posta kutusuna rasgele bir mail girin
        WebElement epostaKutusu=driver.findElement(By.xpath("//input[@id='email']"));
        epostaKutusu.sendKeys("abcd@gmail.com");

        // sifre kısmına rasgele bir sifre girin
        WebElement passKutusu=driver.findElement(By.xpath("//input[@id='pass']"));
        passKutusu.sendKeys("duıeflslfls");

        // giriş yap butonuna basın
        driver.findElement(By.xpath("//button[@name='login']")).click();

        // uyarı olarak "The email or mobile number you entered isn't connected to am account. Find your account and log in"
        // mesajının cıktıgını test edin
        WebElement sonucYaziElementi=driver.findElement(By.xpath("//div[@class='_9ay5']"));
        String expectedSonucYazisi="The email or mobile number you entered isn't connected to am account. Find your account and log in";
        String actualSonucYazisi=sonucYaziElementi.getText();
        if (expectedSonucYazisi.equals(actualSonucYazisi)){
            System.out.println("girilemedi testi passed");
        }else {
            System.out.println("girilemedi testi failed");
        }


        // sayfayı kapatın
        driver.close();







    }

}
