import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProductPageTest {
    @Test
    public void addTest() {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php?id_product=7&controller=product");

        ProductPage product = new ProductPage(driver);
        product.clickOnAdd();
        product.clickOnCheckout();

        driver.quit();


    }
}
