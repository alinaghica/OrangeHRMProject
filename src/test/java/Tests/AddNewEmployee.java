package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddNewEmployee {

    public WebDriver driver;
    LogIn logIn = new LogIn();

    @Test

    public void addNewEmployeeAfterLogin() {
        driver = new ChromeDriver();

        driver.get(("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login"));

        // Use WebDriverWait for elements
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

        //maximize window
        driver.manage().window().maximize();

        // Wait for username field and input value
        WebElement userNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username")));
        //WebElement userNameField = driver.findElement(By.name("username"));
        String userNameValue = "Admin";
        userNameField.sendKeys(userNameValue);

        // Wait for password field and input value
        WebElement passwordField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
        //WebElement passwordField = driver.findElement(By.name("password"));
        String passwordValue = "admin123";
        passwordField.sendKeys(passwordValue);

        // Wait for login button and click
        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
        //WebElement loginButton = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
        loginButton.click();

        WebElement pimMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[normalize-space()='PIM']")));
        //driver.findElement(By.xpath("//span[normalize-space()='PIM']"));
        pimMenu.click();

        WebElement addEmployeeTab = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[normalize-space()='Add Employee']")));
        addEmployeeTab.click();

        WebElement firstNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='First Name']")));
        String firstNameValue = "Tester";
        firstNameField.sendKeys(firstNameValue);

        WebElement middleNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Middle Name']")));
        String middleNameValue = "Automation";
        middleNameField.sendKeys(middleNameValue);

        WebElement lastNameField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Last Name']")));
        String lastNameValue = "Alina";
        lastNameField.sendKeys(lastNameValue);


    }


}
