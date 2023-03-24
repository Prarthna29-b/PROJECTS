package com.pb.entity;

public class CubeResult {
	private boolean result;
	private String value;
	private String error;

	

	public CubeResult(boolean result, String value, String error) {
		this.result = result;
		this.value = value;
		this.error = error;
	}

	@Override
	public String toString() {
		return "CubeResult [result=" + result + ", value=" + value + ", error=" + error + "]";
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
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
