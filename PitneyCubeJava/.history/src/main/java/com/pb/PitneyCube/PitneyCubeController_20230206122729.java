package com.pb.PitneyCube;

public class PitneyCubeController {

    public Cube connectPrinter() {
        PitneyService ps = new PitneyService();
        return ps.connectPrinter();
    }

}
