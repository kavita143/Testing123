package com.hexaware.ordermgmt.services;

import java.util.List;

import com.hexaware.ordermgmt.beans.Courier;
import com.hexaware.ordermgmt.dao.CourierDAO;
import com.hexaware.ordermgmt.exception.TrackingNumberNotFoudException;

public class OrderImpl implements IOrder {
	
	CourierDAO dao = new CourierDAO();

	
	@Override
	public String getOrderStatus(int trackingNo, Courier[] arr) throws TrackingNumberNotFoudException{
		// TODO Auto-generated method stub
		for(Courier c:arr)
		{
			if(c!=null) {
				if(c.getCourierId()== trackingNo) {
					return c.getStatus();
				}
			}
		}
		System.out.println("testing");
		throw new TrackingNumberNotFoudException("Tracking id is not found");
		
	}

	@Override
	public int placeOrder(Courier c) {
		
		boolean b = true;
		if(!b) {
			System.out.println(b);
		}
		// TODO Auto-generated method stub
		return Courier.getTrackingNo();
	}

	@Override
	public List<Courier> getAllCouriers() {
		// TODO Auto-generated method stub
		return dao.getAllCouriers();
	}

	

}
