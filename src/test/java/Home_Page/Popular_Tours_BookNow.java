package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Popular_Tours_BookNow {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
    }

    @Test
    public void tourBookNow() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement clickCard = wait.until(
                ExpectedConditions.presenceOfElementLocated(
                        By.xpath("//*[@id='fadein']/main/div[3]/div/div[2]/div[1]/div/div/a[1]/div/div")
                )
        );

// Scroll to element
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", clickCard);

// Add a small wait for animations
        Thread.sleep(500);

        clickCard.click();

        WebElement datepick = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='dp_tour form-control date_change']")));
        datepick.click();
        datepick.clear();
        datepick.sendKeys("24-09-2025");

        WebElement adult = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='adults']")));
        Select adults = new Select(adult);
        adults.selectByVisibleText("2");

        WebElement child = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='childs']")));
        Select childs = new Select(child);
        childs.selectByVisibleText("1");

        WebElement bookNow = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='btn-lg btn btn-primary w-100 ladda effect ladda-button waves-effect']")));
        bookNow.click();






    }



}

