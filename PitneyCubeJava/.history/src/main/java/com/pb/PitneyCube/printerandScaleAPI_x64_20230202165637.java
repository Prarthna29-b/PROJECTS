package com.pb.PitneyCube;

import com.sun.jna.Library;
import com.sun.jna.Native;

public interface printerandScaleAPI_x64  extends Library {
	printerandScaleAPI_x64 INSTANCE = (printerandScaleAPI_x64) Native.load(("PrinterandScaleAPI_x64"),
			printerandScaleAPI_x64.class);

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

	// Get Scale Gravity Information
	boolean GetScaleGravityInformation();

	// SetScaleUnit
	boolean SetScaleUnit();

	// SetScaleZero
	boolean SetScaleZero(int input);

	// GetScaleStatus
	int GetScaleStatus();

	// Get RollType
	boolean GetRollType(byte[] rollType);

	// Get PrintCount
	int GetPrintCount();

	// setRecogniztionMode
	boolean SetMediaRecognitionMode(int noption);

	// reboot Printer
	boolean RebootPrinter();

}
