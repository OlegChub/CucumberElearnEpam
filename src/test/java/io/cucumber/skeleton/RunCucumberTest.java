package io.cucumber.skeleton;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty", "html:target/CucumberReport/report.html",
                "json:target/CucumberReport/CucumberReport.json",
                "junit:target/CucumberReport/CucumberReport.xml"},
        monochrome = true,
        tags = ""
//        glue="src\\test\\java\\io\\cucumber\\skeleton",
//        features = "src\\test\\resources\\io\\cucumber\\skeleton"
)
public class RunCucumberTest {
}
