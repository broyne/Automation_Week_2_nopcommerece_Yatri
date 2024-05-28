package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class TopMenuTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[a[text()='Computers ']]/a")).click();
        String extectedCompterText = "Computers"; //expected Result
        String actualComputerText = driver.findElement(By.xpath("//h1")).getText(); //Actual Result
        Assert.assertEquals("Wrong text display", extectedCompterText, actualComputerText); //Compare both Result
    }


    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[a[text()='Electronics ']]/a")).click();
        String extectedElectornicsText = "Electronics"; //expected Result
        String actualElectornicsText = driver.findElement(By.xpath("//h1")).getText(); //Actual Result
        Assert.assertEquals("Wrong text display", extectedElectornicsText, actualElectornicsText); //Compare both Result
    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[a[text()='Apparel ']]/a")).click();
        String extectedApparelText = "Apparel"; //expected Result
        String actualApparelText = driver.findElement(By.xpath("//h1")).getText(); //Actual Result
        Assert.assertEquals("Wrong text display", extectedApparelText, actualApparelText); //Compare both Result
    }


    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[a[text()='Digital downloads ']]/a")).click();
        String extectedDigitalText = "Digital downloads"; //expected Result
        String actualDigitalText = driver.findElement(By.xpath("//h1")).getText(); //Actual Result
        Assert.assertEquals("Wrong text display", extectedDigitalText, actualDigitalText); //Compare both Result
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[a[text()='Books ']]/a")).click();
        String expectedBooksText = "Books"; //expected Result
        String actualBooksText = driver.findElement(By.xpath("//h1")).getText(); //Actual Result
        Assert.assertEquals("Wrong text display", expectedBooksText, actualBooksText); //Compare both Result
    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[a[text()='Jewelry ']]/a")).click();
        String expectedJewelryText = "Jewelry"; //expected Result
        String actualJewelryText = driver.findElement(By.xpath("//h1")).getText(); //Actual Result
        Assert.assertEquals("Wrong text display", expectedJewelryText, actualJewelryText); //Compare both Result
    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//li[a[text()='Gift Cards ']]/a")).click();
        String expectedGcardText = "Gift Cards"; //expected Result
        String actualGcardText = driver.findElement(By.xpath("//h1")).getText(); //Actual Result
        Assert.assertEquals("Wrong text display", expectedGcardText, actualGcardText); //Compare both Result
    }


    @After
    public void tearDown() {
        closeBrowser();
    }
}
