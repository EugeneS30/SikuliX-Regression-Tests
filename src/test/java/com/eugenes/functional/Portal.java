/**
 * Copyright (C) 2013 Permeance Technologies
 */
package com.eugenes.functional;

import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;

import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.springframework.stereotype.Component;

import com.eugenes.functional.configuration.SeleniumConfig;
import com.eugenes.functional.configuration.Page;
//import au.com.permeance.testing.functional.liferay.portlet.login.LoginPortlet;

@Component
//@Slf4j
public class Portal  { //implements Portlet, Page {

    @Inject
    private WebDriver driver;

    @Inject
    private SeleniumConfig config;

//    @Inject
//    private LoginPortlet login;

//    @Override
    public void navigate() {

        try {
            driver.get(config.baseurl());
        } catch (TimeoutException e) {
            // Retry once. There may be an initial connection issue.
            driver.get(config.baseurl());

        }
//        log.info("Navigated to {}", driver.getCurrentUrl());
    }

//    @Override
    public boolean isVisible() {
        // The portal should always be visible!
        return true;
    }

//    public LoginPortlet getLogin() {
//        return login;
//    }

//    @Override
//    public boolean at() {
//        throw new UnsupportedOperationException("TODO");
//    }

//    @Override
//    public String pageTitle() {
//        throw new UnsupportedOperationException("TODO");
//    }

//    @Override
    public String name() {
        return "";
    }

//    @Override
//    public Page navigateToViewPage() {
//        // TODO - refactor to PageObject pattern
//        navigate();
//        return this;
//    }

}
