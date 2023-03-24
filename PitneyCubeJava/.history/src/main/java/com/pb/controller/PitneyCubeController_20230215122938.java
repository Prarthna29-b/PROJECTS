package com.pb.controller;

import com.pb.entity.CubeResult;
import com.pb.implementation.CubeImplementation;

public class PitneyCubeController {
  CubeImplementation ps = new CubeImplementation();

	public CubeResult connectPrinter() {
        return ps.connectPrinter(0, null, 0, 0, 0, 0);
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
public CubeResult getScaleVersion() {
        return ps.getScaleVersion(null);
    }
    public CubeResult getScaleGravityInformation() {
        return ps.getScaleGravityInformation();
    }
    public CubeResult getPrintCount() {
       return ps.getPrintCount(); 
    }
    public CubeResult disconnectPrinter() {
        return ps.disconnectPrinter();
    }
}
