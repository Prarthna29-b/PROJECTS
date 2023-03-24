package com.pb.test;

import org.junit.jupiter.api.Test;

import com.pb.controller.PitneyCubeController;

public class TestCases {
    PitneyCubeController pcc = new PitneyCubeController();

    @Test
    public void testConnection() {

        assertEquals("No printers available to connect", pcc.connectPrinter());
    }

    @Test
    public void testWeight() {
        assertEquals(1, pcc.getScaleWeight());
    }

    // @Test
    // public void testDisconnect() {
    // Assert.assertTrue(pcc.disconnectPrinter());
    // }

}
