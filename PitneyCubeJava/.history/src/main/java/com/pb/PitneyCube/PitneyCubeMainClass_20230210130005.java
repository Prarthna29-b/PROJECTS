package com.pb.pitneyCube;

import com.pb.controller.PitneyCubeController;

public class PitneyCubeMainClass  {
	
	public static void main(String args[]) throws Exception	
	{
		PitneyCubeController pcc=new PitneyCubeController();
		System.out.println("CP"pcc.connectPrinter());
		System.out.println("CS"pcc.checkStatus());
		System.out.println("GSW"pcc.getScaleWeight());
		//System.out.println(pcc.getPrinterInformation());
		System.out.println("pcc.getScaleVersion());
		//System.out.println(pcc.getSerialNumber());
		//System.out.println(pcc.getProductNumber());
		System.out.println(pcc.getScaleGravityInformation());
		//System.out.println(pcc.getPrinterList());
		System.out.println(pcc.getPrintCount());
		System.out.println(pcc.disconnectPrinter());
		System.out.println(pcc.setScaleZero());
	}
}