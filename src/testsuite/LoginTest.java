package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    //Create userShouldNavigateToLoginPageSuccessfully method
    public void userShouldNavigateToLoginPageSuccessfully() {
        driver.findElement(By.linkText("Log in")).click(); //click on the ‘Login’ link
        String expectedtext = "Welcome, Please Sign In!"; //expected Result
        WebElement welcomeTextElement = driver.findElement(By.xpath("//h1"));
        String actualText = welcomeTextElement.getText(); //Actual Result
        Assert.assertEquals("Not redirected to login page", expectedtext, actualText); //Compare both Result

    }

    @Test
    //create userShouldLoginSuccessfullyWithValidCredentials method
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        driver.findElement(By.linkText("Log in")).click(); //click on the link
        driver.findElement(By.id("Email")).sendKeys("yatrihirani@gmail.com"); //Enter valid username
        driver.findElement(By.id("Password")).sendKeys("Yatri@123"); //Enter valid password
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();   // Find the Login button element and click
        String expectedlogintext = "Log out"; //expected Result
        WebElement logoutintext = driver.findElement(By.linkText("Log out"));
        String actuallogintext = logoutintext.getText(); //Actual Result
        Assert.assertEquals("Login user is not valid", expectedlogintext, actuallogintext); //Compare both Result

    }

    @Test
    //Create verifyTheErrorMessage method
    public void verifyTheErrorMessage() {
        driver.findElement(By.linkText("Log in")).click(); //click on the ‘Login’ link
        driver.findElement(By.id("Email")).sendKeys("yhirani@gmail.com"); //Enter invalid username
        driver.findElement(By.id("Password")).sendKeys("Yatri@456"); //Enter invalid password
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();   // Find the Login button element and click
        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found"; //expected Result
        String actualErrorMessage = driver.findElement(By.xpath("//div[text() = 'Login was unsuccessful. Please correct the errors and try again.']")).getText();
        Assert.assertEquals("Error message not displayed", expectedErrorMessage, actualErrorMessage); //Compare both Result
    }


    @After
    public void tearDown() {
         closeBrowser();
    }

}
