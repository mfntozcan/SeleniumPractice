package Practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.DriverManager;

public class P01_Navigate {
    public static void main(String[] args) throws InterruptedException {


// Set Driver Path
        System.setProperty("webdriver.chrome.driver",".idea/drivers/chromedriver.exe");

// Create chrome driver object
        WebDriver driver = new ChromeDriver();

// Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(2000);

// Open google home page https://www.google.com/
        driver.get("https://www.google.com/");
        Thread.sleep(2000);


// Navigate to techproeducation lms home page https://lms.techproeducation.com/login/index.php
        driver.navigate().to("https://lms.techproeducation.com/login/index.php");
        Thread.sleep(2000);


// Navigate back to google
        driver.navigate().back();
        Thread.sleep(2000);


// Navigate forward to techproeducation
        driver.navigate().forward();
        Thread.sleep(2000);


// Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);


// Close/Quit the browser
        driver.quit();
        Thread.sleep(2000);//Hard wait tir. Baska adiyla Java wait tir.


// And last step : print "ALL OK" on console
        System.out.println("ALL OK");
        System.out.println();




    }
}
