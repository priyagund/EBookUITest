package script;
import base.AutoConfig;
import base.Base;
import base.JSONReader;
import org.openqa.selenium.By;
import org.testng.annotations.*;
import pages.SearchBook;

import java.io.IOException;

public class SearchBookTest extends Base {

    @DataProvider(name = "BookName")
    public Object[][] passData() throws IOException {
        return JSONReader.getdata(AutoConfig.FILEPATH,"BooksName", 3, 1);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test(dataProvider = "BookName")
    public void givenMethodForSearchBook(String BookName) throws InterruptedException {
        SearchBook search=new SearchBook(driver);
        search.searchBook(BookName);
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}


