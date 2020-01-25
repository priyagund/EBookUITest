package script;

import base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class EBookTest extends Base {

    @BeforeTest
    public void setUp() {
        initialization();
    }

    @Test
    public void searchBookByTitle() throws InterruptedException {
     driver.findElement(By.xpath("//input[@placeholder='Search…']")).sendKeys("wings of fire");
     Thread.sleep(3000);
    }


}
