package org.imf.oplexecutor.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import org.imf.oplexecutor.model.Opl;

public class MySQLAccess {
		
	public MySQLAccess () {}
	
	private Connection conn = null;
	
	public void connect(){
		String driver = "com.mysql.jdbc.Driver";
		String database = "jdbc:mysql://localhost:3306/TransformDatabase";
		String username = "java";
		String password = "java";
		try {
			Class.forName(driver);
			conn = DriverManager.getConnection(database,username,password);
		}
		catch(Exception e) {
			System.out.println("Connection to Database failed");
		}
	}
		
	//Connect to Database and insert Data in opl table
	public String post_opl(Opl o) {
		String oplId = o.getOplId();
		String oplPath = o.getOplPath();
		String annotation = o.getAnnotation();
		String issueDate = o.getIssueDate();
		String cplId = o.getCplId();
		String cplPath = o.getCplPath();
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TransformDatabase","java","java");	
			PreparedStatement posted = conn.prepareStatement("INSERT INTO opl(oplId,oplPath,annotation,issueDate, cplId,cplPath) VALUES('"+oplId+"','"+oplPath+"','"+annotation+"','"+issueDate+"','"+cplId+"','"+cplPath+"')");
			posted.executeUpdate();
			return "created";
		} 
		catch(Exception e) {
			e.printStackTrace();
			return "failure";
		}
	}
	
	public ArrayList<Opl> getAllOpls() {
		ArrayList<Opl> opls = new ArrayList<Opl>();
		try{
			String sqlQuery = "SELECT id,oplId,oplPath,annotation,issueDate,cplId,cplPath FROM opl";
			PreparedStatement ps = conn.prepareStatement(sqlQuery);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Opl o = new Opl();
				o.setId(rs.getInt("id"));
				o.setOplId(rs.getString("oplId"));
				o.setOplPath(rs.getString("oplPath"));
				o.setAnnotation(rs.getString("annotation"));
				o.setIssueDate(rs.getString("issueDate"));
				o.setCplId(rs.getString("cplId"));
				o.setCplPath(rs.getString("cplPath"));
				opls.add(o);
			}	
			ps.close();
			rs.close();
		}
		catch(Exception e) {
			System.out.println("Error");
		}
		return opls;
	}
}
