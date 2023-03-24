package com.pb.PitneyCube;

public class PitneyCubeMainClass  {
	
	public static void main(String args[]) throws Exception	
	{
		PitneyService ps=new PitneyService();
		ps.getConnectPrinter(2, new String(), 0, 0, 0, 0);
		/*ps.checkStatus();
		System.out.println(ps.getScaleWeight());
		System.out.println(ps.GetPrinterInformation());
		System.out.println(ps.getScaleVersion());
		//System.out.println(ps.getSerialNumber());
		//System.out.println(ps.getProductNumber());
		System.out.println(ps.GetScaleGravityInformation());
		System.out.println(ps.getPrinterList());
		System.out.println(ps.getPrintCount());
		ps. disconnectPrinter();
		//ps.setScaleZero();*/
	}
}