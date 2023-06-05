import ConfigurationWebDriver.BaseClass;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import util.Util;
import java.util.List;

public class Test2HomeWork extends BaseClass {
    static String mainUrl = "https://kyiv.ithillel.ua/";
    By courseMenu = By.xpath("//*[@data-dropdown-trigger=\"coursesMenu\"]");
    By category = By.xpath("//*[@data-category=\"programming\"]");
    By button = By.xpath("//*[@data-value=\"front-end\"]");
    By coach = By.id("coachesShowAllButton");

    @BeforeClass
    public static void bFirstTest() {
        driver.get(mainUrl);
    }

    @Test
    public void test() {
        driver.findElement(courseMenu).click();
        driver.findElement(category).click();
        driver.findElement(button).click();
        driver.get("https://kyiv.ithillel.ua/courses/front-end-basic");
    }

    @Test
    public void test2(){
        Util.scrollToElementVisibilityOf(driver, By.id("coachesSection"));
        driver.findElement(coach).click();
        Util.scrollToElementVisibilityOf(driver, By.xpath("//*[@class=\"coaches_collapse\"]"));
        List<WebElement> allCoach = driver.findElements(By.className("coach-card_name"));
        for (WebElement element : allCoach) {
            System.out.println(element.getText());
        }
    }
}
