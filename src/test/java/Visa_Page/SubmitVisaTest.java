package Visa_Page;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SubmitVisaTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink(){

        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/visa");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    @Test
    public void verifySubmitVisaTest() throws InterruptedException {

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


        //Form Fill

        //First Name

        WebElement fname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='first_name']")));
        fname.click();
        fname.sendKeys("Ben");

        //Last Name

        WebElement lname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='last_name']")));
        lname.click();
        lname.sendKeys("Thomas");

        //Email

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='email']")));
        email.click();
        email.sendKeys("benthomas@gmail.com");

        //phone

        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='phone']")));
        phone.click();
        phone.sendKeys("0897654345");

        //Days

        WebElement days = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='number_of_days']")));
        days.click();
        days.clear();
        days.sendKeys("34");

        //Date

        WebElement date = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='date']")));
        date.clear();
        date.sendKeys("15-11-2025");

        //Visa Type
        WebElement visaType = wait.until(
                ExpectedConditions.visibilityOfElementLocated(By.xpath("//select[@name='visa_type']"))
        );

// scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", visaType);
        Thread.sleep(500);

// click using JavaScript to avoid interception
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", visaType);

// select dropdown item
        Select select = new Select(visaType);
        select.selectByVisibleText("Business Visa");

        //Note
        WebElement note = wait.until(ExpectedConditions.visibilityOfElementLocated(
                By.xpath("//textarea[@placeholder='Notes']")
        ));

// scroll to center to avoid sticky header overlay
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView({block: 'center'});", note);
        Thread.sleep(400);

// JS click to prevent interception
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", note);

        note.sendKeys("Text");

        //Submit

        WebElement submit = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='submit']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submit);
        Thread.sleep(500);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);











    }


}

