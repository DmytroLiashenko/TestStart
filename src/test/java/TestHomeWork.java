import ConfigurationWebDriver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class TestHomeWork extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        String name = "Dmytro";
        String email = "test@gmail.com";
        String number = "509544567";
        driver.get("https://ithillel.ua/");
        String win =driver.getWindowHandle();
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        WebElement consultButton = driver.findElement(By.id("btn-consultation-hero"));
        System.out.println(consultButton.getText());
        consultButton.click();
        driver.findElement(By.id("input-name-consultation")).sendKeys(name);
        driver.findElement(By.id("input-email-consultation")).sendKeys(email);
        driver.findElement(By.id("input-tel-consultation")).sendKeys(number);

  //      Thread.sleep(2000);

        WebElement dynamicElement =(new WebDriverWait(driver,Duration.ofSeconds(10)))
                .until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@data-name=\"tg\"]")));
        //Working with Telegram
        driver.findElement(By.xpath("//button[@data-name=\"tg\"]")).click();
        driver.findElement(By.xpath("//input[@name=\"tg\"]")).sendKeys("https://t.me/hyevuy_dnepr");

// Working on the dropdown
        driver.findElement(By.id("listbox-btn-input-course-consultation")).click();
        driver.findElement(By.xpath("//*[@data-entry-id=\"129290\"]")).click();

//Working on the Personal-agreement
        driver.findElement(By.linkText("обробку персональних даних")).click();
        driver.switchTo().window(win);

//Working on the checkbox
        driver.findElement(By.xpath("//*[@class=\"checkbox_checkmark\"]")).click();



       Thread.sleep(10000);
        driver.quit();

    }
}
