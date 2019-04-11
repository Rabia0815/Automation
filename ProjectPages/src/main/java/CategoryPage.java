import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CategoryPage {

    WebDriver driver;
    By category = By.xpath("//*[@id=\"block_top_menu\"]/ul/li[1]/a");
    By product = By.xpath("//*[@id=\"center_column\"]/ul/li[7]/div/div[1]/div/a[1]/img");

    public CategoryPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnCategory () {
        driver.findElement(category).click();
    }

    public void clickOnProduct () {
        driver.findElement(product).click();
    }
}