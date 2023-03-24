package com.pb.PitneyCube;

public class PitneyCubeController {
    PitneyService ps= new PitneyService();
    PitneyCube pc= new PitneyCube();
    public PitneyService connect()
    { 
        PitneyService ps= new PitneyService();
      ps.getConnectPrinter(0, null, 0, 0, 0, 0);
        }
      
    }
