package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.lang.model.element.Element;
import java.time.Duration;

public class WelcomePage {
    @FindBy(xpath = "//img[@class='WebsiteLogo-sc-18jwh2i-0 cOOHfv']")
    WebElement displayLogo;

    @FindBy(xpath = "//h1[@class='WelcomeHeading-sc-r6ilfd-3 dXNOvO']")
    WebElement meetupHeading;

    @FindBy(xpath = "//p[@class='WelcomeDescription-sc-r6ilfd-4 gnXXwD']")
    WebElement meetupParagraph;

    @FindBy(xpath = "//img[@class='MeetUpImage-sc-r6ilfd-8 cKpDNs']")
    WebElement meetupLogo;

    @FindBy(id = "registerButton")
    WebElement button;


    WebDriver driver;
    WebDriverWait wait;

    public WelcomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    }
    public WebElement appLogo(){
        return displayLogo;
    }
    public String appHeading(){
        return meetupHeading.getText();
    }
    public String appParagraph(){
        return meetupParagraph.getText();
    }
    public WebElement meetupImg(){
        return meetupLogo;
    }
    public void setButton(){
        button.click();
    }
}
