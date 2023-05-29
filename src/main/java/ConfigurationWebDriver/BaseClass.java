package ConfigurationWebDriver;

import org.openqa.selenium.WebDriver;

public class BaseClass {
   static public WebDriver driver= ConfigurationWebDriver.createDriver(WebDrivers.CHROME);
}
