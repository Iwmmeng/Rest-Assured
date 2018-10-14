package extendsTest;

import org.junit.Before;
import org.junit.BeforeClass;

public class Company {
    @BeforeClass
    public static void beforeClass(){
        System.out.println(" company beforeClass");
    }

    @Before
    public void companyTest(){
        System.out.println("company before");
    }
}
