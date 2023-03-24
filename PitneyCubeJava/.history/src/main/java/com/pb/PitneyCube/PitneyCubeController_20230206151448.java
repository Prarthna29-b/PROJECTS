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
    public CubeResult etPrinterInformation() {
        return ps.getPrinterInformation();
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
