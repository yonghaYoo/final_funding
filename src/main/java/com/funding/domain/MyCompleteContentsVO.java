package com.funding.domain;

import java.io.Serializable;

public class MyCompleteContentsVO implements Serializable{
	private String c_title;
	private String c_thimg;
	private String c_intro;
	private String c_dead;
	private int ec_achive;
	private int c_num;
	private int c_goal;
	
	public MyCompleteContentsVO(){}

	public MyCompleteContentsVO(String c_title, String c_thimg, String c_intro, String c_dead, int ec_achive, int c_num,
			int c_goal) {
		super();
		this.c_title = c_title;
		this.c_thimg = c_thimg;
		this.c_intro = c_intro;
		this.c_dead = c_dead;
		this.ec_achive = ec_achive;
		this.c_num = c_num;
		this.c_goal = c_goal;
	}

	public String getC_title() {
		return c_title;
	}

	public void setC_title(String c_title) {
		this.c_title = c_title;
	}

	public String getC_thimg() {
		return c_thimg;
	}

	public void setC_thimg(String c_thimg) {
		this.c_thimg = c_thimg;
	}

	public String getC_intro() {
		return c_intro;
	}

	public void setC_intro(String c_intro) {
		this.c_intro = c_intro;
	}

	public String getC_dead() {
		return c_dead;
	}

	public void setC_dead(String c_dead) {
		this.c_dead = c_dead;
	}

	public int getEc_achive() {
		return ec_achive;
	}

	public void setEc_achive(int ec_achive) {
		this.ec_achive = ec_achive;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	public int getC_goal() {
		return c_goal;
	}

	public void setC_goal(int c_goal) {
		this.c_goal = c_goal;
	}
	
	
}
