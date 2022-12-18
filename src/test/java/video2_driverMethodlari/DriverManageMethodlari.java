package video2_driverMethodlari;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DriverManageMethodlari {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        // 1 - driver.manage().window() Methodları ;

        // a-) driver.manage().window().getSize(); --> içinde oldugu sayfanın pixel olarak ölçülerini döndürür
        System.out.println(driver.manage().window().getSize()); // (ör : 1050, 832)
        System.out.println(driver.manage().window().getSize().height);

        // b-) driver.manage().window().getPosition() --> içinde oldugu sayfanın pixel olarak konumunu döndurur
        System.out.println(driver.manage().window().getPosition()); // (ör : 10,10)

        // c-) driver.manage().window().setPosition(new Point(15,15)); --> içinde oldugu sayfanın sol alt kosesini
        // bizim yazacagımız pixel noktasına tasır
        driver.manage().window().setPosition(new Point(15,15));

        // d-) driver.manage().window().setSize(new Dimension(900,600));
        //içinde oldugu sayfanın sol alt kosesi sabit olarak bizim yazacagımız olculere getirir
        driver.manage().window().setSize(new Dimension(900,600));


        // konumu ve boyutu yeniledikten sonra tekrar yazdırırsak
        System.out.println("yeni pencere olculeri= " + driver.manage().window().getSize()); // (900,600)
        System.out.println("yeni pencere konumu= " + driver.manage().window().getPosition()); // (15,15)

        // e-) driver.manage().window().maximize(); --> içinde oldugu sayfayı maximize  yapar
        // f-) driver.manage().window().fullscreen(); --> içinde oldugu sayfayı fulscreen yapar

        // farklarını gormek için methodları kullanıp, baslangıc noktalarını ve boyutlarını yazdıralım

        driver.manage().window().maximize();
        System.out.println("maximize konum = " + driver.manage().window().getPosition());
        System.out.println("maximize boyut = " + driver.manage().window().getSize());

        driver.manage().window().fullscreen();
        System.out.println("fullscreen konum = " + driver.manage().window().getPosition());
        System.out.println("fullscreen boyut " + driver.manage().window().getSize());

        // g-) driver.manage().window().minimize(); --> sayfayı simge durumda kucultur
        driver.manage().window().minimize();



        // 2 - driver.manage().timeouts() Methodları;

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));



    }
}
