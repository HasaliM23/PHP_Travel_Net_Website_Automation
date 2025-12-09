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

public class Blog_Card_Test {

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
    public void verifyFirstCardWork(){
      WebElement firstCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Things To Do This Weekend']")));
      firstCard.click();

    }

    @Test
    public void verifySecondCardWork(){
        WebElement secondCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Fiercely Independent Cultures']")));
        secondCard.click();

    }

    @Test
    public void verifyThirdCardWork(){
        WebElement thirdCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[.='Peace Train A Long Time Coming']")));
        thirdCard.click();

    }

    @Test
    public void verifyFourthCardWork(){
        WebElement fourthCard = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//a[contains(text(),'South Africa A Terminal Tyre')])[1]")));
        fourthCard.click();

    }







}
