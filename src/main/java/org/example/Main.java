package org.example;
import net.bytebuddy.build.Plugin;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.ISelect;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.concurrent.TimeUnit;

import static java.time.temporal.ChronoUnit.SECONDS;

public class Main{
    public WebDriver driver ;
    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Rashad\\IdeaProjects\\untitled5\\geckodriver.exe");
        driver = new FirefoxDriver();
        driver.get("https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login");
    }

// Here we test login functionality for user
    @Test(priority = 1 )
    public void customerLogin() {
      customerLogIn();
    }


// here we check if transaction button works fine or not
    @Test(priority = 2)
    public void Transactions() {
        customerLogIn();
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        By transactionButton = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[1]");

        // Explicitly wait for the element to be clickable before clicking it
        WebElement button = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.elementToBeClickable(transactionButton));

        // Click the button
        button.click();


    }
 // Here we check deposit button
    @Test(priority = 3)
    public void deposit() {
        customerLogIn();
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        // Click the deposit button
        By depositButton = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[2]");
        WebElement depositButtonElement = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.elementToBeClickable(depositButton));
        depositButtonElement.click();

        // Enter the deposit amount
        By depositAmountInput = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
        WebElement depositAmountInputElement = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.visibilityOfElementLocated(depositAmountInput));
        depositAmountInputElement.sendKeys("500");

        // Click the deposit submit button
        By depositSubmitButton = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button");
        WebElement depositSubmitButtonElement = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.elementToBeClickable(depositSubmitButton));
        depositSubmitButtonElement.click();

    }

    //Here we check withdrawal button
    @Test(priority = 4)
    public void withDrawal() {
        customerLogIn();
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        // Click the withdrawal button
        By withdrawalButton = By.xpath("/html/body/div/div/div[2]/div/div[3]/button[3]");
        WebElement withdrawalButtonElement = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.elementToBeClickable(withdrawalButton));
        withdrawalButtonElement.click();

        // Enter the withdrawal amount
        By withdrawalAmountInput = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/div/input");
        WebElement withdrawalAmountInputElement = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.visibilityOfElementLocated(withdrawalAmountInput));
        withdrawalAmountInputElement.sendKeys("1000");

        // Click the withdrawal submit button
        By withdrawalSubmitButton = By.xpath("/html/body/div/div/div[2]/div/div[4]/div/form/button");
        WebElement withdrawalSubmitButtonElement = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.elementToBeClickable(withdrawalSubmitButton));
        withdrawalSubmitButtonElement.click();

    }

    //Here we check login functonality for bank manager
    @Test(priority = 5)
    public void bankManagerLogIn() {
        bankManagerLogin();
    }


    //Here add customer done by bank manager
    @Test(priority = 6)
    public void addCustomer()  {

        bankManagerLogin();
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        // Click the "Add Customer" button
        By addCustomerButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]");
        WebElement addCustomerButtonElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(addCustomerButton));
        addCustomerButtonElement.click();

        // Fill in the customer information
        By firstNameInput = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input");
        WebElement firstNameInputElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(firstNameInput));
        firstNameInputElement.sendKeys("#$#@@");

        By lastNameInput = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input");
        WebElement lastNameInputElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(lastNameInput));
        lastNameInputElement.sendKeys("@$@#%#@");

        By postCodeInput = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input");
        WebElement postCodeInputElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(postCodeInput));
        postCodeInputElement.sendKeys("@$@$@%@");

        // Click the submit button
        By submitButton = By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button");
        WebElement submitButtonElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButtonElement.click();


    }
    //Here we check whether manager is able to open account or not
    @Test(priority = 7)
    public void openAccount() {
        bankManagerLogin();
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        // Click the "Open Account" button
        By openAccountButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]");
        WebElement openAccountButtonElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(openAccountButton));
        openAccountButtonElement.click();

        // Select customer name
        By userSelectDropdown = By.xpath("//*[@id=\"userSelect\"]");
        WebElement userSelectDropdownElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOfElementLocated(userSelectDropdown));
        Select customerNameDropdown = new Select(userSelectDropdownElement);
        customerNameDropdown.selectByValue("2");

// Wait for currency dropdown options to load
        By currencyDropdownLocator = By.xpath("//*[@id=\"currency\"]");
        new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.presenceOfElementLocated(currencyDropdownLocator));

// Select currency
        WebElement currencyDropdownElement = driver.findElement(currencyDropdownLocator);
        Select currencyDropdown = new Select(currencyDropdownElement);
        currencyDropdown.selectByValue("Dollar");


        // Click the submit button
        By submitButton = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/form/button");
        WebElement submitButtonElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(submitButton));
        submitButtonElement.click();
    }

    //Here we see list of customers
    @Test(priority = 8)
    public void showCustomers() {
        bankManagerLogin();
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        // Click the "Customers" button
        By customersButton = By.xpath("/html/body/div[1]/div/div[2]/div/div[1]/button[3]");
        WebElement customersButtonElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                . until(ExpectedConditions.elementToBeClickable(customersButton));
        customersButtonElement.click();

        // Click the button in the first row of the table
        By buttonInFirstRow = By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/div/div/table/tbody/tr[1]/td[5]/button");
        WebElement buttonInFirstRowElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(buttonInFirstRow));
        buttonInFirstRowElement.click();

    }

    //this method is a template i have used in all tests required logging in as a manager
    public void bankManagerLogin(){
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        // Click the Bank Manager login button
        By bankManagerLoginButton = By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button");
        WebElement bankManagerLoginButtonElement = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(bankManagerLoginButton));
        bankManagerLoginButtonElement.click();
    }

    //this method is a template i have used in all tests required logging in as a customer
    public  void customerLogIn(){
        // Setting up an implicit wait of 10 seconds
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Navigate to your web page

        // Explicitly wait for the element to be clickable before clicking it
        WebElement button = new WebDriverWait(driver, Duration.of(10, SECONDS))
                .until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[1]/button")));

        // Click the button
        button.click();
        driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).click();

        // Explicit wait for the dropdown to be present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"userSelect\"]")));

        Select yourname = new Select(driver.findElement(By.xpath("//*[@id=\"userSelect\"]")));
        yourname.selectByValue("1");

        // Explicit wait for the button to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div/div/div[2]/div/form/button")));

        driver.findElement(By.xpath("/html/body/div/div/div[2]/div/form/button")).click();




}

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}