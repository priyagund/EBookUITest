package script;
import base.Base;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.AddToCart;

public class AddToCartTest extends Base {
    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test
    public void givenMethodForBookAddIntoCartOrNot() throws InterruptedException {
        AddToCart cart=new AddToCart(driver);
        cart.setAddToBag();
        cart.setAddToBag1();
        cart.getCartButton();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
