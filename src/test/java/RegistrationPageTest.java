import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.RegistrationPage;
import pages.WelcomePage;

import java.util.Arrays;
import java.util.List;

public class RegistrationPageTest {
    public WebDriver driver;
    WelcomePage welcomePage;
    RegistrationPage registrationPage;
    @BeforeMethod
    public void setup(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\kvaib\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://qameetup.ccbp.tech/");
        welcomePage = new WelcomePage(driver);
        registrationPage = new RegistrationPage(driver);
    }
    @DataProvider
    public Object [][] RegistrationData(){
        return new Object[][]{
                {"Jack","ARTS_AND_CULTURE","Arts and Culture"},
                {"Jerry","CAREER_AND_BUSINESS","Career and Business"},
                {"John","EDUCATION_AND_LEARNING","Education and Learning"},
                {"Jim","FASHION_AND_BEAUTY","Fashion and Learning"},
                {"Jane","GAMES","Games"}
        };
    }

    @Test
    public void Test1(){
        welcomePage.setButton();
        Assert.assertTrue(registrationPage.regImg().isDisplayed(),"Register image is not displayed");

        Assert.assertTrue(registrationPage.logo().isDisplayed(),"App logo is not displayed");

        String actualHeading = registrationPage.heading();
        Assert.assertEquals(actualHeading,"Let us join","Heading text does not match");

        String expectedNames = registrationPage.names();
        String actualNames = "NAME";
        Assert.assertEquals(expectedNames,actualNames,"Name label text does not match");

        String expectedTopic = registrationPage.topic();
        String actualTopic = "TOPICS";
        Assert.assertEquals(actualTopic,expectedTopic,"Topics label text does not match");
    }
    @Test
    public void Test2(){
        welcomePage.setButton();
        registrationPage.regButton();

        String actualError = registrationPage.error();
        Assert.assertEquals(actualError,"Please enter your name","Error text with empty input field does not match");
    }
    @Test(dataProvider = "RegistrationData")
    public void Test3(String name,String Value,String text){
        welcomePage.setButton();

        registrationPage.names(name);
        registrationPage.Topics(Value);
        registrationPage.clickRegister();

        String expectedUrl ="https://qameetup.ccbp.tech/";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrl,"URLs do not match");

        String expectedHeading = "Hello " + name;
        String actualHeading = registrationPage.hello();
        Assert.assertEquals(actualHeading, expectedHeading, "Heading text does not match");

        String expectedDescription = "Welcome to " + text;
        String actualDescription = registrationPage.welcome();
        Assert.assertEquals(actualDescription, expectedDescription, "Description text does not match");
    }


    @AfterMethod
    public void close(){
        driver.quit();
    }


}
