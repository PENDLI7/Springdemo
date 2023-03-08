package com.customtemplate;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;



public class Customtemplate {

	BasicDataSource source;
	
	public void setSource(BasicDataSource source) {
		this.source = source;
	}

	public int customupdate(String sqlquery, Object[] id) {
		Connection connection=null;
		PreparedStatement ps=null;
		try {
			connection=source.getConnection();
			ps=connection.prepareStatement(sqlquery);
			int i=1;
			for (Object object : id) {
				ps.setObject(i, object);
				i++;	
			}
			return ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 0;
		
	}

}
