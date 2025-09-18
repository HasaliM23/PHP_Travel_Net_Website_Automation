package Home_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;

public class Search_Destination {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
    }

    @Test
    public void searchDestinationTest() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // click class
        WebElement flightClass =wait.until(ExpectedConditions.elementToBeClickable(By.id("flight_type")));
        flightClass.click();
        flightClass.sendKeys(Keys.ARROW_DOWN);
        flightClass.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        flightClass.sendKeys(Keys.ENTER);

        //Flying From

        WebElement flyingFrom =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control ct ff']")));
        flyingFrom.click();
        flyingFrom.sendKeys("Bandaranaike International");
        flyingFrom.sendKeys(Keys.ARROW_DOWN);
        flyingFrom.sendKeys(Keys.ENTER);

        WebElement destinationTo =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='form-control ct px-md-3 ft']")));
        destinationTo.click();
        destinationTo.sendKeys("Canberra International");
        destinationTo.sendKeys(Keys.ARROW_DOWN);
        Thread.sleep(1000);
        destinationTo.sendKeys(Keys.ENTER);

        WebElement departTo =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='depart form-control']")));
        departTo.click();
        departTo.clear();
        Thread.sleep(2000);
        departTo.sendKeys("22-09-2025");

        WebElement travels =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='onereturn']/div[4]/div/div/div/a")));
        travels.click();
        travels.sendKeys(Keys.ARROW_DOWN);
        travels.sendKeys(Keys.ENTER);

        WebElement submit =wait.until(ExpectedConditions.elementToBeClickable(By.id("flights-search")));
        submit.click();

        Thread.sleep(2000);




    }
}
