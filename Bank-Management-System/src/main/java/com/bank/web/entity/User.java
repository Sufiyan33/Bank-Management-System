package com.bank.web.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class User {

	
	 // Add below properties to make as column
	  
	 //Create setter and getter and also apply validations
	  
	 Long id;
	 String name;
	 String password;
	 String email;
	 String address;
	 String phone_number;
	 int otpRetryCount;
	 LocalDateTime lastOtpRequestTime;
	 Account account;
	 
}
