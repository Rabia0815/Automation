import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    WebDriver driver;

    By username = By.id("email");
    By password = By.id("passwd");
    By loginButton = By.xpath("//*[@id=\"SubmitLogin\"]/span");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void typeUserName () {
        driver.findElement(username).sendKeys("annakachan1@gmail.com");
    }

    public void typePassword () {
        driver.findElement(password).sendKeys("lızka88");
    }

    public void clickOnLoginButton () {
        driver.findElement(loginButton).click();
    }
}
