import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public abstract class BasePageTest {
    protected WebDriver webDriver;

    protected final String URL = "https://qa-scooter.praktikum-services.ru/";

    @Before
    public void setUp() {
//        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        System.setProperty("webdriver.firefox.driver", "geckodriver.exe");

//        webDriver = new ChromeDriver();
        webDriver = new FirefoxDriver();
        webDriver.get(URL);
    }


    @After
    public void teardown() {
        webDriver.quit();
    }
}
