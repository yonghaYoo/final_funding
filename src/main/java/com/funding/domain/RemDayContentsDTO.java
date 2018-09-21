package com.funding.domain;

public class RemDayContentsDTO {
	private int result;
	private int c_num;
	
	public RemDayContentsDTO(){
		
	}

	public RemDayContentsDTO(int result, int c_num) {
		super();
		this.result = result;
		this.c_num = c_num;
	}

	public int getResult() {
		return result;
	}

	public void setResult(int result) {
		this.result = result;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	
	
}
