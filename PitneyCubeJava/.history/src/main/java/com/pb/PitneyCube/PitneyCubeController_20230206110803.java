package com.pb.PitneyCube;

public class PitneyCubeController {
    PitneyService ps= new PitneyService();
    PitneyCube pc= new PitneyCube();
    public PitneyCube connectPrinter()
    { 
        PitneyService ps= new PitneyService();
     return ps.connectPrinter();
        }
      
    }
