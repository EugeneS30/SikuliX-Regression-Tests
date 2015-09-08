package functional.dev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.Screen;

@RunWith(Suite.class)
@SuiteClasses({DoubleScreenTest.class, TestClass1.class})
public class TestClassParent {
    private static WebDriver driver;
    
        
    

}
