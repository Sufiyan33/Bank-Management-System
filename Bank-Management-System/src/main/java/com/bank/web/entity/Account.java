package com.bank.web.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Account {

	// Add below fields
	  
	 // All also generate setter and getter
	  
	   Long id;
	 String accountNumber;
	 double balance;
	 String account_type;
	 String branch; 
	 String IFSC_code;
	 String Pin;
	 String accountstatus;
	 User user;
	 
}
