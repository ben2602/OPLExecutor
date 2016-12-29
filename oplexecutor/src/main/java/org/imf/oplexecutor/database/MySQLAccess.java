package org.imf.oplexecutor.database;

import java.sql.*;

import org.imf.oplexecutor.model.Opl;

public class MySQLAccess {
	
	

	/*public static void main(String[] args) {
		// TODO Auto-generated method stub

	}*/
	//Connection connection;
	
	public MySQLAccess () {}
	
	//WORKING:
	public boolean connect() {
		try {
			//Class.forName("com.mysql.jdbc.Driver").newInstance();
			//String conncectionCommand = "jdbc:mysql://127.0.0.1:3306/TransformDatabase&user=java&password=java";
			//connection = DriverManager.getConnection(conncectionCommand);
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TransformDatabase","java","java");
			return true;
		}
		catch (Exception ex) {
			ex.printStackTrace();
			System.out.print("false");
			return false;
		}
	}
	//Connect to Database and insert Data in opl table
	public void post_opl(Opl o) {
		String oplId = o.getOplId();
		String annotation = o.getAnnotation();
		String issueDate = o.getIssueDate();
		String cplId = o.getCplId();
		try{
			
			System.out.println(oplId);
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TransformDatabase","java","java");	
			PreparedStatement posted = conn.prepareStatement("INSERT INTO opl(oplId,annotation,issueDate, cplId) VALUES('"+oplId+"','"+annotation+"','"+issueDate+"','"+cplId+"')");
			posted.executeUpdate();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("opl insert completed");
		}
	}
	
	//Connect to Database an insert data in task table
	public void post_task(String oplId, String annotation, String oplPath, String cplId, String cplPath) {
		try{
			System.out.println(oplId);
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/TransformDatabase","java","java");	
			PreparedStatement posted = conn.prepareStatement("INSERT INTO task(oplId,annotation,oplPath,cplId,cplPath) VALUES('"+oplId+"','"+annotation+"','"+oplPath+"','"+cplId+"','"+cplPath+"')");
			posted.executeUpdate();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("task insert completed");
		}
	}
}
