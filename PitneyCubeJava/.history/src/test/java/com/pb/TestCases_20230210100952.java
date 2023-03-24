package com.pb;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
	PitneyCube pitneycube = PitneyCube.INSTANCE;

	@InjectMocks
	CubeImplementation ps;

	@BeforeEach
	public void setup() {
		MockitoAnnotations.openMocks(this);
	}

	@Test
	public void testConnect() {
		when(pitneycube
			.ConnectPrinterEx(2, null, 0, 0, 0, 0))
		.thenReturn(0);
		CubeResult ac= new CubeResult(true,0,null);
		CubeResult ex=ps.connectPrinter();
		assertEquals(ex.toString(), ac.toString());
	}
}