//import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenGoogle {

    //Open Google
    //Go to Google homepage

    public static void main(String[] args) {

        //System.setProperty("webdriver.chrome.driver","G:\\Selenium_Tutorial_YT\\driver\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.quit();

    }
}
