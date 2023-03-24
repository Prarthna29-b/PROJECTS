package com.pb.PitneyCube;

import com.pb.PitneyCube.TestPitneyCubeJNI.printerandScaleAPI_x64;

public class PitneyService {
	printerandScaleAPI_x64 cubeDLL = printerandScaleAPI_x64.INSTANCE;
	public void connectPrinter(int nInterface , String nPortName, int nBaudRate, int nDataBits, int nParity,
			int nStopBits) throws Exception {
		
		int res2 =cubeDLL.ConnectPrinterEx(2, new String(), 0, 0, 0, 0);
		try
		{
			if(res2==0);
			else if(res2==71)
				throw new Exception("No printers available to connect");
			else if(res2==72)
				throw new Exception("Not supported printer");
			else if(res2==73)
				throw new Exception("The printer is in an error status");
			else 
	               throw new IllegalArgumentException();
	           
	       }
	        catch (IllegalArgumentException unknownCommand) {
	            System.out.println("Unknown Command");
	        }
		
		}
		}
	}
		/*/*public void SetScaleZero(int input) {
		boolean res=cubeDLL.SetScaleUnit();
		if(res==true)
			System.out.println("Successfull");
		else
			System.out.println("Unsuccessfull");	
	}
}*/

/*public void check() {
	
	int res = cubeDLL.CheckStatus();
if(res==0);
else if(res==1)
	throw new Exception("No Paper");
else if(res==2)
	throw new Exception("Cover Open");
	else if(res==3)
		throw new Exception(
		else 
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

}

public int scaleWeight() {
	
	byte [] weight = new byte[48];
	for (int i = 0; i < weight.length; i++) 
			System.out.println((char) weight[i]);
	System.out.println("ScaleWeight is " + cubeDLL.GetScaleWeight(weight));
}

public boolean disconnect() {
	if(service.isc)
}

public int scaleVersion() {
	
	return 0;
}



	public int CheckStatus() {
		
		return obj.check();
	}

	public int GetScaleWeight() {
		
		return obj.scaleWeight();
	}

	public boolean DisconnectPrinter() {
		return obj.disconnect();
	}

	public int GetScaleVersion(byte[] pszVersion) {
		return obj.scaleVersion();
	}

	public boolean GetScaleGravityInformation() {
		
		return obj.scaleGravityInformation();
	}

	public boolean SetScaleUnit() {
		
		return obj.scaleUnit();
	}

	public boolean SetScaleZero(int input) {
		
		return obj.scaleZero();
	}

	public int GetScaleStatus() {
		
		return obj.scaleStatus();
	}

	public boolean GetRollType(byte[] rollType) {
		
		return obj.rollType();
	}

	public int GetPrintCount() {
		
		return obj.printCount();
	}

	public boolean SetMediaRecognitionMode(int noption) {
		
		return obj.mediaRecognitionMode();
	}

	public boolean RebootPrinter() {
		
		return obj.reboot();
	}

	public int GetScaleWeight(byte[] pszWeight) {
		// TODO Auto-generated method stub
		return 0;
	}
	

}*/* */
