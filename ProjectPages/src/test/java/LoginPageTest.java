import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPageTest {
    @Test
    public void loginTest () {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");

        LoginPage login = new LoginPage(driver);
        login.typeUserName();
        login.typePassword();
        login.clickOnLoginButton();

        driver.quit();


    }



}
