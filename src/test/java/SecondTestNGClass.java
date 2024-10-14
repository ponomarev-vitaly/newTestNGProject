import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class SecondTestNGClass {
    WebDriver driver;

    @BeforeTest
        public void prepare() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\vvp\\Desktop\\SeleniumJarFiles\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

    @AfterTest
        public void tearDown(){
        if(driver != null){
            driver.quit();
        }
    }

    @Test (priority = 0)
    public void openWebsite(){
        System.out.println("Open the browser!");
        driver.navigate().to("https://www.twitter.com");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        wait.until(driver->driver.getTitle().equals("X. It’s what’s happening / X"));
    }

    @Test (priority = 1)
    public void signUp(){
        System.out.println("Signing up...");
    }

    @Test (priority = 2)
    public void login(){
        System.out.println("Login...");
    }

    @Test (priority = 3)
    public void addToCart(){
        System.out.println("Add to cart...");
    }

    @Test (priority = 4)
    public void logOut(){
        System.out.println("Logging out...");
    }
}
