package com.eugenes.functional.hook;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class beforeAfter {
    private static WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
        System.out.println("running before...");
        driver = new ChromeDriver();
        // driver = new FirefoxDriver();
        driver.get("http://www.sikulix.com");
    }
    
    @After
    public void tearDown() {
        System.out.println("running after...");
        driver.close();
        driver.quit();
    }

}
