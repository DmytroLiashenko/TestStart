import ConfigurationWebDriver.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestHomeWork extends BaseClass {
    public static void main(String[] args) throws InterruptedException {
        driver.get("https://ithillel.ua/");
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());


        WebElement consultButton = driver.findElement(By.id("btn-consultation-hero"));
        System.out.println(consultButton.getText());
        consultButton.click();
        driver.findElement(By.id("input-name-consultation")).sendKeys("Dmytro");
        driver.findElement(By.id("input-email-consultation")).sendKeys("test@gmail.com");
        driver.findElement(By.id("input-tel-consultation")).sendKeys("509544567");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[2]/button[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"field-messenger-consultation\"]/div/div/div/div[1]/div/div[2]/input")).sendKeys("https://t.me/hyevuy_dnepr");
        driver.findElement(By.id("listbox-btn-input-course-consultation")).click();
        driver.findElement(By.xpath("//*[@id=\"container-input-course-consultation\"]/div/ul/li[19]")).click();


        driver.findElement(By.xpath("//*[@id=\"form-consultation\"]/div[1]/footer/div[1]/label/p/a")).click();
        Thread.sleep(2000);


        Thread.sleep(10000);
        driver.quit();

    }
}
