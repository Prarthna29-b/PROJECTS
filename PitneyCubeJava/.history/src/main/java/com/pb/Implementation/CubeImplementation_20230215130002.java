package com.pb.implementation;

import java.nio.ByteBuffer;

import com.pb.entity.CubeResult;
import com.pb.pitneyCube.PitneyCube;

public class CubeImplementation {
	PitneyCube cubeDLL = PitneyCube.INSTANCE;
	

	public CubeResult connectPrinter(int i, String s, int j, int k, int l, int m) {
		CubeResult	pc = new CubeResult(false, 0, null);
		int res2 = cubeDLL.ConnectPrinterEx(i,s,j,k,l,m);
			if (res2 == 0)
				pc.setResult(true);
			else if (res2 == 71)
				pc.setError("No printers available to connect");
			else if (res2 == 72)
				pc.setError("Not supported printer");
			else if (res2 == 73)
				pc.setError("The printer is in an error status");
		return pc;
	}

	public CubeResult setScaleZero() {
		CubeResult	pc = new CubeResult(false, 0, null);
		boolean res = cubeDLL.SetScaleZero();
			if (res)
				pc.setResult(res);
			else
				pc.setError("Set Scale Zero");
		return pc;

	}

	public CubeResult checkStatus() {
		CubeResult	pc = new CubeResult(false, 0, null);
		int res = cubeDLL.CheckStatus();
			if (res == 0)
				pc.setResult(true);
			else if (res == 1)
				pc.setError("No Paper");
			else if (res == 2)
				pc.setError("Cover Open");
			else if (res == 3)
				pc.setError("Cutter jammed");
			else if (res == 4)
				pc.setError("TPH overheat");
			else if (res == 5)
				pc.setError("Auto-sensing failure Gap detection error");
			else if (res == 6)
				pc.setError("Ribbon end error");
			else if (res == 11)
				pc.setError("Board overheat");
			else if (res == 12)
				pc.setError("Motor overheat");
			else if (res == 13)
				pc.setError("Waiting for the label to be taken");
			else if (res == 30)
				pc.setError("Pause status");
			else if (res == 31)
				pc.setError("Roll near empty status");

		return pc;

	}

	public CubeResult getScaleWeight() {
		CubeResult pc = new CubeResult(false, 0, null);
		byte[] weight = new byte[48];
		int res = cubeDLL.GetScaleWeight(weight);
		if(res == 1){
		pc.setResult(true);
		ByteBuffer wrapped = ByteBuffer.wrap(weight);
		int w = wrapped.getInt();
		pc.setValue(w);
		}
		return pc;
	}

	public CubeResult disconnectPrinter() {
		CubeResult	pc = new CubeResult(false, 0, null);
		boolean res = cubeDLL.DisconnectPrinter();
		if (res)
			pc.setResult(res);
		return pc;

	}

	public CubeResult getScaleVersion() {
		CubeResult pc = new CubeResult(false, 0, null);
		 version = new byte[48];
		boolean res = cubeDLL.GetScaleVersion(version);
		if(res)
		{
		pc.setResult(true);
		ByteBuffer wrapped = ByteBuffer.wrap(version);
		int s = wrapped.getInt();
		pc.setValue(s);
		}
		return pc;
	}

	public CubeResult getScaleGravityInformation() {
		CubeResult	pc = new CubeResult(false, 0, null);
		byte[] gravity = new byte[48];
		int gi = cubeDLL.GetScaleGravityInformation(gravity);
		pc.setValue(gi);
		return pc;
	}

	public CubeResult setScaleUnit() {
		CubeResult	pc = new CubeResult(false, 0, null);
		boolean res = cubeDLL.SetScaleUnit();
		if (res)
			pc.setResult(res);
		else
			pc.setError("Set Scale Unit");
		return pc;
	}

	public CubeResult GetRollType() {
		CubeResult	pc = new CubeResult(false, 0, null);
		byte[] rollType = new byte[48];
		int res = cubeDLL.GetRollType(rollType);
		if(res==1)
		pc.setValue(res);
		return pc;
	}

	public CubeResult getPrintCount() {
		CubeResult	pc = new CubeResult(false, 0, null);
		int res = cubeDLL.GetPrintCount();
		pc.setValue(res);
		pc.setResult(true);
		return pc;
	}	
	public CubeResult getProductNumber() {
		CubeResult	pc = new CubeResult(false, 0, null);
		byte[] productNumber = new byte[48];
		int res = cubeDLL.GetPB_ProductNumber(productNumber);
		pc.setValue(res);
		return pc;
	}

	public CubeResult getSerialNumber() {
		CubeResult	pc = new CubeResult(false, 0, null);
		byte[] serialNumber = new byte[48];
		int res = cubeDLL.GetPB_SerialNumber(serialNumber);
		pc.setValue(res);
		return pc;
	}

	public CubeResult rebootPrinter() {
		CubeResult	pc = new CubeResult(false, 0, null);
		boolean res = cubeDLL.RebootPrinter();

			if (res)
				pc.setResult(true);
			else
				pc.setError("Reboot Printer");
	
		return pc;

	}
}