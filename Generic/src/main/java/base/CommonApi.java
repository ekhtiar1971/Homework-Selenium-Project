package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import java.util.concurrent.TimeUnit;

public class CommonApi {
    public WebDriver driver=null;
    @Parameters({"url"})
    @BeforeMethod
    public void setup(String url){

        System.setProperty("webdriver.chrome.driver", "/Users/shahnazpervin/Desktop/Tahsan/SelAutomation/driver/chromedriver");
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

    }

    @AfterMethod
    public void cleanUp(){
        driver.close();
    }
}
