package com.wolken.wolkenapp.bean;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class AirportBean {

	public AirportBean() {
		// TODO Auto-generated constructor stub
	}
	
	public void airport() {
		System.out.println(" Travelling ");
	}
	private String airport_name;
	private String destination;
	private int flight_ticket_no;
	private int ticket_price;
	
	
}
