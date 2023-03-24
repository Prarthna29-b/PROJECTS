package com.pb.PitneyCube;

public class PitneyCubeMainClass  {
	
	public static void main(String args[]) throws Exception	
	{
		PitneyCubeController pcc=new PitneyCubeController();
		System.out.println(pcc.connectPrinter());
		System.out.println(pcc.checkStatus());
		System.out.println(pcc.getScaleWeight());
		System.out.println(pcc.GetPrinterInformation());
		System.out.println(ps.getScaleVersion());
		//System.out.println(ps.getSerialNumber());
		//System.out.println(ps.getProductNumber());
		System.out.println(ps.GetScaleGravityInformation());
		System.out.println(ps.getPrinterList());
		System.out.println(p.getPrintCount());
		ps. disconnectPrinter();
		//ps.setScaleZero();*/
	}
}