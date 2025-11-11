package Visa_Page;

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

public class VisaSearchTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){
        driver = new ChromeDriver();
        driver.get("https://phptravels.net/visa");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    @Test
    public void verifySearchVisa(){

        WebElement fromCounty = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='select2--container']")));
        fromCounty.click();

        WebElement countrySearch = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/span/span/span[1]/input")));
        countrySearch.click();
        countrySearch.sendKeys("Australia");
        countrySearch.sendKeys(Keys.ENTER);


        //To city

        WebElement toCountry = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[@title='Select Country']")));
        toCountry.click();

        WebElement countrysearch2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-autocomplete='list']")));
        countrysearch2.click();
        countrysearch2.sendKeys("Sri Lanka");
        countrysearch2.sendKeys(Keys.ENTER);

        //Search

        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
        search.click();



    }
}
