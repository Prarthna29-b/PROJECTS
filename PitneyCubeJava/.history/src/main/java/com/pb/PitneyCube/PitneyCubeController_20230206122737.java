package com.pb.PitneyCube;

public class PitneyCubeController {

    public CubeResult connectPrinter() {
        PitneyService ps = new PitneyService();
        return ps.connectPrinter();
    }

}
