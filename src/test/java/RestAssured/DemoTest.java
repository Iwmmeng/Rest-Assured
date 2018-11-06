package RestAssured;





import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DemoTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @BeforeMethod
    public void before(){
        System.out.println("before ");
    }
    @Test
    public void test1(){
        System.out.println("test1 ");
    }

    @Test
    public void test2(){
        System.out.println("test2 ");
    }

    @BeforeMethod
    public void after(){
        System.out.println("after ");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }


}
