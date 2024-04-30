package com.sunbeam;

import com.sunbeam.exceptions.ExceptionLineTooLong;

public class Strings extends Exception {
	private String message;

	public void setMessage(String message)throws ExceptionLineTooLong {
		if(message.length()>80) {
//			throw new ExceptionLineTooLong();
			throw new ExceptionLineTooLong("Message String is greater than 80 characters");
		}
		System.out.println("Message String is under 80 charcters");
	}
	
	
}
