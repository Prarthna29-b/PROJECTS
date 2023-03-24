package com.pb.test;

import org.junit.Assert.assertEquals;

import com.pb.controller.PitneyCubeController;

public class TestCases {
    PitneyCubeController pcc=new PitneyCubeController();
    @Test
    public void testConnection()
    {
        assertEquals("No printers available to connect",pcc.connectPrinter());  
    }

}
