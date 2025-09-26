package Home_Page;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Tour_Booking {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/tour/26/tours/19-09-2025/2/0");
    }
    @Test
    public void tourBooking() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        WebElement datepick = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//input[@class='dp_tour form-control date_change']")));
        datepick.click();
        datepick.clear();
        datepick.sendKeys("24-09-2025");
        datepick.sendKeys(Keys.TAB); // close datepicker

        wait.until(ExpectedConditions.invisibilityOfElementLocated(
                By.cssSelector(".datepicker-dropdown")));

        WebElement adult = wait.until(ExpectedConditions.elementToBeClickable(By.id("adults")));
        new Select(adult).selectByVisibleText("2");

        WebElement child = wait.until(ExpectedConditions.elementToBeClickable(By.id("childs")));
        new Select(child).selectByVisibleText("1");

        WebElement bookNow = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//button[@class='btn-lg btn btn-primary w-100 ladda effect ladda-button waves-effect']")));

// fallback: JS click if intercepted
        try {
            bookNow.click();
        } catch (org.openqa.selenium.ElementClickInterceptedException e) {
            ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookNow);
        }

        WebElement fname = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-first-name")));
        fname.sendKeys("Mathew");

        WebElement lname = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-last-name")));
        lname.sendKeys("Thomas");

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-email")));
        email.sendKeys("mathewthomas@gmail.com");

        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-phone")));
        phone.sendKeys("065234567");

        WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-address")));
        address.sendKeys("10 Downing Street,  \n" + "London,  \n" + "SW1A 2AA,  \n" + "United Kingdom");

        WebElement national = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/button")));
        national.click();

        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/div/div[1]/input")));
        search.click();
        search.sendKeys("United Kingdom");
        search.sendKeys(Keys.ARROW_DOWN);
        search.sendKeys(Keys.ENTER);
        national.click();


        WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/button")));
        country.click();
        WebElement search1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/div/div[1]/input")));
        search1.click();
        search1.sendKeys("United Kingdom");
        search1.sendKeys(Keys.ARROW_DOWN);
        search1.sendKeys(Keys.ENTER);
        country.click();

        //Traveller Info

        WebElement tfname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tfname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tfname);
        tfname.sendKeys("Mathew");

        WebElement tlname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tlname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tlname);
        tlname.sendKeys("Thomas");

        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='title_2']")));
        Select selectTile = new Select(title);
        selectTile.selectByVisibleText("Mrs");


        WebElement tfname2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname_2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tfname2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tfname2);
        tfname2.sendKeys("Olivia");

        WebElement tlname2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname_2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tlname2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tlname2);
        tlname2.sendKeys("Watson");

        WebElement tcfname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='child_firstname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tcfname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tcfname);
        tcfname.sendKeys("George");

        WebElement tclame = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='child_lastname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tclame);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tclame);
        tclame.sendKeys("Thomas");

        // Payment Method (Bank Transfer)
        WebElement payment = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='gateway_bank_transfer']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", payment);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", payment);


        //Term and Conditions
        WebElement agree = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreechb")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agree);
        Thread.sleep(500); // just for visibility (optional)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", agree);


        //Book now

        WebElement  bookingConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.=' Booking Confirm']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  bookingConfirm);
        Thread.sleep(500); // just for visibility (optional)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",  bookingConfirm);













    }




    }

