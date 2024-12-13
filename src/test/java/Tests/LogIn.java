package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class LogIn {

    public WebDriver driver;

    @Test

    public void logInMethod(){

        //deschid browserul de Chrome
        driver = new ChromeDriver();

        //accesez pagine web
        driver.get(("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));

        // Use WebDriverWait for elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        //maximize window
        driver.manage().window().maximize();

        //insert userName
        WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        //WebElement userNameField = driver.findElement(By.name("username"));
        String userNameValue = "Admin";
        userNameField.sendKeys(userNameValue);

        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        //WebElement passwordField = driver.findElement(By.name("password"));
        String passwordValue = "admin123";
        passwordField.sendKeys(passwordValue);

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        //WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginButton.click();

    }
}
