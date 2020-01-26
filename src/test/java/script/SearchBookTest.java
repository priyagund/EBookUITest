package script;
import base.AutoConfig;
import base.Base;
import base.JSONReader;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import java.io.IOException;

public class searchBookTest extends Base {

    @DataProvider(name = "BookName")
    public Object[][] passData() throws IOException {
        return JSONReader.getdata(AutoConfig.FILEPATH,"BooksName", 3, 2);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test(dataProvider = "BookName")
    public void givenMethodForSearchBook(String BookName,String Price) throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Search…']")).sendKeys(BookName);
        Thread.sleep(4000);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


