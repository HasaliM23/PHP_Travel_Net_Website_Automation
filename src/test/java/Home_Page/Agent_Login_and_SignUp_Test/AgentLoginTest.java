package Home_Page.Agent_Login_and_SignUp_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentLoginTest {

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
    public void verifyAgentLoginFormSubmission() throws InterruptedException {

        // Open dropdown for Login
        WebElement agentDropdown2 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(.,'Agents')]")));
        agentDropdown2.click();

        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(.,'Login')]")));
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
