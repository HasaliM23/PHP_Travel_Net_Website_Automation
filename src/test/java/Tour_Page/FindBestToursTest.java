package Tour_Page;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class FindBestToursTest {

    WebDriver driver;
    WebDriverWait wait;


    @BeforeMethod

    public void openLink(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/tours");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void verifyFindTour() throws InterruptedException {


        WebElement place = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@role='combobox']")));
        place.click();

        WebElement searchBox = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@role='searchbox']")));
        searchBox.sendKeys("Dubai");
        Thread.sleep(2000);

        WebElement dubaiOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//ul[contains(@id,'select2-tours_city-results')]//li[contains(.,'Dubai')]")
        ));
        dubaiOption.click();
        //Select the date

        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id = 'date']")));
        date.click();
        date.sendKeys("12-10-2025");

        //select travelers

        WebElement travelers = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='#']")));
        travelers.click();

        //click plus button

        WebElement clickPlus = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='tours-search']/div/div[3]/div/div/div/div/div[1]/div/div/div[2]")));
        clickPlus.click();

        //click submit button

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        submit.click();




    }
}
