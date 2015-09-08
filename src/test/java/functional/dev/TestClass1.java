package functional.dev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.Screen;

public class TestClass1 {
    public static WebDriver driver;
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
        System.out.println("running before...");
        driver = new ChromeDriver();
//        driver = new FirefoxDriver();
        driver.get("http://www.sikulix.com");
    }
    
    @Test
    public void test1() {
        System.out.println("Starting Test");
        Screen sc = new Screen();
        sc.highlight(1);
    }
    
    @After
    public void tearDown() {
        System.out.println("running after...");
        driver.close();
        driver.quit();
    }

}
