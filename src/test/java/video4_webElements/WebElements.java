package video4_webElements;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebElements {

    // 1-) https://www.amazon.com sayfasına gidin
    // 2-) arama cubuguna "Nutella" yazdırın
    // 3-) Nutella yazdıktan sonra ENTER a basarak arama işlemini yapın
    // 4-) Bunulunan sonuc sayısını yazdırın

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));


        // 1-) https://www.amazon.com sayfasına gidin
        driver.get("https://www.amazon.com");

        // 2-) arama cubuguna "Nutella" yazdırın
        WebElement aramaKutusu= driver.findElement(By.id("twotabsearchtextbox"));
        aramaKutusu.sendKeys("Nutella");

        // 3-) Nutella yazdıktan sonra ENTER a basarak arama işlemini yapın
        aramaKutusu.submit();

        // 4-) Bunulunan sonuc sayısını yazdırın
        WebElement sonucYaziElementi= driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        System.out.println(sonucYaziElementi.getText());

        driver.close();

    }



}
