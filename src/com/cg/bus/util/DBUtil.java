package com.cg.bus.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
	private static Connection conn;

	public static Connection getConnection() {
		if (conn == null) {
			String url = "jdbc:postgresql://127.0.0.1/capgoct";
			String user = "postgres";
			String password = "Janansidhu@27";
			try {
				Class.forName("org.postgresql.Driver");
				conn = DriverManager.getConnection(url, user, password);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return conn;
	}

	public static void closeConnection() {
		if (conn != null)
			try {conn.close();} catch (SQLException e) {}
	}

}
