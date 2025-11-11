package Visa_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class VisaNavigationTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void verifyVisaNavigationTest(){

        WebElement visaLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@href='https://phptravels.net/visa']")));
        visaLink.click();

        // Verify Visa Page Loaded Properly
        wait.until(ExpectedConditions.titleContains("Visa"));

        String actualTitle = driver.getTitle();
        System.out.println("Page Title: " + actualTitle);
    }
}
