package com.bank.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bank.web.entity.OTPDetails;

@Repository
public interface OtpRepository extends JpaRepository<OTPDetails, Long>{

}
