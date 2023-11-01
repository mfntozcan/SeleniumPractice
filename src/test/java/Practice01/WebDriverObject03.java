package Practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverObject03 {
    public static void main(String[] args) {

       WebDriver driver = new ChromeDriver();//Selenim 4.6 sonrasi direkt WebDriver objesi olusturulabilir.
        driver.get("https://google.com");
        driver.quit();
        System.out.println();

    }
}
