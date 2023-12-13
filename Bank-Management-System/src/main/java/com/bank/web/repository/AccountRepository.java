package com.bank.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.web.entity.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

	Account findByAccountNumber(String accountNumber);
}
