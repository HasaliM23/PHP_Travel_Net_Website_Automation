package Blog_Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class NewBlogFunctionTests {

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
    public void verifynewBlogFunction1cardtest() throws InterruptedException {

        WebElement firstcard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='blog-img'])[19]")));
        firstcard.click();
    }

    @Test
    public void verifynewBlogFunction3cardtest() throws InterruptedException {

        WebElement thirdcard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='blog-img'])[20]")));
        thirdcard.click();
    }

    @Test
    public void verifynewBlogFunction4cardtest() throws InterruptedException {

        WebElement fourthcard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='blog-img'])[21]")));
        fourthcard.click();
    }


    @Test
    public void verifynewBlogFunction5cardtest() throws InterruptedException {

        WebElement fifthcard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='blog-img'])[22]")));
        fifthcard.click();
    }

    @Test
    public void verifynewBlogFunction6cardtest() throws InterruptedException {

        WebElement sixthcarde = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//img[@alt='blog-img'])[23]")));
        sixthcarde.click();
    }


    @Test
    public void verifynewBlogFunction7cardtest() throws InterruptedException {


    }


}


