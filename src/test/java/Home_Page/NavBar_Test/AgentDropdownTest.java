package Home_Page.NavBar_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentDropdownTest {

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
    public void verifyAgentDropdownFunctionality() throws InterruptedException {

        // Click agent dropdown
        WebElement agentDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(.,'Agents')]")));
        agentDropdown.click();

        // Click Login (first option)
        WebElement login = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/login?agent=1']")));
        login.click();

        Thread.sleep(2000);


    }

    @Test

    public void verifyAgentDropdownFunctionality2() throws InterruptedException {

        // Open dropdown again for Signup
        WebElement agentDropdown2 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(.,'Agents')]")));
        agentDropdown2.click();

        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/agent-signup']")));
        signup.click();

    }

}
