import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class FirstTestNGClass {
    WebDriver driver;

    @BeforeTest
        public void prepare() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvp\\Desktop\\chromedriver_win32\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }


    @AfterTest
        public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    @Test
    public void openWebsite(){
        System.out.println("Open the browser!");
        driver.navigate().to("https://www.google.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(driver->driver.getTitle().equals("Google"));
    }

    @Test
    public void signUp(){
        System.out.println("Signing up...");
    }

    @Test
    public void login(){
        System.out.println("Login...");
    }

    @Test
    public void addToCart(){
        System.out.println("Add to cart...");
    }

    @Test
    public void logOut(){
        System.out.println("Logging out...");
    }

    @Test
    public void closeTheBrowser(){
        System.out.println("Closing the browser...");
    }

}
