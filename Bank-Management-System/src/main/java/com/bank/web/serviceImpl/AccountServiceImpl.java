package com.bank.web.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.bank.web.entity.Account;
import com.bank.web.entity.User;
import com.bank.web.exception.NotFoundException;
import com.bank.web.exception.UnauthorizedException;
import com.bank.web.repository.AccountRepository;
import com.bank.web.service.AccountService;

@Service
public class AccountServiceImpl implements AccountService {

	@Autowired
	private AccountRepository accountRepository;
	
	private PasswordEncoder passwordEncoder;

	@Override
	public Account createAccount(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean isPinGenerated(String accountNumber) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void generatePin(String accountNumber, String password, String pin) {
		// TODO Auto-generated method stub

		Account account = accountRepository.findByAccountNumber(accountNumber);
		if (account == null) {
			throw new NotFoundException("Account is not found");
		}
		if(!passwordEncoder.matches(password, account.getUser().getPassword())) {
			throw new UnauthorizedException("Invalid Password");
		}
		account.setPin(passwordEncoder.encode(pin));
		accountRepository.save(account);
	}

	@Override
	public void updatePin(String accountNumber, String oldPin, String password, String newPin) {
		// TODO Auto-generated method stub

		Account account = accountRepository.findByAccountNumber(accountNumber);
		if (account == null) {
			throw new NotFoundException("Account is not found");
		}
		if(!passwordEncoder.matches(password, account.getUser().getPassword())) {
			throw new UnauthorizedException("Invalid Password");
		}
		if(!passwordEncoder.matches(oldPin, account.getPin())) {
			throw new UnauthorizedException("Invalid PIN");
		}
		account.setPin(passwordEncoder.encode(newPin));
		accountRepository.save(account);
	}

	@Override
	public void cashDeposit(String accountNumber, String pin, double amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository.findByAccountNumber(accountNumber);
		if (account == null) {
			throw new NotFoundException("Account is not found");
		}
		if(!passwordEncoder.matches(pin, account.getPin())) {
			throw new UnauthorizedException("Invalid PIN");
		}
		 account.setBalance(account.getBalance() + amount);
	        accountRepository.save(account);
		
	}

	@Override
	public void cashWithdrawal(String accountNumber, String pin, double amount) {
		// TODO Auto-generated method stub
		Account account = accountRepository.findByAccountNumber(accountNumber);
		if (account == null) {
			throw new NotFoundException("Account is not found");
		}
		if(!passwordEncoder.matches(pin, account.getPin())) {
			throw new UnauthorizedException("Invalid PIN");
		}
		
		if (account.getBalance() < amount) {
            throw new RuntimeException("Insufficient funds");
        }
        account.setBalance(account.getBalance() - amount);
        accountRepository.save(account);

	}

	@Override
	public void fundTransfer(String sourceAccounter, String targetAccountNumber, String pin, double amount) {
		// TODO Auto-generated method stub

	}

}
