package com.eugenes.functional.dev;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class cucumberBeforeHook {
    
    @Before
    public void beforeHook() {
        System.out.println("TEST START!!!");
        System.out.println("BEFORE hook");
    }
    
    @After
    public void afterHook() {
        System.out.println("AFTER hook");
        System.out.println("-------------------------------------------");
    }

}
