package com.eugenes.functional.configuration;

public interface Page {

    /**
     * @return A user friendly name for this page.
     */
    String name();

    /**
     * @return true if the browser is currently at this page
     */
    boolean at();

    /**
     * @return The window title for this page. This may, or may not, be the same as {@link #name()}
     */
    String pageTitle();

}
