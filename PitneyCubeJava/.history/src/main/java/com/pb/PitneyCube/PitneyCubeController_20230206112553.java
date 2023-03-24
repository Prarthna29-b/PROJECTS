package com.pb.PitneyCube;

public class PitneyCubeController {

    public PitneyCube connectPrinter() {
        PitneyService ps = new PitneyService();
        return ps.connectPrinter();
    }

}
