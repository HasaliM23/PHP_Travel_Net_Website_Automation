package Blog_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class ViewMoreFunctionTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLinkTest(){

        driver = new ChromeDriver();
        driver.get("https://phptravels.net/blogs");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void verifyViewMoreButtonWorkProperly() throws InterruptedException {

        //WebElement viewMoreBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='loadMore']")));
        //viewMoreBtn.click();


        WebElement viewMoreBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='loadMore']")));

        // scroll into view
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", viewMoreBtn);
        Thread.sleep(500);

        // click using JavaScript to avoid interception
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", viewMoreBtn);
    }


}

