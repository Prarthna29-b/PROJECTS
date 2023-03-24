package com.pb.PitneyCube;

public class PitneyCubeController {
    CubeImplementation ps = new CubeImplementation();
    public CubeResult connectPrinter() {
        return ps.connectPrinter();
    }
   public CubeResult setScaleZero() {
        return ps.setScaleZero();
    }
    public CubeResult checkStatus() {
        return ps.checkStatus();
    }
    public CubeResult getScaleWeight() {
        return ps.getScaleWeight();
    }
    public CubeResult getPrinterInformation() {
        return ps.getPrinterInformation();
    }
    public CubeResult getScaleVersion() {
        return ps.getScaleVersion();
    }
    public CubeResult getScaleGravityInformation() {
        return ps.getScaleGravityInformation();
    }
    public CubeResult getPrinterList() {
        
    }
    public char[] getPrintCount() {
        return null;
    }
    public char[] disconnectPrinter() {
        return null;
    }
}
