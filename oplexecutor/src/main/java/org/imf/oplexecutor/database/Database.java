package org.imf.oplexecutor.database;

import java.sql.DriverManager;

import org.imf.oplexecutor.exception.InfrastructureException;
import org.imf.oplexecutor.fims.bms.ErrorCodeType;

import java.sql.Connection;

//Connects to the Database
public class Database {
	
	public Connection getConnection() throws Exception
	{
		try {
			String connectionURL ="jdbc:mysql://localhost:3306/TransformDatabase";
			Connection connection = null;
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			connection = DriverManager.getConnection(connectionURL, "java", "java");
			return connection;
		}
		catch (Exception e)
		{
			throw new InfrastructureException(ErrorCodeType.INF_S_00_0004, "Unable to connect to the database. REST Status: 500 Internal Server Error", e.getMessage());
		}
	}
}
