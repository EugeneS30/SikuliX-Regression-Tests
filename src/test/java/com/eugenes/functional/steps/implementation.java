package com.eugenes.functional.steps;

import org.springframework.stereotype.Component;

import com.eugenes.functional.configuration.BddGlue;

import cucumber.api.java.en.Given;

@Component
public class implementation extends BddGlue {
    
    @Given("^I run scenario one$")
    public void i_run_scenario_one() throws Throwable {
        System.out.println("TEST ONE");
    }
    
    @Given("^I run scenario two$")
    public void i_run_scenario_two() throws Throwable {
        System.out.println("TEST TWO");
    }
    
    
    @Given("^I have performed some background$")
    public void i_have_performed_some_background() throws Throwable {
        System.out.println("BACKGROUND TASKS");
    }
    
}
