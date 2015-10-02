package com.eugenes.functional.dev;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.basics.Settings;
import org.sikuli.script.ImageLocator;
import org.sikuli.script.ImagePath;
import org.sikuli.script.Screen;

import com.eugenes.functional.tests.SimpleWait;

@RunWith(Suite.class)
@SuiteClasses({SimpleWait.class})
public class TestClassParent {
    private static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
        System.out.println("running before...");
        driver = new ChromeDriver();
        driver.get("http://www.sikulix.com");
        driver.manage().window().maximize();
//        Settings.BundlePath = "C:\\workspace\\Projects\\SikuliX-Regression-Tests\\src\\test\resources\\patterns";
c:        ImagePath.setBundlePath("C:\\workspace\\Projects\\SikuliX-Regression-Tests\\src\\test\resources\\patterns");
            }
    
    @AfterClass
    public static void tearDown() {
        System.out.println("running after...");
        driver.close();
        driver.quit();
    }

}
