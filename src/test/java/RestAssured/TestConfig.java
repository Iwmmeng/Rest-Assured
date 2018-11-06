package RestAssured;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

public class TestConfig {
    @Parameters({"a","b"})
    @BeforeSuite
    public void testBeforeSuite(int a,int b) {
        System.out.println("a +b = "+a+b);
        System.out.println("testBeforeSuite()");
    }

    @AfterSuite
    public void testAfterSuite() {
        System.out.println("testAfterSuite()");
    }

    @BeforeTest
    public void testBeforeTest() {
        System.out.println("testBeforeTest()");
    }

    @AfterTest
    public void testAfterTest() {
        System.out.println("testAfterTest()");
    }

}
