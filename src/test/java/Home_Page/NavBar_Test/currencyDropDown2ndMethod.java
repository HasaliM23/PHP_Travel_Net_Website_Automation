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
import java.util.Set;

public class currencyDropDown2ndMethod {

    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void openLink() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://phptravels.net/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }

    @Test
    public void CurrencyDropdownFunctionality2ndMethod() {
        String mainWindow = driver.getWindowHandle();

        selectCurrency("EUR", mainWindow);
        selectCurrency("GBP", mainWindow);
    }

    private void selectCurrency(String currencyCode, String mainWindow) {
        // Open dropdown
        WebElement currencyDropdown = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//*[@id='navbarSupportedContent']/div[2]/ul/li[2]/a")));
        currencyDropdown.click();

        // Click chosen currency
        WebElement currencyOption = wait.until(ExpectedConditions.elementToBeClickable(
                By.xpath("//span[.='" + currencyCode + "']")));
        currencyOption.click();

        // Handle window switching
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            if (!window.equals(mainWindow)) {
                driver.switchTo().window(window);
                System.out.println("Switched to: " + driver.getCurrentUrl());

                // Close new tab and return
                driver.close();
                driver.switchTo().window(mainWindow);
            }
        }
    }

}
