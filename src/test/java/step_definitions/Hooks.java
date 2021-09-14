package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.DriverManager;

public class Hooks {

    @Before
    public void beforeSteps(){

    }


    @After
    public void afterSteps(){
        DriverManager.closeDriver();
        System.out.println("to read Cucumber reports please open the link file at the address: test-output/SparkReport/CucumberReport.html" );
    }
}
