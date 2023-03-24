package com.pb;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.nio.charset.StandardCharsets;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import com.pb.entity.CubeResult;
import com.pb.implementation.CubeImplementation;
import com.pb.pitneyCube.PitneyCube;

public class TestCases {

	@Mock
	PitneyCube mocked = PitneyCube.INSTANCE;

	@InjectMocks
	CubeImplementation ps;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testConnectionSuccess() {
		CubeResult expected = new CubeResult(true,null,null);
	Mockito.lenient(). when(mocked
				.ConnectPrinterEx(0, null, 0, 0, 0, 0))
				.thenReturn(0);
		
		CubeResult actual = ps.connectPrinter(0, null, 0, 0, 0, 0);
		assertEquals(expected.toString(), actual.toString());
	}

	@Test
	public void testNoPrinter()
	 {

		when(mocked
			.ConnectPrinterEx(2, null, 0, 0, 0, 0))
			.thenReturn(71);
		CubeResult except= new CubeResult(false,null,"No printers available to connect");
		CubeResult actual=ps.connectPrinter(2, null, 0, 0, 0, 0);
		assertEquals(except.toString(), actual.toString());
	}

	@Test
	public void testPrinterSupport() {
		when(mocked
				.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(72);
		CubeResult ex = new CubeResult(false,null, "Not supported printer");
		CubeResult ac = ps.connectPrinter(2, null, 0, 0, 0, 0);
		
		assertEquals(ex.toString(), ac.toString());
	}

	@Test
	public void testPrinterStatus() {
		when(mocked
				.ConnectPrinterEx(2, null, 0, 0, 0, 0)).thenReturn(73);
		CubeResult ex = new CubeResult(false, null, "The printer is in an error status");
		CubeResult ac = ps.connectPrinter(2, null, 0, 0, 0, 0);
		assertEquals(ex.toString(), ac.toString());
	}
	@Test
	public void testWeights() {

	byte[] weight = new byte[48];
	String w = new String(weight, StandardCharsets.UTF_8);
	when(mocked.GetScaleWeight(weight)).thenReturn(1);
	CubeResult ex = new CubeResult(true, w, null);
	CubeResult ac = ps.getScaleWeight();
	System.out.println(ac);
	System.out.println(ex);
	assertEquals(ex.toString(), ac.toString());
	}
	@Test
	public void testWeightsFails() {

	byte[] weight = new byte[48];
	when(mocked.GetScaleWeight(weight)).thenReturn(0);
	CubeResult ex = new CubeResult(false, null, null);
	CubeResult ac = ps.getScaleWeight();
	assertEquals(ex.toString(), ac.toString());
	}

	@Test
	public void testVersion() {
	byte[] version = new byte[48];
	String w = new String(weight, StandardCharsets.UTF_8);
	doReturn(true).when(mocked).GetScaleVersion(version);
	CubeResult ex = new CubeResult(true, "", null);
	CubeResult ac = ps.getScaleVersion();
	assertEquals(ex.toString(), ac.toString());
	}

	@Test
	public void testFailVersion() {
	byte[] version = new byte[48];
	doReturn(false).when(mocked).GetScaleVersion(version);
	CubeResult ex = new CubeResult(false, null, null);
	CubeResult ac = ps.getScaleVersion();
	assertEquals(ex.toString(), ac.toString());
	}

	// @Test
	// public void testPrintCount()
	// {
	// when(mocked.GetPrintCount()).thenReturn(1);
	// CubeResult ex= new CubeResult(true,1,null);
	// CubeResult ac=ps.getPrintCount();
	// assertEquals(ex.toString(), ac.toString());
	// }

	@Test
	public void testDisconnect()
	{
	when(mocked.DisconnectPrinter()).thenReturn(true);
	CubeResult ex= new CubeResult(true,null,null);
	CubeResult ac=ps.disconnectPrinter();
	assertEquals(ex.toString(), ac.toString());
	}
	@Test
	public void testDisconnectFail()
	{
	when(mocked.DisconnectPrinter()).thenReturn(false);
	CubeResult ex= new CubeResult(false,null,null);
	CubeResult ac=ps.disconnectPrinter();
	assertEquals(ex.toString(), ac.toString());
	}
	@Test
	public void testStatus0()
	{
	when(mocked.CheckStatus()).thenReturn(0);
	CubeResult ex= new CubeResult(true,null,null);
	CubeResult ac=ps.checkStatus();
	assertEquals(ex.toString(), ac.toString());
	}
	@Test
	public void testStatus1()
	{
	when(mocked.CheckStatus()).thenReturn(1);
	CubeResult ex= new CubeResult(false,null,"No Paper");
	CubeResult ac=ps.checkStatus();
	assertEquals(ex.toString(), ac.toString());
	}
	@Test
	public void testStatus2()
	{
	when(mocked.CheckStatus()).thenReturn(2);
	CubeResult ex= new CubeResult(false,null,"Cover Open");
	CubeResult ac=ps.checkStatus();
	assertEquals(ex.toString(), ac.toString());
	}
}
