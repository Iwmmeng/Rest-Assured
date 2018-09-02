import io.appium.java_client.android.AndroidDriver;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class Android1 {
    private AndroidDriver driver;

    @Before
    public void setUp() throws MalformedURLException, InterruptedException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
//        desiredCapabilities.setCapability("app", "/Users/huamiumiu/Downloads/com.xueqiu.android_11.3_175.apk");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("deviceName", "ec6dc4ce");
        desiredCapabilities.setCapability("appActivity", ".view.WelcomeActivityAlias");
        desiredCapabilities.setCapability("appPackage", "com.xueqiu.android");
//        desiredCapabilities.setCapability("uiautomatorName", "uiautomator2");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
        Thread.sleep(3000);
    }

    @Test
    public void sampleTest() throws InterruptedException {
        Thread.sleep(3000);
        driver.findElementById("cancel").click();
        Thread.sleep(3000);

        driver.findElementByXPath("//*[@text='自选']").click();
        Thread.sleep(3000);

        driver.findElementById("tv_login_by_phone_or_others").click();
        driver.findElementById("register_phone_number").sendKeys("18910202406");
        driver.findElementById("register_code").sendKeys("18910202406");

        System.out.println(driver.getPageSource());

    }

    @After
    public void tearDown() {
        driver.quit();
    }



}
