package com.pb.PitneyCube;

public class CubeImplementation {
	PitneyCube cubeDLL = PitneyCube.INSTANCE;
	public CubeResult connectPrinter() {
				CubeResult pc= new CubeResult();
		int res2 = cubeDLL.ConnectPrinterEx(
			2, new String(), 0, 0, 0, 0);
		try{
			if (res2 == 0)
				 pc.setResult(true);
			else if (res2 == 71)
				pc.setError("No printers available to connect");
			else if (res2 == 72)
				pc.setError("Not supported printer");
			else if (res2 == 73)
				pc.setError("The printer is in an error status");
			else
				throw new IllegalArgumentException();
		} catch (IllegalArgumentException unknownCommand) {
			System.out.println("Unknown Command");
		}
		return pc;

	}

	/*public CubeResult setScaleZero()  {
		CubeResult pc= new CubeResult();
		boolean res = cubeDLL.SetScaleUnit();
		try {
			if (res == true)
				;
			else if (res == false)
				throw new Exception("Set Scale Zero");
			else
				throw new IllegalArgumentException();

		} catch (IllegalArgumentException unknownCommand) {
			System.out.println("Unknown Command");
		}

	}*/

	public CubeResult checkStatus(CubeResult pc)  {

		int res = cubeDLL.CheckStatus();
		try {
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
				pc.setError("Auto-sensing failure (Gap detection error");
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

			else
				throw new IllegalArgumentException();

		} catch (IllegalArgumentException unknownCommand) {
			System.out.println("Unknown Command");
		}
		return pc;

	}

	public CubeResult getScaleWeight(CubeResult pc) {
		byte[] weight = new byte[48];
		 int res=cubeDLL.GetScaleWeight(weight);
		pc.setValue(res);
		return pc;
	}
	public CubeResult disconnectPrinter(CubeResult pc) {
		boolean res = cubeDLL.DisconnectPrinter();
		try {
			if (res == true)
			pc.setResult(true);
			else if (res == false)
				pc.setError("Set Scale Zero");
			else
				throw new IllegalArgumentException();

		} catch (IllegalArgumentException unknownCommand) {
			System.out.println("Unknown Command");
		}
		return pc;

	}
	public CubeResult getScaleVersion(CubeResult pc) {
		byte[] version = new byte[48];
		int s=cubeDLL.GetScaleVersion(version);
		pc.setValue(s);
		return pc;
	}
	public String GetScaleGravityInformation(CubeResult pc) {
		byte[] gravity = new byte[48];
		int gi=cubeDLL.GetScaleGravityInformation(gravity);
		pc.setValue(gi);
		return pc;	
	}*/
	public void SetScaleUnit() throws Exception {
		boolean res=cubeDLL.SetScaleUnit();
if ( res==true);
else 
throw new Exception("Set Scale Unit");
	}


	public String GetRollType() {
		byte[] rollType = new byte[48];
		cubeDLL.GetRollType(rollType);
		
	}

	public int getPrintCount () {
 int res=cubeDLL.GetPrintCount();
  return res;
	}
public 	String getPrinterList () 
{
	byte[] printerList  = new byte[48];
		cubeDLL.GetRollType(printerList);
		String s = new String(printerList, StandardCharsets.UTF_8);
		return s;
}

	public boolean setMediaRecognitionMode() {
 boolean result = cubeDLL.SetMediaRecognitionMode(0);
 return result;	
	}
/*public	int GetScaleStatus ()
{
 int res= 
}*/
public 	String GetPrinterInformation ()
{ 
	byte[] printerList  = new byte[48];
	cubeDLL.GetPrinterInformation(2,printerList);
	return s;
} 
public 	CubeResult getProductNumber(CubeResult pc)
{
	byte[] productNumber  = new byte[48];
	 int res=cubeDLL. GetPB_ProductNumber(productNumber);
	 int res1= (int) res;
	 pc.setValue( res);
	return pc;
 }
 public	CubeResult  getSerialNumber(CubeResult pc)
{
	byte[] serialNumber  = new byte[48];
	int  res = cubeDLL. GetPB_SerialNumber(serialNumber);
	pc.setValue(res);
	return pc;
}
	public CubeResult RebootPrinter(CubeResult pc) {
		boolean res=cubeDLL.RebootPrinter();
		try{
		if (res ==true)
		pc.setResult(true);
		else if(res==false)
		pc.setError("Reboot Printer");
		else
				throw new IllegalArgumentException();

		} catch (IllegalArgumentException unknownCommand) {
			System.out.println("Unknown Command");
	}

}
}
