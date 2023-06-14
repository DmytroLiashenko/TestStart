package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import util.Util;

import java.util.ArrayList;
import java.util.List;

public class MainPageObject {
    private WebDriver driver;

    private By title = By.xpath("//*[@class=\"course-descriptor_header\"]");
    private By courseRate = By.xpath("//*[@class=\"course-rating\"]");
    private By CourseDescription = By.xpath("//*[@class=\"introduction-info_content introduction-info-redactor\"]");
    private By CoachesSection = By.id("coachesSection");

    By CardName = By.className("coach-card_name");
    By coachListItem = By.className("coach-list_item");
    By Coach_button = By.id("coachesShowAllButton");



    public MainPageObject(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getTitle() {
        return driver.findElement(title);
    }

    public WebElement getCourseRate() {
        return driver.findElement(courseRate);
    }

    public WebElement getCourseDescription() {
        return driver.findElement(CourseDescription);

    }
    public List<String>getCoachNameList(){
        Util.scrollToElementVisibilityOf(driver,Coach_button);
        driver.findElement(Coach_button).click();
        List<String>nameList = new ArrayList<>();
        for (WebElement element : driver.findElements(coachListItem)){
            nameList.add(element.findElement(CardName).getText());
        }
        return nameList;
    }
}
