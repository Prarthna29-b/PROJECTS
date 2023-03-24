package com.pb;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import com.pb.controller.PitneyCubeController;
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

	@org.junit.jupiter.api.Test
	public void testConnect() {
		when(pitneycube
			.ConnectPrinterEx(2, null, 0, 0, 0, 0))
		.thenReturn(0);
		System.out.println(ps.connectPrinter(2, null, 0, 0, 0, 0));
	}
}