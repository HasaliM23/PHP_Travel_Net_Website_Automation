package Home_Page.Popular_Tours_Section;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class HongKong_Tour_BookNow {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod

    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
    }

    @Test
    public void HongKong_Tour_Book() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement clickDelihiCard = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='fadein']/main/div[3]/div/div[2]/div[1]/div/div/a[4]/div")));

        //scroll

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);" , clickDelihiCard);

        Thread.sleep(2000);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", clickDelihiCard);


        WebElement datepick = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@class='dp_tour form-control date_change']")));
        datepick.click();
        datepick.clear();
        datepick.sendKeys("02-10-2025");
        datepick.sendKeys(Keys.TAB);

        WebElement adults = wait.until(ExpectedConditions.elementToBeClickable(By.id("adults")));
        Select adultSelect = new Select(adults);
        adultSelect.selectByVisibleText("3");

        // Wait until calendar is closed before clicking
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.className("datepicker")));

        WebElement bookNow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookNow);


    }
}
