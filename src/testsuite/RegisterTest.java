package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToRegisterPageSuccessfully() {
        driver.findElement(By.className("ico-register")).click();
        String expectedLinkText = "Register";
        String actualLinkText = driver.findElement(By.className("ico-register")).getText();
        Assert.assertEquals("not valid", expectedLinkText, actualLinkText);
    }

    @Test
    public void userSholdRegisterAccountSuccessfully() {
        driver.findElement(By.className("ico-register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.id("FirstName")).sendKeys("Yatri"); //Enter Firstname
        driver.findElement(By.id("LastName")).sendKeys("Hirani"); //Enter Lastname
        driver.findElement(By.name("DateOfBirthDay")).sendKeys("4"); //Enter Date
        driver.findElement(By.name("DateOfBirthMonth")).sendKeys("February");//Enter Month
        driver.findElement(By.name("DateOfBirthYear")).sendKeys("1994");//Enter Year
        driver.findElement(By.id("Email")).sendKeys("yatri.patel4294@gmail.com"); //Enter Email
        driver.findElement(By.id("Password")).sendKeys("yatrihirani"); //Enter Password
        driver.findElement(By.id("ConfirmPassword")).sendKeys("yatrihirani"); //Enter Confirm password
        driver.findElement(By.name("register-button")).click();

        String expectedVerifyText = "Your registration completed"; //expected Result
        String actualVerifyText = driver.findElement(By.className("result")).getText(); //Actual Result
        Assert.assertEquals("Registration not completed", expectedVerifyText, actualVerifyText); //Compare both Result


    }

    @After
    public void tearDown() {
         closeBrowser();
    }
}
