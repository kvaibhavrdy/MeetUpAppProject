package pages;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class RegistrationPage {
    @FindBy(xpath = "//img[@class='RegisterImage-sc-sr3jcr-3 jgqaBE']")
    WebElement registrationImg;

    @FindBy(xpath = "//img[@class='WebsiteLogo-sc-18jwh2i-0 cOOHfv']")
    WebElement appLogo;

    @FindBy(xpath = "//h1[@class='Heading-sc-sr3jcr-5 PCucY']")
    WebElement regHeading;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/div[1]/label")
    WebElement regName;

    @FindBy(xpath = "/html/body/div/div/div/div[2]/form/div[2]/label")
    WebElement regTopic;

    @FindBy(xpath = "//button[@class='RegisterButton-sc-sr3jcr-12 fuqIpV']")
    WebElement getRegistrationButton;

    @FindBy(xpath = "//p[@class='ErrorMessage-sc-sr3jcr-13 gKcqSM']")
    WebElement errorMessage;

    @FindBy(id = "name")
    WebElement enterName;

    @FindBy(id = "topic")
    WebElement enterTopic;

    @FindBy(xpath = "//button[@class='RegisterButton-sc-sr3jcr-12 fuqIpV']")
    WebElement clickRegisterButton;

    @FindBy(xpath = "/html/body/div/div/div/div/h1")
    WebElement helloHeading;

    @FindBy(xpath = "//p[@class='TopicDescription-sc-r6ilfd-7 kmIDOn']")
    WebElement welcomePara;

    WebDriver driver;
    WebDriverWait wait;

    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public WebElement regImg(){
        return registrationImg;
    }
    public WebElement logo(){
        return appLogo;
    }
    public String heading(){
        return regHeading.getText();
    }
    public String names(){
        return regName.getText();
    }
    public String topic(){
        return regTopic.getText();
    }
    public void regButton(){
        getRegistrationButton.click();
    }
    public String error(){
        return errorMessage.getText();
    }
    public void names(String name){
        //enterName.clear();
        enterName.sendKeys(name);
    }
    public void Topics(String value){
        Select dropdown = new Select(enterTopic);
        dropdown.selectByValue(value);
    }
    public void clickRegister(){
        clickRegisterButton.click();
    }
    public String hello(){
        return helloHeading.getText();
    }
    public String welcome(){
        return welcomePara.getText();

    }

}

