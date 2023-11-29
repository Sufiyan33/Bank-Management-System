/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.User.Registration.DAO;

import com.User.Registration.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 91976
 */
public interface UserDAO extends JpaRepository<User, Integer>{
    
}
