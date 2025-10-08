package Tour_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class TourStarRatingTest {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod

    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/tours/9404/dubai/09-10-2025/2/0/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void filterTourByStarRating() throws InterruptedException {

        //click 5star
        WebElement fiveStarFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='starRating5']")));
        fiveStarFilter.click();

        Thread.sleep(2000);

        //click 4star
        WebElement fourStarFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='starRating4']")));
        fourStarFilter.click();

        Thread.sleep(4000);

        //click 3star
        WebElement threeStarFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='starRating3']")));
        threeStarFilter.click();

        Thread.sleep(4000);

        //click 2star
        WebElement twoStarFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='starRating2']")));
        twoStarFilter.click();

        Thread.sleep(4000);

        //click 1star
        WebElement oneStarFilter = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='starRating1']")));
        oneStarFilter.click();

        Thread.sleep(4000);



    }


    }
