package com.IOTask4;

import java.io.Serializable;

public class cinema implements Serializable {
	private Integer Tic;
	private String mov;
	private Float price;
	private String loc;
	public cinema(Integer Tic, String mov, Float price, String loc) {
		// TODO Auto-generated constructor stub
		this.Tic=Tic;
		this.mov=mov;
		this.price=price;
		this.loc=loc;
		}
	public void Movie() {
		System.out.println("No of Tickests:"+Tic);
		System.out.println("Movie 		:"+mov);
		System.out.println("Amount 		:"+price);
		System.out.println("Location	:"+loc);
	}
	
	public String toString() {
	 return Tic+", "+mov+", "+price+", "+loc;	
	}
		
}


