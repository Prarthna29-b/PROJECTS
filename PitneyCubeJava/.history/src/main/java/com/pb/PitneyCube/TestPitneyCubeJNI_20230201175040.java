package com.pb.PitneyCube;

import com.sun.jna.Library;
import com.sun.jna.Native;

public class TestPitneyCubeJNI {
	public interface printerandScaleAPI_x64  extends Library {
		printerandScaleAPI_x64 INSTANCE = (printerandScaleAPI_x64) Native.load(("PrinterandScaleAPI_x64"),
				printerandScaleAPI_x64.class);

		// method to Establishes a communication connection with the printer
		int ConnectPrinterEx(int nInterface, String szPortName, int nBaudRate, int nDataBits, int nParity,
				int nStopBits);

//Gets the current status of the printer
		int CheckStatus();

// Get the weight
		int GetScaleWeight(byte[] pszWeight);

		// method to disconnect printer
		boolean DisconnectPrinter();

		// method to ScaleVersion
		int GetScaleVersion(byte[] pszVersion);

		// Get Scale Gravity Information
		boolean GetScaleGravityInformation();

		// SetScaleGravityContent
		//boolean SetScaleGravityConstant(int data1, int data2);

		// SetScaleUnit
		boolean SetScaleUnit();

		// SetScaleZero
		boolean SetScaleZero(int input);

		// GetScaleStatus
		int GetScaleStatus();
// Get RollType
		boolean GetRollType (byte[] rollType);
		// Get PrintCount
		int GetPrintCount();

		// setRecogniztionMode
		boolean SetMediaRecognitionMode(int noption);

		// reboot Printer
		boolean RebootPrinter();
	}

	public static void main(String[] args) {
		printerandScaleAPI_x64 cubeDLL = printerandScaleAPI_x64.INSTANCE;

		int res2 = cubeDLL.ConnectPrinterEx(2, new String(), 0, 0, 0, 0);
		switch (res2) {
		case 0:
			System.out.println("Success to connect");
			break;
		case 71:
			System.out.println("No printers available to connect");
			break;
		case 72:
			System.out.println("Not supported printer");
			break;
		case 73:
			System.out.println("The printer is in an error status");
		}

		int res = cubeDLL.CheckStatus();

		switch (res) {
		case 0:
			System.out.println("Normal (no errors)");
			break;
		case 1:
			System.out.println("No Paper");
			break;
		case 2:
			System.out.println("Cover Open");
			break;
		case 3:
			System.out.println("Cutter jammed");
			break;
		case 4:
			System.out.println("TPH overheat");
			break;
		case 5:
			System.out.println("Auto-sensing failure (Gap detection error)");
			break;
		case 6:
			System.out.println("Ribbon end error");
			break;
		case 11:
			System.out.println("Board overheat");
			break;
		case 12:
			System.out.println("Motor overheat");
			break;
		case 13:
			System.out.println("Waiting for the label to be taken");
			break;
		case 30:
			System.out.println("Pause status");
			break;
		case 31:
			System.out.println("Roll near empty status");
			break;
		case 99:
			System.out.println("Unknown error");
	}
		byte [] weight = new byte[48];
		for (int i = 0; i < weight.length; i++) {
				System.out.println((char) weight[i]);	
		}
		byte[] rollType = new byte[16];
		for (int i = 0; i < rollType.length; i++)
		System.out.println((char) rollType[i]);
		System.out.println("ScaleWeight is " + cubeDLL.GetScaleWeight(weight));
		System.out.println("Printer Disconnection " + cubeDLL.DisconnectPrinter());
		byte[] version = new byte[48];
		for (int i = 0; i < version.length; i++)
		System.out.println((char) version[i]);
		System.out.println("Scale Version" + cubeDLL.GetScaleVersion(version));
		System.out.println("Get ScaleGravity Information " + cubeDLL.GetScaleGravityInformation());
		/*System.out.println("Set ScaleGravityContent " + cubeDLL.SetScaleGravityConstant(
		1,5));*/
		System.out.println("Set ScaleUnit " + cubeDLL.SetScaleUnit());
		System.out.println("Set ScaleZero " + cubeDLL.SetScaleZero(0));
		
		System.out.println("Get RollType " + cubeDLL.GetRollType(rollType));
		
		System.out.println("Print Count  " + cubeDLL.GetPrintCount());
	System.out.println("Set MediaRecognizationMode" +
	cubeDLL.SetMediaRecognitionMode(0));
		System.out.println("RebootPrinter  " + cubeDLL.RebootPrinter());
		
	}
}