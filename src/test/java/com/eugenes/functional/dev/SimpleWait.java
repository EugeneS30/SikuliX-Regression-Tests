package com.eugenes.functional.dev;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Region;
import org.sikuli.script.Screen; 

public class SimpleWait {
    public static WebDriver driver;
    
    
    @Test
    public void test1() throws FindFailed {
        System.out.println("Starting Test");
        Screen sc = new Screen();
        Region reg = sc;
        
        sc.wait("SikuliXLogo.png");
        
    }
    

}
