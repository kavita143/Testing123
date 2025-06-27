package com.hexaware.ordermgmt.services;

import com.hexaware.ordermgmt.beans.Courier;

public interface IOrder {
	
	
	public String getOrderStatus(int trackingNo, Courier[] arr);
	
	public int placeOrder(Courier c);
	
	

}
