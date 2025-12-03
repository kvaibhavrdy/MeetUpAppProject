import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.WelcomePage;

import java.time.Duration;

public class WelcomePageTest {
    public WebDriver driver;
    WelcomePage welcomePage;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kvaib\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");
        welcomePage = new WelcomePage(driver);
    }
    @Test
    public void Test1(){
        Assert.assertTrue(welcomePage.appLogo().isDisplayed(),"App logo is not displayed");

        String actualHeading = welcomePage.appHeading();
        Assert.assertEquals(actualHeading,"Welcome to Meetup","Heading text does not match");

        String actualParagraph = welcomePage.appParagraph();
        Assert.assertEquals(actualParagraph,"Please register for the topic","Description text does not match");

        Assert.assertTrue(welcomePage.meetupImg().isDisplayed(),"Meetup image is not displayed");


    }
    @Test
    public void Test2(){
        welcomePage.setButton();

        String expectedUrl = "https://qameetup.ccbp.tech/register";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl,"URLs do not match");

    }
    @AfterMethod
    public void close(){
        driver.quit();
    }
}
