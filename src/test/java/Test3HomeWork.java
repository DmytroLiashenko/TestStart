import ConfigurationWebDriver.BaseClass;
import HillelURLs.HillelUrls;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.MainPageObject;
import util.Util;

import java.util.List;

public class Test3HomeWork extends BaseClass {
    public static MainPageObject mainPage;


    @BeforeClass
    public static void beforetest(){
        driver.get(HillelUrls.FRONTEND_URL);
        mainPage=new MainPageObject(driver);
    }
    @Test
    public void test(){
        System.out.println(mainPage.getTitle().getText());
    }
    @Test
    public void test1(){
        System.out.println(mainPage.getCourseRate().getText());
    }
    @Test
    public void test2(){
        System.out.println(mainPage.getCourseDescription().getText());
    }
    @Test
    public void test3 (){
        Util.scrollToElementVisibilityOf(driver,By.id("coachesSection"));
        mainPage.getCoach_button().click();
        Util.scrollToElementVisibilityOf(driver, By.xpath("//*[@class=\"coaches_collapse\"]"));
        List<WebElement> allCoach = driver.findElements(By.className("coach-card_name"));
        for (WebElement element : allCoach) {
            System.out.println(element.getText());
        }
    }
}
