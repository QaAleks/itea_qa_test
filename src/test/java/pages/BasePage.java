package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasePage {
    protected static WebDriver driver = new FirefoxDriver();
    public BasePage() {
    }
}
