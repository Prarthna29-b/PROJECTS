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
        
    }
    public char[] getScaleVersion() {
        return null;
    }
    public char[] GetScaleGravityInformation() {
        return null;
    }
    public char[] getPrinterList() {
        return null;
    }
    public char[] getPrintCount() {
        return null;
    }
    public char[] disconnectPrinter() {
        return null;
    }
}
