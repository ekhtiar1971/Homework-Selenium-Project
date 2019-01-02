import base.CommonApi;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class TestHome extends CommonApi {
    @Test
    public void test1()
    { driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("iphone");
    //click on search button for iphone
    driver.findElement(By.className("nav-input")).click();
    //nextpage and click
    driver.findElement(By.xpath("//span[@id='pagnNextString']")).click();
    }

}
