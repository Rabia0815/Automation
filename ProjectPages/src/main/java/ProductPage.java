import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage {
    WebDriver driver;

    By add = By.xpath("//*[@id=\"add_to_cart\"]/button/span");
    By checkout = By.xpath("//*[@id=\"product\"]");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAdd () {
        driver.findElement(add).click();
    }

    public void clickOnCheckout () {
        driver.findElement(checkout).click();
    }
}
