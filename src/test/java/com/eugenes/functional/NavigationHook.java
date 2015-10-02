package com.eugenes.functional;

import lombok.extern.slf4j.Slf4j;

import com.eugenes.functional.configuration.BddGlue;

import cucumber.api.java.Before;

@Slf4j
public class NavigationHook extends BddGlue {

//    @Inject
//    private Portal portal;

    @Before
    public void navigate() {
        log.info("heeello");
//        portal.navigate();
    }
}
