package com.hexaware.ordermgmt.exception;

public class TrackingNumberNotFoudException extends Exception{
	
	public TrackingNumberNotFoudException() {
		System.out.println("constructor called");
	}
	public TrackingNumberNotFoudException(String msg) {
		super(msg);
	}

}
