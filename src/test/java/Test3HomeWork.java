import ConfigurationWebDriver.BaseClass;
import HillelURLs.HillelUrls;
import org.junit.BeforeClass;
import org.junit.Test;
import pages.MainPageObject;


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
    public void test3(){
        System.out.println(mainPage.getCoachNameList());
    }
}
