package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

public class Runner {


    @RunWith(Cucumber.class)
    @CucumberOptions(
            plugin = {"pretty","html:target/default-cucumber-report"},
            features = "src/test/resources/features",
            glue = "stepDefinitions",
            tags = "@now",
            dryRun = false
    )
    public class Runners {
    }
}