package Home_Page.Customer_Login_and_SignUp_Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CustomerSignUpTest {

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
    public void verifyAgentSignupFormSubmission() throws InterruptedException {

        // Open dropdown for Signup
        WebElement agentDropdown2 = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[contains(.,'Customer')]")));
        agentDropdown2.click();

        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/signup']")));
        signup.click();

        //Fill the sign up form

        WebElement fname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='firstname']")));
        fname.click();
        fname.sendKeys("Oliver");

        WebElement lname = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='last_name']")));
        lname.click();
        lname.sendKeys("Carter");

        WebElement country = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@role='combobox']")));
        country.click();

        WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@type='search']")));
        searchBox.click();
        searchBox.sendKeys("New Zealand");
        searchBox.sendKeys(Keys.ENTER);

        WebElement phoneNum = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='phone']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",phoneNum);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",phoneNum );
        phoneNum.sendKeys("61234567890");

        WebElement email = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='user_email']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",email);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",email );
        email.sendKeys("olivercarter@gmail.com");

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",password);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",password );
        password.sendKeys("oliver45Y@#$");


        //CAPTCHA handling
        System.out.println("Please solve the hCaptcha manually...");
        Thread.sleep(30000); // wait for tester to solve captcha manually

        // --- Click Submit Button ---
        WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitBTN")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();








    }

}
