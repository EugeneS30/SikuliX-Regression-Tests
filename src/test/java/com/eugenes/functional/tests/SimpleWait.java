package com.eugenes.functional.tests;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.basics.Settings;
import org.sikuli.script.FindFailed;
import org.sikuli.script.ImageFind;
import org.sikuli.script.ImageFinder;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Region;
import org.sikuli.script.Screen; 

public class SimpleWait {
    private WebDriver driver;
    
    @Before
    public void setUp() {
        driver = new FirefoxDriver();
        driver.get("http://www.sikulix.com");
        ImagePath.setBundlePath(System.getProperty("user.dir") + "\\src\\test\\resources\\patterns");
         
    }
    
    @Test
    public void test1() throws FindFailed {
        String workingDir = System.getProperty("user.dir");
        System.out.println("Current working directory : " + workingDir);
        System.out.println("Starting Test");
        Screen sc = new Screen();
        Region reg = sc;
        
        sc.wait("SikuliXLogo.png");
        
    }
    
    @After
    public void tearDown() {
        driver.close();
        driver.quit();
    }
    

}
