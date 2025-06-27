package com.hexaware.ordermgmt.services;

import java.util.List;

import com.hexaware.ordermgmt.beans.Courier;
import com.hexaware.ordermgmt.exception.TrackingNumberNotFoudException;

public interface IOrder {
	
	
	public String getOrderStatus(int trackingNo, Courier[] arr) throws TrackingNumberNotFoudException;
	
	public int placeOrder(Courier c);
	
	
	public default void test() {
		
	}
	
	public List<Courier> getAllCouriers();
	
	

}
