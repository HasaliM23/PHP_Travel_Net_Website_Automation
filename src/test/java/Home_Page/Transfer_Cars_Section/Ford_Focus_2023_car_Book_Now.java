package Home_Page.Transfer_Cars_Section;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Ford_Focus_2023_car_Book_Now {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {

        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
    }

    @Test
    public void Ford_Focus_2023_car_Book() throws InterruptedException {
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));


        WebElement bookNow  = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id='fadein']/main/div[4]/div/section/div[2]/div/div/div/div[2]/div/div[2]/form/div/div[2]/div[3]/button")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", bookNow);
        Thread.sleep(2000);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", bookNow);

        WebElement fname = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-first-name")));
        fname.sendKeys("Liam");

        WebElement lname = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-last-name")));
        lname.sendKeys("Cooper");

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-email")));
        email.sendKeys("liamcooper@gmail.com");

        WebElement phone = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-phone")));
        phone.sendKeys("065234567");

        WebElement address = wait.until(ExpectedConditions.elementToBeClickable(By.id("p-address")));
        address.sendKeys("45 Queen Street,  \n" + "Auckland Central 1010,  \n" + "Auckland,  \n" + "New Zealand");

        WebElement national = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/button")));
        national.click();

        WebElement search = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[6]/div/div/div/div[1]/input")));
        search.click();
        search.sendKeys("New zealand");
        search.sendKeys(Keys.ARROW_DOWN);
        search.sendKeys(Keys.ENTER);
        national.click();


        WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/button")));
        country.click();
        WebElement search1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='fadein']/main/div[2]/form/section/div/div/div[1]/div[1]/div[2]/div/div/div[7]/div/div/div/div[1]/input")));
        search1.click();
        search1.sendKeys("New zealand");
        search1.sendKeys(Keys.ARROW_DOWN);
        search1.sendKeys(Keys.ENTER);
        country.click();

        //Traveler Info

        WebElement tfname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tfname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tfname);
        tfname.sendKeys("Liam");

        WebElement tlname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname_1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tlname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tlname);
        tlname.sendKeys("Cooper");

        WebElement title = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//select[@name='title_2']")));
        Select selectTile = new Select(title);
        selectTile.selectByVisibleText("Mrs");


        WebElement tfname2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='firstname_2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tfname2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tfname2);
        tfname2.sendKeys("Isla");



        WebElement tlname2 = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='lastname_2']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", tlname2);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click;", tlname2);
        tlname2.sendKeys("Robinson");

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

        WebElement  bookingConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[.=' Booking Confirm']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);",  bookingConfirm);
        Thread.sleep(500); // just for visibility (optional)
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();",  bookingConfirm);





    }
}
