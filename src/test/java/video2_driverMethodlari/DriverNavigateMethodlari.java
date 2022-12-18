package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverNavigateMethodlari {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 1- driver.navigate().to("url") --> istenen URL ye gider
        // driver.get("url") --> ile aynı işlemi yapar ama forward ve back yapılmasına imkan tanır

        driver.get("https://www.amazon.com");
        driver.navigate().to("https://www.facebook.com");

        // 2- driver.navigate().back() --> bir onceki sayfaya donus yapar
        driver.navigate().back(); //amazona geri donus yapacaktır

        // 3- driver.navigate().forward() --> back() ile geldiği sayfaya yeniden gider
        driver.navigate().forward();// facebook a donus yapacaktır

        // 4 - driver.navigate().refresh() --> içinde oldugu sayfayı yeniler
        driver.navigate().refresh();

        // driver olusturuldugunda açılan sayfayı kapatmak istersek
        driver.close();

        // driver calısırken birden fazla tab window açtıysa tumunu kapatmak için
        //driver.quit();



    }
}
