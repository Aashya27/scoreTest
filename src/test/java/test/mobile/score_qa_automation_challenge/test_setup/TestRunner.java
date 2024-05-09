package test.mobile.score_qa_automation_challenge.test_setup;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber-reports.html","json:target/cucumber.json",
        "html:target/cucumber","rerun:target/rerun.txt"},
        features = "src/test/resources/features/ScoreTestScenarios.feature",
        glue = {"classpath:test.mobile.score_qa_automation_challenge.test_setup", "classpath:test.mobile.score_qa_automation_challenge.stepdefs"},
        tags = "@SanityTests")
public class TestRunner {
}