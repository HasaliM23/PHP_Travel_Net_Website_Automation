package Car_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class CarSearchTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/cars");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void verifySearchCarTest() throws InterruptedException {

        WebElement airport = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//span[@id='select2--container'])[1]")));
        airport.click();

        WebElement newyork = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[.='JFK']")));
        newyork.click();


        //To location
        WebElement location = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("span[class='select2 select2-container select2-container--default select2-container--below select2-container--focus'] span[role='combobox']")));
        location.click();


        //Pick date

        WebElement pickdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='cars_from_date']")));
        pickdate.click();
        pickdate.sendKeys("15-11-2025");


        //Pick Time

        WebElement picktime = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='cars_from_time']")));
        picktime.click();

        Select select = new Select(picktime);
        select.selectByVisibleText("08:00 AM");

        //Drop date

        WebElement dropdate = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='cars_from_date']")));
        dropdate.click();
        dropdate.sendKeys("15-11-2025");

        //Drop Time

        WebElement droptime = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@id='cars_to_time']")));
        droptime.click();

        Select select1 = new Select(droptime);
        select1.selectByVisibleText("18:00 PM");

        //Search Button

        WebElement searchBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='search_button w-100 btn btn-primary btn-m rounded-sm font-700 text-uppercase btn-full h-100 waves-effect']")));
        searchBtn.click();








    }
}
