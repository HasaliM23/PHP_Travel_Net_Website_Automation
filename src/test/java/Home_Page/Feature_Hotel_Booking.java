package Home_Page;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Feature_Hotel_Booking {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/hotel/2/movenpick-grand-al-bustan/20-09-2025/21-09-2025/1/2/1/US/hotels");
    }

    @Test
    public void featureHotelBookingSection() throws InterruptedException {

        wait = new WebDriverWait(driver, Duration.ofSeconds(30));

        //Book Now Hotel

        WebElement bookNow = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='rooms']/div/div/div[2]/div[1]/div/div/table/tbody/tr/td[6]/button"))
        );

        // scroll into view first
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bookNow);
        Thread.sleep(1000); // just to see it scroll

        // now click with JS (avoids interception)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookNow);

        //personal information

        WebElement fName = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-first-name")));
        fName.click();
        fName.sendKeys("Shaggy");

        WebElement lName = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-last-name")));
        lName.click();
        lName.sendKeys("Rogers");

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-email")));
        email.click();
        email.sendKeys("shaggyRoger@gmail.com");

        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-phone")));
        phone.click();
        phone.sendKeys("01123456789");

        WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-address")));
        address.click();
        address.sendKeys("321 Main Street  \n" + "Springfield, IL 62704  \n" + "USA");

        WebElement nationality = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/button")));
        nationality.click();
        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/div/div[1]/input")));
        search.click();
        search.sendKeys("Australia");
        search.sendKeys(Keys.ARROW_DOWN);
        search.sendKeys(Keys.ENTER);
        nationality.click();

        WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/button")));
        country.click();
        WebElement search1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/div/div[1]/input")));
        search1.click();
        search1.sendKeys("Australia");
        search1.sendKeys(Keys.ARROW_DOWN);
        search1.sendKeys(Keys.ENTER);
        country.click();

        // Travellers Information

        WebElement TFName = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname_1']"))
        );
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TFName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TFName);
        TFName.sendKeys("Shaggy");


        WebElement TLName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", TLName);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", TLName);
        TLName.sendKeys("Rogers");


        WebElement titel = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='title_2']")));
        Select selectTitle = new Select(titel);
        selectTitle.selectByVisibleText("Mrs");


        // Traveler 2 Firstname
        WebElement Tfname2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='firstname_2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tfname2);
        Tfname2.sendKeys("Emma");

        // Traveler 2 Lastname
        WebElement Tlname2 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='lastname_2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tlname2);
        Tlname2.sendKeys("Katy");

        // Traveler child first name

        WebElement Tcname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='child_firstname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tcname);
        Tcname.sendKeys("Max");

        // Traveler child last name

        WebElement Tclname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@name='child_lastname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", Tclname);
        Tclname.sendKeys("Rogers");





        //Payment Method

        // Payment Method (Stripe)
        WebElement payment = wait.until(ExpectedConditions.elementToBeClickable(By.id("gateway_stripe")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", payment);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", payment);


        //Term and Conditions
        WebElement agree = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("agreechb")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", agree);
        Thread.sleep(500); // just for visibility (optional)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", agree);


        //Book now

        WebElement  bookNowButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@id='booking']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  bookNowButton);
        Thread.sleep(500); // just for visibility (optional)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",  bookNowButton);





















    }

}
