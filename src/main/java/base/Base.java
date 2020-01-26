package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Base implements AutoConfig{

    public WebDriver driver;
    static {
        System.setProperty(CHROME_KEY,CHROME_VALUE);
    }

    public void initialization(){
        driver = new ChromeDriver();
        String url = Library.getProperty(CONFIG_PATH,"URL");
        driver.manage().window().maximize();
        driver.get("http://192.168.0.161:3001/");
        String ITO = Library.getProperty(CONFIG_PATH,"ImplicitTimeOut");
        int timeoutPeriod = Integer.parseInt(ITO);
        driver.manage().timeouts().implicitlyWait(timeoutPeriod, TimeUnit.SECONDS);
    }

    public void tearDown(){
        driver.close();
    }
}
