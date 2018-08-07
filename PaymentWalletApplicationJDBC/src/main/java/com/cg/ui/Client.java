package com.cg.ui;

import com.cg.paymentWallet.Service.IPaymentWalletService;
import com.cg.paymentWallet.Service.PaymentWalletService;
import com.cg.paymentWallet.bean.PaymentWallet;
import com.cg.paymentWallet.exception.PaymentWalletException;

public class Client {

	public static void main(String[] args) {
		
		IPaymentWalletService service= new PaymentWalletService();
		
		/*PaymentWallet pay = new PaymentWallet();

		pay.setCustomerName("Madhu");
		pay.setMobileNo("9891234987");
		pay.setEmailID("madhu@gmail.com");
		pay.setBalance(95000.00);
		try{
			String result= service.createAccount(pay);
			System.out.println("Account successfully added with id= "+result);
		}catch(PaymentWalletException e){
			System.out.println(e.getMessage());
		}*/
		/*try {
			double result1=service.withdraw("8781880192", 1000.00);
			System.out.println("After withdraw for 8781880192 = "+result1);
		} catch (PaymentWalletException e1) {
			System.out.println(e1.getMessage());
		}*/
		/*try {
			double result=service.deposit("8781880192", 10000.00);
			System.out.println("After deposit 8781880192 = "+result);
		} catch (PaymentWalletException e1) {
			System.out.println(e1.getMessage());
		}*/
		try {
			double res=service.fundTransfer("8781880192", "9891023213", 10000);
			System.out.println("Balance = "+res);
		} catch (PaymentWalletException e) {
			System.out.println(e.getMessage());
		}
		
		try {
			System.out.println(service.printTransaction("8781880192"));
		} catch (PaymentWalletException e) {
			System.out.println(e.getMessage());
		}
	}

}
