package co.com.qvision.retoautomatizacion.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/mas_barato.feature",
        glue = "co.com.qvision.retoautomatizacion.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class MasBaratoRunner {
}
