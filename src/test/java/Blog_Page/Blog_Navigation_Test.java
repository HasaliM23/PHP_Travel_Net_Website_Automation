package Blog_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class Blog_Navigation_Test {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLinkTest(){

        driver = new ChromeDriver();
        driver.get("https://phptravels.net/");
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void verifyBlogNavigationLink(){

        WebElement BlogLink = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[contains(.,'Blogs')]")));
        BlogLink.click();
    }
}
