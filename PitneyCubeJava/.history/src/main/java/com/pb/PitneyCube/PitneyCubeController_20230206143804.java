package com.pb.PitneyCube;

public class PitneyCubeController {

    public CubeResult connectPrinter() {
        CubeImplementation ps = new CubeImplementation();
        return ps.connectPrinter();
    }
   public CubeResult setScaleZero() {
        CubeImplementation ps = new CubeImplementation();
        return ps.setScaleZero();
    }
    public CubeResult checkStatus() {
        CubeImplementation ps = new CubeImplementation();
        return ps.check();
    }
}
