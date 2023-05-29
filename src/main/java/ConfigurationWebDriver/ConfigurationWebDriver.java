package ConfigurationWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ConfigurationWebDriver {
    static WebDriver driver = null;

    static public WebDriver createDriver(WebDrivers webDrivers) {

        switch (webDrivers) {
            case CHROME:
                createChrome();
//            case CHROME_INCOGNITO:
//                createChromeIncognito();
        }
        return driver;
    }

    private static void createChrome() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--start-maximize");
        driver = new ChromeDriver(options);

    }
//    private static void createChromeIncognito() {
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--remote-allow-origins=*");
//        options.addArguments("--start-maximize");
//        options.addArguments("--incognito");
//        driver = new ChromeDriver(options);
//    }




}
