package com.exceptions;

public class ArrayException extends Exception{
	
	private String message;
		public ArrayException() {
			message="you got an exception";
		}
		public ArrayException(String message) {
			super(message);
			this.message=message;
			
		}
		public void display() {
			System.out.println("cause of failure:"+getMessage());
			
		}
		}

}
