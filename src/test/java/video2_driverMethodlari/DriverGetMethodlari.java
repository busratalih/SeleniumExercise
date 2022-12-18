package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverGetMethodlari {

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        // 1- driver.get("url") --> yazdığımız URL ye gider
        driver.get("https://www.amazon.com");

        // 2- driver.getTitle() --> içinde oldugu sayfanın baslıgını dondürür
        System.out.println("driver.getTitle() = " + driver.getTitle()); //Amazon.com. Spend less. Smile more.

        // 3- driver.getCurrentUrl() --> içinde oldugu sayfanın URL sini döndürür
        System.out.println(driver.getCurrentUrl());//https://www.amazon.com/

        // 4- driver.getPageSource() --> içinde olsugu sayfanın kaynak kodlarını döndürür
        System.out.println("=====================");
        System.out.println(driver.getPageSource());
        System.out.println("=====================");

        // 5- driver.getWindowHandle() --> içinde oldugu sayfanın UNIQUE hash kodunu döndurur
        System.out.println(driver.getWindowHandle());// CDWindow-......

        // 6 - driver.getWindowHandles() -->driver calışırken acılan tum sayfaların UNIQUE hash kodunu döndürür



    }
}
