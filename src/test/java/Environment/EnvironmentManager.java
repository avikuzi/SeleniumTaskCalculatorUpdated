

//designed to initialize and shut down WebDriver
package Environment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EnvironmentManager extends RunEnvironment {

    public static void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ak2300\\Automation\\Calculator_SeleniumTask/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        RunEnvironment.setWebDriver(driver);
    }

    public static void shutDownDriver() {
        RunEnvironment.getWebDriver().quit();
    }
}


