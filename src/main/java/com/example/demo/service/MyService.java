package com.example.demo.service;

import java.time.LocalTime;

public class MyService {

	public String saySomthing() {
		String returnValue = null;
		
		if(LocalTime.now().equals("18:30:00")) {
			returnValue = "Daag Acche hai";
		} else {
			returnValue = "Daag Gande hai";
		}
		return returnValue;
	}
}
