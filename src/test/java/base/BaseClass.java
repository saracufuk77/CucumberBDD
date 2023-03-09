package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import utils.CommonMethods;
import utils.ConfigsReader;
import utils.Constants;

import java.time.Duration;

//THIS CLASS IS USED TO LAUNCH AND QUIT THE BROWSER
public class BaseClass extends CommonMethods {
    public static WebDriver driver;

    public static void setUp(){
        //1.way : hard coding (not recommended)
        //System.setProperty("Webdriver.chrome.driver",Constants.CHROME_DRIVER_PATH);
        //WebDriver driver = new ChromeDriver();
        //driver.get(url);

        //2.way : Soft Coding (Recommended)
        // I need filePath

        System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY,"true"); //if you dont want to see some red error messages in the output, put it true.
        System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY,"true");
        ConfigsReader.loadProperties(Constants.CONFIGURATION_FILEPATH); // Replaced hard-coded filePath with Constants
        String headless = ConfigsReader.getProperties("headless");

        switch (ConfigsReader.getProperties("browser").toLowerCase()) {
            case "chrome" -> {
//                System.setProperty("webdriver.chrome.driver", Constants.CHROME_DRIVER_PATH);
                WebDriverManager.chromedriver().setup();    ////This line will replaces local driver, above line
                if (headless.equalsIgnoreCase("true")) {
                    ChromeOptions options = new ChromeOptions();
                    options.addArguments("--headless");    //run in headless mode
//                    options.addArguments("--disable-logging");
                    driver = new ChromeDriver(options);
                } else {
                    driver = new ChromeDriver();
                }
            }
            case "firefox" -> {
//                System.setProperty("webdriver.gecko.driver", Constants.GECKO_DRIVER_PATH);
                WebDriverManager.firefoxdriver().setup();    //this line replaces local gecko driver above line.
                if(headless.equalsIgnoreCase("true")){
                    FirefoxOptions options = new FirefoxOptions();
                    options.addArguments("--headless");
                    driver =new FirefoxDriver(options);
                }else {
                    driver = new FirefoxDriver();
                }
            }
            default -> throw new RuntimeException("Browser is not supported");
        }

        driver.get(ConfigsReader.getProperties("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.IMPLICIT_WAIT_TIME));

        initialize();

    }
    public static void tearDown()  {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (driver != null) {     // This lline is optional. We only use it to prevent NullPointerException.
            driver.quit();
        }
    }

}
