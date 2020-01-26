package script;

import base.Base;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.SortBookByPriceLowToHigh;

public class SortBookByPriceLowToHighTest extends Base {

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void givenMethodForSortingBookByAscendingOrder() throws InterruptedException {
        SortBookByPriceLowToHigh check=new SortBookByPriceLowToHigh(driver);
        check.selectDropdownList();
        check.selectLowToHigh();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
