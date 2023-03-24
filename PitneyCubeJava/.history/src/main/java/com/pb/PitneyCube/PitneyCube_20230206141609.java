package com.pb.PitneyCube;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface PitneyCube extends Library {
	PitneyCube INSTANCE = (PitneyCube) Native.load(("PrinterandScaleAPI_x64"),
			PitneyCube.class);

	//// method to Establishes a communication connection with the printer
	int ConnectPrinterEx(int nInterface, String szPortName, int nBaudRate, int nDataBits, int nParity, int nStopBits);

	// Gets the current status of the printer
	int CheckStatus();

	// Get the weight
	int GetScaleWeight(byte[] pszWeight);

	// method to disconnect printer
	boolean DisconnectPrinter();

	// method to ScaleVersion
	int GetScaleVersion(byte[] pszVersion);

	// SetScaleUnit
	boolean SetScaleUnit();

	// SetScaleZero
	boolean SetScaleZero(int input);

	// GetScaleStatus
	int GetScaleStatus();

	// 13 printer mac address
	boolean GetPrinterMacAddress(byte[] macAddress);

	// Get RollType
	boolean GetRollType(byte[] rollType);

	// Get PrintCount
	int GetPrintCount();

	// setRecogniztionMode
	boolean SetMediaRecognitionMode(int noption);

	// reboot Printer
	boolean RebootPrinter();

	boolean GetScaleGravityInformation(byte[] gravity);
	boolean GetPrinterInformation (int nOption, byte[] pszInfo);
	Long GetPB_PrinterList (byte[] pszPrtList); 
	int GetPB_ProductNumber (byte[] Number); 
	int GetPB_SerialNumber (byte[] Number);
}
