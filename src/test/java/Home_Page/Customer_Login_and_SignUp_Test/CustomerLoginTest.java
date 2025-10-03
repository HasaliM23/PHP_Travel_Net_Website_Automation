package Home_Page.Customer_Login_and_SignUp_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerLoginTest {

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
    public void verifyCustomerLoginFormSubmission() throws InterruptedException {

        // Open dropdown for Login
        WebElement customerDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(.,'Customer')]")));
        customerDropdown.click();

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/login']")));
        login.click();

        //Fill the login form

        WebElement email = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='email']")));
        email.click();
        email.sendKeys("varun@email.com");

        WebElement password = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='password']")));
        password.click();
        password.sendKeys("vrw67JK90@#$");

        WebElement loginBtn = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@id='submitBTN']")));
        loginBtn.click();
    }
}
