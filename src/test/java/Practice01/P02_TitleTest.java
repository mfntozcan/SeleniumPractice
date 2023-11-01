package Practice01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P02_TitleTest {
    public static void main(String[] args) throws InterruptedException {


//Set Driver Path
        System.setProperty("webdriver.chrome.driver",".idea/drivers/chromedriver.exe");

//Create chrome driver object
        WebDriver driver = new ChromeDriver();

//Maximize the window
        driver.manage().window().maximize();
        Thread.sleep(2000);

//Open google home page https://www.google.com/
        driver.get("https://www.google.com/");

// Wait for 3 seconds
        Thread.sleep(3000);

//Go to the "https://lms.techproeducation.com/login/"
        driver.navigate().to("https://lms.techproeducation.com/login/index.php");
        Thread.sleep(2000);

//Get the title and URL of the page
        String lmsTitle = driver.getTitle();
        System.out.println("lmsTitle = " + lmsTitle );

        String lmsUrl = driver.getCurrentUrl();
        System.out.println("lmsUrl = " + lmsTitle );

//Check if the title contains the word "Techpro Education LMS" print console "Title contains Techpro Education LMS"
// or "Title does not contain Techpro Education LMS"

        if (lmsTitle.contains("Techpro Education LMS")){
            System.out.println("Title contains Techpro Education LMS" );
        }else {
            System.out.println("Title does not contain Techpro Education LMS");
        }

//Check if the URL contains the word "techpro" print console "URL contains techpro" or "URL does not contain techpro"
        if (lmsUrl.contains("techpro")){
            System.out.println("URL contains techpro" );
        }else {
            System.out.println("URL does not contain techpro");
        }

//Then go to "https://medunna.com/"
        driver.get("https://medunna.com/");

//Get the title and check if it contains the word "MEDUNNA" and print "Title contains MEDUNNA" or "Title does not contain MEDUNNA"
        String medunnaTitle = driver.getTitle();

        if (medunnaTitle.contains("MEDUNNA")){
            System.out.println("Title contains MEDUNNA");
        }else {
            System.out.println("Title does not contain MEDUNNA");
        }

//Navigate Back to the previous webpage
        driver.navigate().back();
        Thread.sleep(2000);

//Refresh the page
        driver.navigate().refresh();
        Thread.sleep(2000);

//Navigate to forward
        driver.navigate().forward();

//Wait for 3 seconds
        Thread.sleep(3000);

//Close the browser
        driver.quit();
    }
}
