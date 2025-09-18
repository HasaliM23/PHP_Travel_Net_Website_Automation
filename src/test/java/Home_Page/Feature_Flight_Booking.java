package Home_Page;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Feature_Flight_Booking {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
    }

    @Test
    public void featureFlightSection() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //click feature class card

        WebElement click_Card = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//a[@href='https://phptravels.net/flights/ber/dxb/oneway/economy/21-09-2025/1/0/0']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", click_Card);


        WebElement selectFlight = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='flight-list']/li[1]/form/div/div/div/div[2]/div/div/div/button")));
        selectFlight.click();

        //personal information

        WebElement fName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='p-first-name']")));
        fName.click();
        fName.sendKeys("Nurik");

        WebElement lName = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='p-last-name']")));
        lName.click();
        lName.sendKeys("Alwis");

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='p-email']")));
        email.click();
        email.sendKeys("nurikalwismax@gmail.com");

        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='p-phone']")));
        phone.click();
        phone.sendKeys("01123456789");

        WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='p-address']")));
        address.click();
        address.sendKeys("Breaker Street, \n 2nd Lane, \n Mumbai, \n India.");

        WebElement nationality = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@aria-owns,'bs-select-1')]")));
        nationality.click();
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-activedescendant='bs-select-1-226']")));
        search.click();
        search.sendKeys("Australia");
        search.sendKeys(Keys.ARROW_DOWN);

        search.sendKeys(Keys.ENTER);
        nationality.click();

        WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@aria-owns='bs-select-2']")));
        country.click();
        WebElement search1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@aria-activedescendant='bs-select-2-226']")));
        search1.click();
        search1.sendKeys("Australia");
        search1.sendKeys(Keys.ARROW_DOWN);

        search1.sendKeys(Keys.ENTER);
        country.click();

        //Travellers Information

        WebElement TFName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("t-first-name-1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TFName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TFName);
        TFName.sendKeys("Nurik");


        WebElement TLName = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("t-last-name-1")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TLName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TLName);
        TLName.sendKeys("Alwis");

        WebElement nationalityDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//select[@class='form-select nationality']")));

// Create Select object
        Select select = new Select(nationalityDropdown);

// Select by visible text
        select.selectByVisibleText("Australia");

        //DOB

        WebElement month = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='dob_month_1']")));

        Select select1 = new Select(month);
        select1.selectByVisibleText("05 May");

        WebElement day = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='dob_day_1']")));

        Select daySelect = new Select(day);
        daySelect.selectByVisibleText("12");

        WebElement year = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='dob_year_1']")));

        Select yearSelect = new Select(year);
        yearSelect.selectByVisibleText("1998");

        //passport Number

        WebElement passport = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='t-passport-1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", passport);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", passport);
        passport.sendKeys("AB1234567");


        //Issuance Information
        WebElement IssueMonth = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='passport_issuance_month_1']")));

        Select MonthS = new Select(IssueMonth);
        MonthS.selectByVisibleText("03 Mar");

        WebElement IssueDay = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='passport_issuance_day_1']")));

        Select DayS = new Select(IssueDay);
        DayS.selectByVisibleText("22");

        WebElement IssueYear = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//select[@name='passport_issuance_year_1']")));

        Select YearS = new Select(IssueYear);
        YearS.selectByVisibleText("2025");


        //email traveler
        WebElement Temail = wait.until(ExpectedConditions.elementToBeClickable(By.id("t-email-1")));
        Temail.click();
        Temail.sendKeys("nurikalwismax@gmail.com");

        //phone traveler
        WebElement Tphone = wait.until(ExpectedConditions.elementToBeClickable(By.id("t-phone-1")));
        Tphone.click();
        Tphone.sendKeys("01123456789");

        // Agree to terms checkbox
        WebElement checkBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreechb")));

// Scroll the checkbox into view with a small offset to avoid sticky headers
        ((JavascriptExecutor) driver).executeScript(
                "var rect = arguments[0].getBoundingClientRect(); window.scrollBy(0, rect.top - 100);",
                checkBox
        );

// Click the checkbox using JavaScript to avoid interception
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", checkBox);

        //submit

        WebElement submit = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='booking']")));
        // Scroll into view with offset to avoid overlays
        ((JavascriptExecutor) driver).executeScript(
                "var rect = arguments[0].getBoundingClientRect(); window.scrollBy(0, rect.top - 150);", submit
        );

// Wait a tiny bit to ensure page settles
        Thread.sleep(500);  // short pause

// Click via JS
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", submit);


    }

}

