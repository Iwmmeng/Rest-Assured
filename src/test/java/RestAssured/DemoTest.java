package RestAssured;

import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DemoTest {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("before class");
    }

    @Before
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

    @Before
    public void after(){
        System.out.println("after ");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("after class");
    }



}
