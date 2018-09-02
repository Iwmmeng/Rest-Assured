package page;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import sun.jvm.hotspot.debugger.Page;
import util.AppiumDriver;

public class Main {
    By login = By.id("user_profile_icon");


    public MyPage login(){
        AppiumDriver.driver.findElement(login).click();
        return new MyPage();







    }
}
