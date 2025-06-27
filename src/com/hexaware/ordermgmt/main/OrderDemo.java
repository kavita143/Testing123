package com.hexaware.ordermgmt.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.sql.*;

import com.hexaware.ordermgmt.beans.Courier;
import com.hexaware.ordermgmt.exception.TrackingNumberNotFoudException;
import com.hexaware.ordermgmt.services.IOrder;
import com.hexaware.ordermgmt.services.OrderImpl;
import com.hexaware.ordermgmt.util.DBUtil;

public class OrderDemo {

	public static void main(String[] args)  {		
		Map<Integer, String> m = new TreeMap<Integer, String>();
		m.put(102,"abc1");
		m.put(104,"abc3");

		m.put(102,"abc4");

		m.put(103,"abc2");

		
		System.out.println(m.get(100));
		System.out.println(m);
		
		Set<String> s= new LinkedHashSet<>();		
		
		s.add(null);
		s.add(null);
		s.add(null);
		s.add(null);
	
		System.out.println(s);
		
		Set<Courier> al= new TreeSet<Courier>();
		
		
		
		al.add(new Courier());
		al.add(new Courier());
		al.add(new Courier());
		al.add(new Courier());
		
		System.out.println(al);
		
		
		
		String str= "hello";// string literals
		
		String str2= "hello";
		
		System.out.println(str==str2); // true
		
		str=str.concat(" world");
		
		str2=str.concat("again");
		
		System.out.println(str);// hello world
		
		String str1= new String("abc"); // new keyword
		String str3= new String("abc");
		System.out.println(str1==str3); // false
		
		StringBuilder sb = new StringBuilder("hello");		
		sb.append(" world");
		System.out.println(sb);
		
		
		
		
		Scanner scr = new Scanner(System.in);
		IOrder service= new OrderImpl();
		Courier []arr= new Courier[10];
		
		try {
			FileReader f = new FileReader("IOrder.java");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		while(true) {
		System.out.println("enter 1 to place the courier, enter 2 to display all the order,"
				+ "enter 3 to check the status of order, enter 4 to exit the application");
		int option= scr.nextInt();
		
		switch(option) {
			case 1: Courier c= new Courier();
					c.setStatus("yet To Transit");
					System.out.println("The tracking no generated is "+service.placeOrder(c));
					for(int i=0;i<arr.length;i++) {
						if(arr[i]==null)
						{
							arr[i]=c;
							break;
						}
					}
					break;
			case 2: System.out.println(service.getAllCouriers());
					break;
			case 3:System.out.println("enter tracking no");
					int trackingNo= scr.nextInt();
			try {
				System.out.println(service.getOrderStatus(trackingNo, arr));
			} 
			
			catch (TrackingNumberNotFoudException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
			catch(Exception e) {
				
			}
			finally {
				System.out.println("finally block");
			}
					break;		
			case 4: 
				DBUtil.closeConnection();
				System.exit(1);	
		
		}
		
		
		}
	
	}

}
