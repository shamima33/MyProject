package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\workspace 4\\TestingDemo\\src\\test\\resources\\Features\\registration.feature"
        ,glue={"Steps"}
)

public class TestRunner {

}

