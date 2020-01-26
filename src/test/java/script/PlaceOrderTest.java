package script;

import base.AutoConfig;
import base.Base;
import base.JSONReader;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.AddToCart;
import pages.PlaceOrder;
import java.io.IOException;

public class PlaceOrderTest extends Base {

    @DataProvider(name = "customerDetail")
    public Object[][] passData() throws IOException {
        return JSONReader.getdata(AutoConfig.CustomerDetails,"customerDetail", 2, 7);
    }

    @BeforeMethod
    public void setUp() {
        initialization();
    }

    @Test(dataProvider = "customerDetail")
    public void givenMethodForOrderIsPlacedOrNot(String name,String phone,String email,
                                                 String city,String address,String pincode,String landmark) throws InterruptedException {

        PlaceOrder order=new PlaceOrder(driver);
        AddToCart cart=new AddToCart(driver);
        cart.setAddToBag();
        cart.getCartButton();
        order.setOrderButton();
        order.setName(name);
        order.setPincode(pincode);
        order.setAddress(address);
        order.setCity(city);
        order.setEmail(email);
        order.setLandmark(landmark);
        order.setPhone(phone);

        Thread.sleep(5200);
        order.setRadioButton();
        Thread.sleep(2000);
        order.setContinueButton();
        Thread.sleep(2000);
        order.setCheckOut();
        Thread.sleep(3000);
        order.setCheckOut();
        Thread.sleep(3000);
        order.setContShoppingButton();
        Thread.sleep(3000);

    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
