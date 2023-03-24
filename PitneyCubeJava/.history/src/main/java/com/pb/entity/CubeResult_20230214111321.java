package com.pb.entity;

public class CubeResult {
	private boolean result;
	private int value;
	private String error;

	

	public CubeResult(boolean result, int value, String error) {
		this.result = result;
		this.value = value;
		this.error = error;
	}

	@Override
	public String toString() {
		return "CubeResult [result=" + result + ", value=" + value + ", error=" + error + "]";
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public boolean isResult() {
		return result;
	}

	public void setResult(boolean result) {
		this.result = result;
	}

}
