package com.pb.PitneyCube;

import java.nio.charset.StandardCharsets;

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
		/*public void setScaleZero(int input) throws Exception{
		boolean res=cubeDLL.SetScaleUnit(0);
		try{
		if(res==true);
		else if(res==false)
			throw new Exception("Set Scale Zero");	
			else 
			        throw new IllegalArgumentException();
	           
	       }
	        catch (IllegalArgumentException unknownCommand) {
	            System.out.println("Unknown Command");
	        }
		
		}*/
	

public void checkStatus() throws Exception {
	
	int res = cubeDLL.CheckStatus();
	try{
if(res==0);
else if(res==1)
	throw new Exception("No Paper");
else if(res==2)
	throw new Exception("Cover Open");
	else if(res==3)
		throw new Exception("Cutter jammed");
		else if(res==4)
		throw new Exception("TPH overheat");
	else if(res==5)
	throw new Exception("Auto-sensing failure (Gap detection error");
		else if(res==6)
		throw new Exception("Ribbon end error");
	else if(res==11)
	throw new Exception("Board overheat");
	else if(res==12)
	throw new Exception("Motor overheat");
	else if(res==13)
	throw new Exception("Waiting for the label to be taken");
	else if(res==30)
	throw new Exception("Pause status");
	else if(res==31)
	throw new Exception("Roll near empty status");
	
		else 
	               throw new IllegalArgumentException();
	           
	       }
	        catch (IllegalArgumentException unknownCommand) {
	            System.out.println("Unknown Command");
	        }
		
		}

public String getScaleWeight() {
	byte [] weight = new byte[48];
		String s= new String(weight,StandardCharsets.UTF_8);		
	return s;	
}
public void disconnectPrinter() throws Exception {
	boolean res= cubeDLL.DisconnectPrinter();
	try{
		if(res==true);
		else if(res==false)
			throw new Exception("Set Scale Zero");	
			else 
			        throw new IllegalArgumentException();
	           
	       }
	        catch (IllegalArgumentException unknownCommand) {
	            System.out.println("Unknown Command");
	        }
		
		}
}

/*public int scaleVersion() {
	
	return 0;
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

	
	

}*/
