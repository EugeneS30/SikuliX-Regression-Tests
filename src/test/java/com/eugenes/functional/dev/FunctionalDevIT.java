package com.eugenes.functional.dev;

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
//                 tags = {"@wip"}, 
                 glue = {
                        "com.eugenes.functional.dev",
                        "au.com.permeance.test.functional.hook", 
                        "au.com.permeance.test.functional.stepdef",
                        "au.edu.wa.det.connect.test.functional.steps_dev", 
                        "au.edu.wa.det.connect.test.functional.steps",
                        "au.com.permeance.testing.functional.liferay", 
                        "au.edu.wa.det.connect.test.functional.hook",
                        "au.com.permeance.test.functional.steps"})

public class FunctionalDevIT {

}
