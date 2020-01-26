package script;

import base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SortByLowPriceTest extends Base {
    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void givenMethodForSortingBookByAscendingOrder() throws InterruptedException {
        driver.findElement(By.xpath("//select[@id='sortByDropDown']")).click();
        Select select=new Select(driver.findElement(By.xpath("//select[@id='sortByDropDown']")));
        Thread.sleep(2000);
        select.selectByVisibleText("Price:low to high");
        Thread.sleep(2000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
