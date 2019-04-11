import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CategoryPageTest {
    @Test
    public void categoryTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");

        CategoryPage category = new CategoryPage(driver);
        category.clickOnCategory();
        category.clickOnProduct();

        driver.quit();

    }
}
