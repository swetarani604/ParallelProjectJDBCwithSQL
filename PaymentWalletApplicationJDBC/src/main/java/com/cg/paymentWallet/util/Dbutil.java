package com.cg.paymentWallet.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.cg.paymentWallet.exception.PaymentWalletException;

public class Dbutil {
public static Connection getConnection() throws PaymentWalletException{
	String url="jdbc:mysql://localhost:3306/paymentwalletjdbc";
	try {
		Class.forName("com.mysql.jdbc.Driver");
		return DriverManager.getConnection(url,"root","root");
		
	} catch (ClassNotFoundException e) {
		
		throw new PaymentWalletException(e.getMessage());
	} catch (SQLException e) {
		
		throw new PaymentWalletException(e.getMessage());
	}
	
	
}
}
