/**
 * Copyright (C) 2013 Permeance Technologies
 */
package com.eugenes.functional;

//import com.permeance.test.functional.page.Named;
import com.eugenes.functional.configuration.Page;

/**
 * @author tim.myerscough
 * 
 */
public interface Portlet {
    /**
     * Use navigateToPage instead
     * 
     * navigate() method will be removed in a future version.
     */
    @Deprecated
    void navigate();

    Page navigateToViewPage();

    boolean isVisible();

    /**
     * The name of the portlet, as specified in Feature Files.
     * 
     * Using the feature step: <code>And I have navigated to the "Login" Portlet</code> An
     * implementation of Portlet, with the name "Login" (case insensitive) will have
     * {@link #navigate()} invoked upon it.
     * 
     * @return The name of this portlet.
     * @See {@link au.com.permeance.testing.functional.liferay.steps.PortletMappings}
     */
    
    String name();
}
