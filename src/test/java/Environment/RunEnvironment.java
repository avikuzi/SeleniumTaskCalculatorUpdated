
//to keep the WebDriver instance and control access to it.

package Environment;

import org.openqa.selenium.WebDriver;

public class RunEnvironment {

    private static WebDriver webDriver;

    public static WebDriver getWebDriver() {
        return webDriver;
    }

    public static void setWebDriver(WebDriver webDriver) {
        RunEnvironment.webDriver = webDriver;
    }
}