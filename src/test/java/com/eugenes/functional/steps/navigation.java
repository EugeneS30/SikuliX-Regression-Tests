package com.eugenes.functional.steps;


import org.springframework.stereotype.Component;

import com.eugenes.functional.configuration.BddGlue;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

@Component
public class navigation extends BddGlue {
    
    
    @Given("^I have navigated to website \"(.*?)\"$")
    public void i_have_navigated_to_the_website(String siteName) throws Exception {

        System.out.println("navigating to" + siteName);

    }
    
    
}
