package com.pb.PitneyCube;

public class PitneyCubeMainClass  {
	
	public static void main(String args[]) throws Exception	
	{
		PitneyService ps=new PitneyService();
		ps.connectPrinter(2, new String(), 0, 0, 0, 0);
	//	ps.CheckStatus();
	}
}