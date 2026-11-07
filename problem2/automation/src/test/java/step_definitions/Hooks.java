package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.time.Duration;

public class Hooks {

    public static WebDriver driver;

    
@Before
    public void openBrowser() {
        ChromeOptions options = new ChromeOptions();

        
// mvn test -Dheadless=true  -> Chrome runs with no window
        if ("true".equalsIgnoreCase(System.getProperty("headless"))) {
            options.addArguments("--headless=new");
        }

        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

        
// If an element is not on the page yet, Selenium waits up to 10 seconds.
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    
@After
    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }
}