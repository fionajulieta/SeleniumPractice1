package StepDef;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;

public class HooksTwo extends Hooks {

//    @BeforeAll
//    public static void beforeAll(){
//        System.out.println("Start of ALL Scenario");
//    }
//
//    @AfterAll
//    public static void afterAll(){
//        System.out.println("End of ALL Scenario");
//    }

    @Before
    public void beforeTest() {
        System.out.println("Start of scenario");

    }

    @After
    public void afterTest() throws InterruptedException {
        System.out.println("End of scenario");
        Thread.sleep(2000);
        driver.close();
    }
}

