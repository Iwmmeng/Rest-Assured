package extendsTest;

import org.junit.Before;
import org.junit.BeforeClass;

public class Team  extends Company{
    @BeforeClass
    public static void beforeClass(){
        System.out.println("team beforeClass");
    }
    @Before
    public void teamTest(){
        System.out.println("team before");
    }

}
