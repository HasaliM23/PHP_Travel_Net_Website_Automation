package Home_Page.NavBar_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class NavigationBarTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://phptravels.net/");
    }

    @Test
    public void verifyHotelNavigation() throws InterruptedException {

        WebElement hotel = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Hotels')]")));
        hotel.click();

        driver.navigate().back();

        Thread.sleep(2000);

        WebElement flight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Flights')]")));
        flight.click();

        driver.navigate().back();

        WebElement tour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(text(),'Tours')]")));
        tour.click();
        Thread.sleep(2000);

        driver.navigate().back();




        WebElement cars = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Cars')]")));
        cars.click();

        driver.navigate().back();

        WebElement visa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Visa')]")));
        visa.click();

        driver.navigate().back();

        WebElement blog = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Blogs')]")));
        blog.click();

    }

    //second Method

    @Test
    public void verifyFlightNavigation() throws InterruptedException {

        WebElement flight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Flights')]")));
        flight.click();

    }

    @Test
    public void verifyTourNavigation() throws InterruptedException {

        WebElement tour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Tours')]")));
        tour.click();

    }

    @Test
    public void verifyCarsNavigation() throws InterruptedException {

        WebElement cars = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Cars')]")));
        cars.click();

    }

    @Test
    public void verifyVisaNavigation() throws InterruptedException {

        WebElement visa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Visa')]")));
        visa.click();

    }



    }
