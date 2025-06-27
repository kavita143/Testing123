package com.hexaware.ordermgmt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hexaware.ordermgmt.beans.Courier;
import com.hexaware.ordermgmt.util.DBUtil;

public class CourierDAO {
	
	
	public List<Courier> getAllCouriers(){
		List<Courier> list= new ArrayList<>();
		String name="Ramasundar";
		
		String query= "SELECT * FROM public.\"AGENTS\"";
		Connection con=DBUtil.getConnection();
		PreparedStatement stmt=null;
		PreparedStatement stmt1=null;
		ResultSet rs=null;
		try {
			stmt = con.prepareStatement(query);
			rs=stmt.executeQuery();
			
			String query1= "delete from public.\"AGENTS\" where \"AGENT_NAME\"=? \r\n";
			stmt1 = con.prepareStatement(query1);
			stmt1.setString(1, "Alford");
			int i=stmt1.executeUpdate();
			System.out.println(i);
			while(rs.next()) {				
				Courier c = new Courier();
				c.setCourierId(0);
				c.setStatus(rs.getString(1));
				c.setTrackingNo(0);
				list.add(c);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			DBUtil.closeResultSet(rs);
			DBUtil.closeStatement(stmt);			
		}
		// step 4 exceute the query
		return list;
		
	}
	
	
	

}
