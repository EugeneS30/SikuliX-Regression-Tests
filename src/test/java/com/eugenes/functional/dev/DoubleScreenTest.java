package com.eugenes.functional.dev;

import org.junit.Test;
import org.sikuli.script.Screen;

public class DoubleScreenTest {
    
    @Test
    public void test11() {
        System.out.println("this is a test from Test2!!!");
        
        Screen sc = new Screen(1);
        sc.highlight(1);
    }

}
