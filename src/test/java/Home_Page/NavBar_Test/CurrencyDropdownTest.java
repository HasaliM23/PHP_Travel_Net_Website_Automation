package Home_Page.NavBar_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CurrencyDropdownTest {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod

    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
        wait = new WebDriverWait(driver, java.time.Duration.ofSeconds(10));

    }

    @Test
    public void verifyCurrencyDropdownFunctionality() throws InterruptedException {

        WebElement currencyDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[2]/a")));
        currencyDropdown.click();

        WebElement selectEur = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[.='EUR']")));
        selectEur.click();

        Thread.sleep(2000);


    }

    @Test
    public void verify2ndCurrencyDropDownFunctionality() throws InterruptedException {

        WebElement currencyDropdownGBP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[2]/a")));
        currencyDropdownGBP.click();

        WebElement selectGBP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[2]/ul/li[2]/a/span[1]")));
        selectGBP.click();

        Thread.sleep(2000);

    }

    @Test
    public void verify3rdCurrencyDropDownFunctionality() throws InterruptedException {

        WebElement currencyDropdownPHP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[2]/a")));
        currencyDropdownPHP.click();

        WebElement selectPHP = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[2]/ul/li[5]/a/span[1]")));
        selectPHP.click();

        Thread.sleep(2000);


    }

}
