package com.funding.domain;

public class SumpriceVO {
	private int f_price;
	private int c_num;

	public SumpriceVO() {

	}

	public SumpriceVO(int f_price, int c_num) {
		super();
		this.f_price = f_price;
		this.c_num = c_num;
	}

	public int getF_price() {
		return f_price;
	}

	public void setF_price(int f_price) {
		this.f_price = f_price;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

}
