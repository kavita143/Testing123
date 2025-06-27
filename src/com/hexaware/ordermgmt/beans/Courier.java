package com.hexaware.ordermgmt.beans;

public  class Courier  implements Comparable<Courier>{
	
	
	private int courierId;
	private String status;
	private static int trackingNo;
	
	
	static {
		trackingNo=100;
	}
	
	public Courier() {
		trackingNo++;
		setCourierId(trackingNo);
	}
	public int getCourierId() {
		return courierId;
	}
	public void setCourierId(int courierId) {
		this.courierId = courierId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public static int getTrackingNo() {
		return trackingNo;
	}
	public static void setTrackingNo(int trackingNo) {
		Courier.trackingNo = trackingNo;
	}
	@Override
	public String toString() {
		return "Courier [courierId=" + courierId + ", status=" + status + "]";
	}
	@Override
	public int compareTo(Courier o) {
		// TODO Auto-generated method stub
		if(this.getCourierId()>o.getCourierId())
			return -1;
		else if(this.getCourierId()<o.getCourierId())
			return 1;
		else
			return 0;
	}


}
