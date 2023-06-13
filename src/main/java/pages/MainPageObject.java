package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPageObject {
    private WebDriver driver;

    private By title = By.xpath("//*[@class=\"course-descriptor_header\"]");
    private By courseRate = By.xpath("//*[@class=\"course-rating\"]");
    private By CourseDescription = By.xpath("//*[@class=\"introduction-info_content introduction-info-redactor\"]");
    private By Coach_button = By.id("coachesShowAllButton");
    private By CoachesSection = By.id("coachesSection");
    private By CardName = By.className("coach-card_name");



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

    public WebElement getCoach_button(){
        return driver.findElement(Coach_button);
    }
    public WebElement getCoachesSection(){
        return driver.findElement(CoachesSection);
    }
    public WebElement getCardName(){
        return driver.findElement(CardName);

    }
}
