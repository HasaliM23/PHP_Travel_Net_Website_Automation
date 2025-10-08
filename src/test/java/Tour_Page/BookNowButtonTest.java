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

public class BookNowButtonTest {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod

    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/tour/26/tours/09-10-2025/2/0");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void verifyDubaiStuningBookNowButton() throws InterruptedException {

        driver.get("https://phptravels.net/tour/26/tours/09-10-2025/2/0");


        WebElement bookNow1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        bookNow1.click();
    }

    @Test
    public void verifySpectacularsofDubaiButton() throws InterruptedException {

        driver.get("https://phptravels.net/tour/36/tours/09-10-2025/2/0");

        WebElement bookNow2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        bookNow2.click();

    }

    @Test
    public void verifyDubaitheDesertDubaiComboPacButton() throws InterruptedException {

        driver.get("https://phptravels.net/tour/24/tours/09-10-2025/2/0");

        WebElement bookNow3 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        bookNow3.click();
    }




    }
