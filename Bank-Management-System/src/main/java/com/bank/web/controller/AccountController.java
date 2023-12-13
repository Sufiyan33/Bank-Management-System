package com.bank.web.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.web.dto.PinRequest;
import com.bank.web.service.AccountService;
import com.bank.web.util.LoggedInUser;

@RestController
@RequestMapping("/api/account")
public class AccountController {

	/*
	 * Add below end point which I have already mentioned in github page.
	 * 
	 * 1- checkAccountPIN
	 * 
	 * 2 - createPIN
	 * 
	 * 3- updatePIN
	 * 
	 * 4- cashDeposit
	 * 
	 * 5- cashWithdrawal
	 * 
	 * 6- fundTransfer
	 * 
	 * 7 - getAllTransactionsByAccountNumber
	 */
	
	@Autowired
	private AccountService accountService;
	
	@PostMapping("/pin/generate")
	public ResponseEntity<?> createPin(@RequestBody PinRequest pinRequest){
		accountService.generatePin(LoggedInUser.getAccountNumber(), pinRequest.getPassword(), pinRequest.getPin());
		
		Map<String, String> response = new HashMap<>();
		response.put("msg", "PIN Created successfully");
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
	
	@GetMapping("message")
	public String demo() {
		return "testing Api's";
	}
}
