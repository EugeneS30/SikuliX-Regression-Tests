package com.eugenes.functional;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

/**
 * This is useful for running in Eclipse to focus on scenarios in development rather than running
 * the whole test suite.
 *
 * Only scenarios tagged with @wip will be executed.
 *
 */

@RunWith(Cucumber.class)
@CucumberOptions(dryRun = false, 
                 strict = true, 
                 features = {"classpath:sikulix_features"}, 
                 format = {"json:target/cucumber-dev/cucumber.json", "pretty"}, 
                 monochrome = true, 
                 glue = {
                        "com.eugenes.functional.steps"
                        }
                )

public class FunctionalDevIT {

}
