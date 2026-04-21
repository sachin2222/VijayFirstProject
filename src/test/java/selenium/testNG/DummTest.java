package selenium.testNG;

import org.testng.annotations.Test;

public class DummTest {


    @Test(groups={"smoke","Regression"})
    public void test1(){

    }
    @Test(groups={"sanity","Regression"})
    public void test2(){

    }

    @Test(groups="smoke")
    public void test3(){

    }


    @Test(groups="sanity")
    public void test4(){

    }


    @Test(groups="Regression")
    public void test5(){

    }

}
