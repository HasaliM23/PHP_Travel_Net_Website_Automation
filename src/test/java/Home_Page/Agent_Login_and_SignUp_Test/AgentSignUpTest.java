package Home_Page.Agent_Login_and_SignUp_Test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AgentSignUpTest {


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
                By.xpath("//a[contains(.,'Agents')]")));
        agentDropdown2.click();

        WebElement signup = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[@href='https://phptravels.net/agent-signup']")));
        signup.click();

        //click signup button

        WebElement clicksignUp = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//a[text()='Signup']")));
        clicksignUp.click();


        //Fill SignUp Form

        //first Name
        WebElement fname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='firstname']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", fname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", fname);
        fname.sendKeys("Varun");

        //last Name
        WebElement lname = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='last_name']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", lname);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", lname);
        lname.sendKeys("Dhawan");

        //select county
        WebElement country = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@tabindex='-1']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", country);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", country);

        WebElement searchBox = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@role='combobox']")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", searchBox);
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchBox);
        searchBox.sendKeys("Australia");
        searchBox.sendKeys(Keys.ENTER);

        //phone number

        WebElement phoneNum = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='phone']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",phoneNum);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",phoneNum );
        phoneNum.sendKeys("61234567890");

        //Agency City

        WebElement agencyCity = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='agency_city']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",agencyCity);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",agencyCity );
        agencyCity.sendKeys("Canberra");

        //Agency Address

        WebElement agencyaddress = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='agency_address']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",agencyaddress);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",agencyaddress);
        agencyaddress.sendKeys("18 London Circuit  \n" + "Canberra ACT 2601  \n" + "Australia");

        //Agency Name

        WebElement agencyName = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='agency_name']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",agencyName);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",agencyName);
        agencyName.sendKeys("Capital Voyages");

        //Agency Licence

        WebElement agencyLicence = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@name='agency_license']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",agencyLicence);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",agencyLicence);
        agencyLicence.sendKeys("ACT-45-99887766");


        //Agency email

        WebElement agencyemail = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='user_email']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",agencyemail);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",agencyemail);
        agencyemail.sendKeys("varun@email.com");

        //Agency psw

        WebElement password = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='password']")));
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",password);
        ((JavascriptExecutor)driver).executeScript("arguments[0].click();",password);
        password.sendKeys("vrw67JK90@#$");

        //upload logo

        String filePath = "C:\\Users\\INTEL\\Downloads\\logo.png";

        // Find the file upload input
        WebElement uploadInput = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[@id='hlogo']")));

        // Upload the file using sendKeys only
        uploadInput.sendKeys(filePath);




        //CAPTCHA handling
        System.out.println("Please solve the hCaptcha manually...");
        Thread.sleep(30000); // wait for tester to solve captcha manually

        // --- Click Submit Button ---
        WebElement submitBtn = wait.until(ExpectedConditions.elementToBeClickable(By.id("submitBTN")));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", submitBtn);
        submitBtn.click();








    }
}
