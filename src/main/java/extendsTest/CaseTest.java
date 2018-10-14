package extendsTest;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CaseTest extends Team {
    @BeforeClass
    public static void beforeClass(){
        System.out.println("caseTest beforeClass");
    }

    @Before
    public void before(){
        System.out.println("before");
    }
    @Test
    public void test1(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @After
    public void after(){
        System.out.println("after");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("caseTest afterClass");
    }

}
