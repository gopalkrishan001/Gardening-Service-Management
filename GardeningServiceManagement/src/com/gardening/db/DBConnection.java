package com.gardening.db;

import java.sql.*;

public class DBConnection {
	public static Connection getConnection() {
	    try {
	        return DriverManager.getConnection(
	            "jdbc:mysql://localhost:3306/gardening", "root", "Gopal@6947");
	    } catch (Exception e) {
	        System.out.println(e);
	        return null;
	    }
	}}
