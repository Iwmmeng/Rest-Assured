import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class SeleniumTest {
    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver","/Users/huamiumiu/code/Rest-Assured/src/main/Driver/chromedriver");

    }

    @BeforeMethod
    public void before(){
    }

    @Test
    public void assertTest(){
        WebDriver webDriver =  new ChromeDriver();
        webDriver.get("https://testerhome.com/account/sign_in");
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        webDriver.findElement(By.id("user_login")).sendKeys("834638005@qq.com");
        webDriver.findElement(By.id("user_password")).sendKeys("wam127821");
        webDriver.findElement(By.name("commit")).click();
        webDriver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        webDriver.findElement(By.cssSelector(".dropdown-avatar")).click();
        List list = new ArrayList();

        for(int i=0;i<webDriver.findElements(By.cssSelector(".dropdown-avatar .dropdown-menu li")).size();i++){
            list.add(webDriver.findElements(By.cssSelector(".dropdown-avatar .dropdown-menu li")).get(i).getText());
            System.out.println(list.get(i));
        }
        Assert.assertEquals(list.get(0),"wmmmeng","actual is: "+list.get(0)+"expect is : wmmmeng");
       Assert.assertEquals(list.get(2),"个人资料设置");
       Assert.assertEquals(list.get(3),"我的收藏");
       Assert.assertEquals(list.get(4),"记事本");
        webDriver.quit();


// webDriver.findElement(By.cssSelector(".dropdown-avatar .dropdown-menu li")).get(0).getText();



    }

//    @AfterMethod
//    public void after(){
//
//
//    }

}
