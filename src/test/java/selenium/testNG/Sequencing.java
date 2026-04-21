package selenium.testNG;

import org.testng.annotations.*;

public class Sequencing {

    //1.
    @BeforeSuite
    public void test1(){

        System.out.println("Before Suite");

    }

    //2.
    @BeforeTest
    public void test2(){

        System.out.println("Before Test");
    }


    @BeforeClass
    public void test3(){

        System.out.println("Before Class");
    }

    // Before methods run before each and every Test Case
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @Test
    public void actualTest1(){
        System.out.println("My Test Case 1");
    }

    @Test
    public void actualTest2(){
        System.out.println("My Test Case 2");
    }
    @Test
    public void actualTest3(){
        System.out.println("My Test Case 3");
    }

   // @AfterMethod
    //@AfterClass
    //@AfterTest
    //@AfterSuite



}
