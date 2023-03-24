package com.pb.test;

import com.pb.controller.PitneyCubeController;

public class TestCases {
    PitneyCubeController pcc=new PitneyCubeController();
    @Test
    public void testConnection()
    {
        AssertEquals("No printers available to connect",pcc.connectPrinter());  
    }

}
