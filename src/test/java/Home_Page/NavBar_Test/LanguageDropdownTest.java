package Home_Page.NavBar_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LanguageDropdownTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://phptravels.net/");
    }

    @Test
    public void verifyLanguageDropdownFunctionality() throws InterruptedException {

        WebElement langDrop = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[1]/a")));
        langDrop.click();

        WebElement chooseruLang = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='Russian']")));
        chooseruLang.click();

        Thread.sleep(2000);









    }

}
