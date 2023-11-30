package com.bank.web.service;

import com.bank.web.entity.Account;
import com.bank.web.entity.User;

public interface AccountService {

	public Account createAccount(User user);
	public boolean isPinGenerated(String accountNumber);
	public void generatePin(String accountNumber, String password, String pin);
	public void updatePin(String accountNumber, String oldPin,String password, String newPin);
	public void cashDeposit(String accountNumber, String pin, double amount);
	public void cashWithdrawal(String accountNumber, String pin, double amount);
	public void fundTransfer(String sourceAccounter, String targetAccountNumber, String pin, double amount);
}
