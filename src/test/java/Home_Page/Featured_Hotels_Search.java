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

public class Featured_Hotels_Search {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
    }

    @Test
    public void featureHotelSection() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //click feature Hotel card

        WebElement click_Card = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//img[@src='./uploads/184028-28-01-2023-1674874284.jpg']")));


        // Scroll the element into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", click_Card);
        Thread.sleep(2000); // Just to see the scroll effect clearly

        // Now click the element
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", click_Card);


        //CheckIn Date
        WebElement checkInDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkin']")));
        checkInDate.click();
        checkInDate.clear();
        checkInDate.sendKeys("25-10-2025");

        //CheckOut Date

        WebElement checkOutDate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='checkout']")));
        checkOutDate.click();
        checkOutDate.clear();
        checkOutDate.sendKeys("26-10-2025");

        //Select Child
        WebElement child = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='childs']")));

        Select childSelect = new Select(child);
        childSelect.selectByVisibleText("1");

        Thread.sleep(2000);

        //child age

        // Wait until the Child Age dropdown becomes visible
        WebElement childAge = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@id='ages1']")));
        Select childAgeSelect = new Select(childAge);
        childAgeSelect.selectByVisibleText("1");


        Thread.sleep(2000);

        //Nationality

        WebElement Nantionality = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[contains(.,'Select')]")));

        Select NationalSelect = new Select(Nantionality);
        NationalSelect.selectByVisibleText("Australia");

        Thread.sleep(1000);

        //Search

        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@data-style='zoom-in']")));
        search.click();












    }

}
