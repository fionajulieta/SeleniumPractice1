package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber-report.html"},
        glue = {"StepDef"},
        features = {"src/test/java/features"}
)

public class CucumberRunner {
}