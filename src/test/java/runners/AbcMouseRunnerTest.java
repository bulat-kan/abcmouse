package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},
        features = {
            "src/test/resources/features"
        },
        glue = {"step_definitions"},
        dryRun = false
)
public class AbcMouseRunnerTest {
}
