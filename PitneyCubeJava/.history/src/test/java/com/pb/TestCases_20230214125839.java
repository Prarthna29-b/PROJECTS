package com.pb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import com.pb.entity.CubeResult;
import com.pb.implementation.CubeImplementation;
import com.pb.pitneyCube.PitneyCube;

public class TestCases {

	@Mock
	PitneyCube mock = PitneyCube.INSTANCE;

	@InjectMocks
	CubeImplementation ps;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testConnectionSuccess() {
		CubeResult expected = new CubeResult(true,0,null);
	when(mock
				.ConnectPrinterEx(0, null, 0, 0, 0, 0))
				.thenReturn(0);
		
		CubeResult actual = ps.connectPrinter(0, null, 0, 0, 0, 0);
		assertEquals(expected.toString(), actual.toString());
	}

	@Test
	public void testNoPrinter()
	 {

		when(mock
			.ConnectPrinterEx(2, null, 0, 0, 0, 0))
			.thenReturn(71);
		CubeResult except= new CubeResult(false,0,"No printers available to connect");
		CubeResult actual=ps.connectPrinter(2, null, 0, 0, 0, 0);
		assertEquals(except.toString(), actual.toString());
	}

	@Test
	public void testPrinterSupport() {
		when(mock
				.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(72);
		CubeResult ex = new CubeResult(false, 0, "Not supported printer");
		CubeResult ac = ps.connectPrinter(2, null, 0, 0, 0, 0);
		
		assertEquals(ex.toString(), ac.toString());
	}

	@Test
	public void testPrinterStatus() {
		when(mock
				.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(73);
		CubeResult ex = new CubeResult(false, 0, "The printer is in an error status");
		CubeResult ac = ps.connectPrinter(2, null, 0, 0, 0, 0);
		assertEquals(ex.toString(), ac.toString());
	}
	// @Test
	// public void testWeights() {

	// byte[] weight = new byte[48];
	// when(mock.GetScaleWeight(weight)).thenReturn(1);
	// CubeResult ex = new CubeResult(true, 0, null);
	// CubeResult ac = ps.getScaleWeight();
	// assertEquals(ex.toString(), ac.toString());
	// }

	@Test
	public void testVersion() {
	byte[] version = new byte[48];
	doReturn(true).when(mock).GetScaleVersion(version);
	CubeResult ex = new CubeResult(true, 0, null);
	CubeResult ac = ps.getScaleVersion(version);
	System.out.println(ac);
	assertEquals(ex.toString(), ac.toString());
	}

	// @Test
	// public void testFailVersion() {
	// byte[] version = new byte[48];
	// doReturn(false).when(mock).GetScaleVersion(version);
	// CubeResult ex = new CubeResult(false, 0, null);
	// CubeResult ac = ps.getScaleVersion(version);
	// assertEquals(ex.toString(), ac.toString());
	// }

	// @Test
	// public void testPrintCount()
	// {
	// when(mock.GetPrintCount()).thenReturn(1);
	// CubeResult ex= new CubeResult(true,0,null);
	// // ps = new CubeImplementation();
	// CubeResult ac=ps.getPrintCount();
	// assertEquals(ex.toString(), ac.toString());
	// }

	// @Test
	// public void testDisconnect()
	// {
	// when(mock.DisconnectPrinter()).thenReturn(true);
	// CubeResult ex= new CubeResult(true,0,null);
	// // ps=new CubeImplementation();
	// CubeResult ac=ps.disconnectPrinter();
	// assertEquals(ex.toString(), ac.toString());
	// }
	// @Test
	// public void testStatus0()
	// {
	// when(mock.CheckStatus()).thenReturn(0);
	// CubeResult ex= new CubeResult(true,0,null);
	// CubeResult ac=ps.checkStatus();
	// assertEquals(ex.toString(), ac.toString());
	// }
	// @Test
	// public void testStatus1()
	// {
	// when(mock.CheckStatus()).thenReturn(1);
	// CubeResult ex= new CubeResult(false,0,"No Paper");
	// CubeResult ac=ps.checkStatus();
	// assertEquals(ex.toString(), ac.toString());
	// }
}
