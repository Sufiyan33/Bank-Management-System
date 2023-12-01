package com.bank.web.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class Transaction {

	
	//  Add below properties so that i can be make column
	  
	  //Also add setter and getter with validations
	  
	 private Long id;
	 private double amount;
	 private String transaction_type;
	 private Date transaction_date;
	 private Account sourceAccount;
	 private Account targetAccount;
	 
}
