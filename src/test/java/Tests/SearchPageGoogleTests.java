package Tests;

import junit.framework.Assert;
import org.testng.annotations.Test;
import pages.SearchPageGoogle;

public class SearchPageGoogleTests {

    @Test
    public void successSearchTest() throws InterruptedException {
        SearchPageGoogle searchPageGoogle = new SearchPageGoogle();
        Assert.assertNotNull(searchPageGoogle);
        searchPageGoogle.fillSearchForm("ITEA");
        //Assert.assertEquals(searchPageGoogle.getAlertText(), "Результатов: примерно 2 880 000", "Expected message was not displayed");
        Assert.assertTrue(searchPageGoogle.verifyEqualsOfSearchElements(8));

    }

}
