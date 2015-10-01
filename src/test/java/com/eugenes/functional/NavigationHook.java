package com.eugenes.functional;

import javax.inject.Inject;

import com.eugenes.functional.configuration.BddGlue;
import com.eugenes.functional.Portal;
import cucumber.api.java.Before;

public class NavigationHook extends BddGlue {

    @Inject
    private Portal portal;

    @Before
    public void navigate() {
        portal.navigate();
    }
}
