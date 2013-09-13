package com.mycompany.app;

import org.testng.*;
import org.testng.annotations.*;
 
public class DemoTest {
 
    @BeforeClass
    public void setUp() {
       // code that will be invoked when this test is instantiated
    }
    
    @Test(groups = { "fast" })
    public void aFastTest() {
       System.out.println("Fast test");
    }
    
    @Test(groups = { "slow" })
    public void aSlowTest() {
        System.out.println("Slow test");
    }
    
    @Test
    public void aBooleanTest() {
        Assert.assertTrue( true );
    }
 
}
