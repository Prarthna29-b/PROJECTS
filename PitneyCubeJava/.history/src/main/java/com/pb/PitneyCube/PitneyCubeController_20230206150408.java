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
        return ps.checkStatus();
    }
    public CubeResult getScaleWeight() {
        CubeImplementation ps = new CubeImplementation();
        return ps.getScaleWeight();
    }
    public char[] GetPrinterInformation() {
        return null;
    }
    public char[] getScaleVersion() {
        return null;
    }
    public char[] GetScaleGravityInformation() {
        return null;
    }
}
