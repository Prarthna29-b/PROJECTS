package com.pb.PitneyCube;

public class PitneyCubeController {

    public CubeRe connectPrinter() {
        PitneyService ps = new PitneyService();
        return ps.connectPrinter();
    }

}
