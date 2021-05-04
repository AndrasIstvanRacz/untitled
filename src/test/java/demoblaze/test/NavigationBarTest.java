package demoblaze.test;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;



@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/NavigationBar.feature",
        glue = {"demoblaze.test.navigationbar",
                "demoblaze.test.setup"},
        plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
                "junit:target/cucumber-reports/Cucumber.xml",
                "html:target/cucumber-reports" },
        monochrome = true,
        strict = true)

public class NavigationBarTest {
}