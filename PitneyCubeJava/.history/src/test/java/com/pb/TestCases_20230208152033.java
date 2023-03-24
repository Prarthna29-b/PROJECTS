package com. pb;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import com.pb.controller.PitneyCubeController;
import com.pb.entity.CubeResult;
import com.pb.pitneyCube.PitneyCube;

public class TestCases {

	PitneyCubeController pcc = null;
	@BeforeEach
	void init() {
		pcc = new PitneyCubeController();
	}

	@Test
	public void testConnection() {
//		PitneyCube cubeDLL = PitneyCube.INSTANCE;
//		int res2 = cubeDLL.ConnectPrinterEx(2, new String(), 0, 0, 0, 0);
//		PitneyCubeController pcc = new PitneyCubeController();
//		try {
//			if (res2 == 0)
//				Assertions.assertTrue(pcc.connectPrinter().isResult());
//			if (res2 == 71)
//				Assertions.assertEquals("No printers available to connect", pcc.connectPrinter().getError());
//			if (res2 == 72)
//				Assertions.assertEquals("Not supported printer", pcc.connectPrinter().getError());
//			if (res2 == 73)
//				Assertions.assertEquals("The printer is in an error status", pcc.connectPrinter().getError());
//			// else
//			// Assertions.assertThrows(IllegalArgumentException.class,()->pcc.connectPrinter());
//		} catch (IllegalArgumentException unknownCommand) {
//			Assert.fail("Unknown Command");
//		}
		System.out.println(pcc.connectPrinter());
	}

	@Test
	public void testWeightValue() {
		PitneyCubeController pcc = new PitneyCubeController();
		Assertions.assertEquals(1, pcc.getScaleWeight().getValue());
		Assertions.assertTrue(pcc.getScaleWeight().isResult());
	}

	@Test
	public void testDisconnect() {
		PitneyCubeController pcc = new PitneyCubeController();
		CubeResult res = pcc.disconnectPrinter();
		Assertions.assertTrue(pcc.disconnectPrinter().isResult());
	}

	@Test
	public void testCheckstatus() {
		PitneyCube cubeDLL = PitneyCube.INSTANCE;
		int res = cubeDLL.CheckStatus();
		PitneyCubeController pcc = new PitneyCubeController();
		try {
			if (res == 0)
				Assertions.assertTrue(pcc.checkStatus().isResult());
			if (res == 1)
				Assertions.assertEquals("No Paper", pcc.checkStatus().getError());
			if (res == 2)
				Assertions.assertEquals("Cover Open", pcc.checkStatus().getError());

			if (res == 3)
				Assertions.assertEquals("Cutter jammed", pcc.checkStatus().getError());

			if (res == 4)
				Assertions.assertEquals("TPH overheat", pcc.checkStatus().getError());

			if (res == 5)
				Assertions.assertEquals("Auto-sensing failure Gap detection error", pcc.checkStatus().getError());

			if (res == 6)
				Assertions.assertEquals("Ribbon end error", pcc.checkStatus().getError());
			if (res == 11)
				Assertions.assertEquals("Board overheat", pcc.checkStatus().getError());
			if (res == 12)
				Assertions.assertEquals("Motor overheat", pcc.checkStatus().getError());
			if (res == 13)
				Assertions.assertEquals("Waiting for the label to be taken", pcc.checkStatus().getError());
			if (res == 30)
				Assertions.assertEquals("Pause status", pcc.checkStatus().getError());
			if (res == 31)
				Assertions.assertEquals("Roll near empty status", pcc.checkStatus().getError());
		} catch (IllegalArgumentException unknownCommand) {
			Assert.fail("Unknown Command");
		}
	}

	@Test
	public void testScaleVersion() {
		PitneyCubeController pcc = new PitneyCubeController();
		Assertions.assertEquals(1, pcc.getScaleVersion().getValue());
		Assertions.assertTrue(pcc.getScaleVersion().isResult());
	}

	@Test
	public void testPrintCount() {
		PitneyCubeController pcc = new PitneyCubeController();
		Assertions.assertEquals(0, pcc.getPrintCount().getValue());
	}
}
