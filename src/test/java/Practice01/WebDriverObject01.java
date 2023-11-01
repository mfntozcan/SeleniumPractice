package Practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverObject01 {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver",".idea/drivers/chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.close();
        System.out.println();











    }
}
