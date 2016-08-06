package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class SearchPageGoogle extends BasePage {
    private static int currentPage=1;

    @FindBy(id = "lst-ib")
    private WebElement searchValueField;
    @FindBy(id = "resultStats")
    private WebElement alertText;
    @FindBy(css=".rc")
    private List<WebElement> searchElements;
    @FindBy(id="pnnext")
    private WebElement nextButton;

    public SearchPageGoogle() {
        driver.get("https://www.google.com.ua");
        PageFactory.initElements(driver, this);
    }
   public void fillSearchForm(String searchValue){
       searchValueField.sendKeys(searchValue);
       searchValueField.sendKeys(Keys.RETURN);
       }
    public String getAlertText () throws InterruptedException {
        Thread.sleep(5000);
        return alertText.getText();
    }
    public boolean verifyEqualsOfSearchElements(int count){
        if(currentPage == 1) {
            new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(nextButton));
        }
        if (searchElements.size()==count){
            return true;
        }else
            return false;
    }
}
