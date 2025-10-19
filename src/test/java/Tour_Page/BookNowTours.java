package Tour_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class BookNowTours {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){
        driver =  new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }
    @Test
    public void VerifyBookNowButtonStunningDubaiTour() throws InterruptedException {

        driver.get("https://phptravels.net/tour/26/tours/22-10-2025/1/0");

        //Click Book Now Button

        WebElement bookNowStunningDubaiTour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        bookNowStunningDubaiTour.click();
    }

    @Test
    public void VerifyBookNowButtonSpectacularsofDubaiTour() throws InterruptedException {

        driver.get("https://phptravels.net/tour/36/tours/22-10-2025/1/0");

        //Click Book Now Button

        WebElement bookNowSpectacularsofDubaiTour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        bookNowSpectacularsofDubaiTour.click();

    }

    @Test
    public void VerifyBookNowButtonDubaitheDesertTour() throws InterruptedException {

        driver.get("https://phptravels.net/tour/24/tours/22-10-2025/1/0");

        //Click Book Now Button

        WebElement bookNowDesertTour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        bookNowDesertTour.click();

    }




}
