package Tour_Page.DubaiToursBooking;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class DubaiAndtheDesert {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openTest(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/tour/24/tours/26-10-2025/1/0");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test

    public void BookingSpectacularsOfDubaiTour() throws InterruptedException {

        //Click Book Now Button

        WebElement bookNowStunningDubaiTour = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        bookNowStunningDubaiTour.click();

        //Fill the booking form

        WebElement firstname = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-first-name")));
        firstname.click();
        firstname.sendKeys("Lasith");

        WebElement lastname = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-last-name")));
        lastname.click();
        lastname.sendKeys("Silva");

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-email")));
        email.click();
        email.sendKeys("lasithS@gamil.com");

        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-phone")));
        phone.click();
        phone.sendKeys("0712345678");

        WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-address")));
        address.click();
        address.sendKeys("Colombo,SriLanka");

        WebElement selectNatinal = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-owns='bs-select-1']")));
        selectNatinal.click();

        WebElement searchNational = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-controls='bs-select-1']")));
        searchNational.click();
        searchNational.sendKeys("Sri Lanka");
        searchNational.sendKeys(Keys.ENTER);

        WebElement selectcountry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-owns='bs-select-2']")));
        selectcountry.click();

        WebElement searchcountry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-controls='bs-select-2']")));
        searchcountry.click();
        searchcountry.sendKeys("Sri Lanka");
        searchcountry.sendKeys(Keys.ENTER);

        //Traveler Info

        WebElement tfname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tfname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tfname);
        tfname.sendKeys("Lasith");

        WebElement tlname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tlname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tlname);
        tlname.sendKeys("Silva");


        // Payment Method (Stripe)
        WebElement payment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gateway_stripe']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", payment);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", payment);

        //Term and Conditions
        WebElement agree = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreechb")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agree);
        Thread.sleep(500); // just for visibility (optional)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", agree);


        //Book now

        WebElement bookingConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.=' Booking Confirm']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bookingConfirm);
        Thread.sleep(500); // just for visibility (optional)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookingConfirm);


    }
}
