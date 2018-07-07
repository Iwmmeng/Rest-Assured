import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ChromeDriverTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","/Users/huamiumiu/code/Rest-Assured/src/main/Driver/chromedriver");
        WebDriver webDriver =  new ChromeDriver();
        webDriver.get("https://bj.lianjia.com/");
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.id("keyword-box")).sendKeys("上地");

        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.findElement(By.id("findHouse")).click();

    }

}
