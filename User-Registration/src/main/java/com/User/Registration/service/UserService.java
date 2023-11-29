/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.User.Registration.service;

import com.User.Registration.model.User;
import java.util.List;

/**
 *
 * @author 91976
 */
public interface UserService {
    
    User createUser(User user);
    
    List<User>getAllUser();
    
    User updateUser(User user,Integer Id);
    
    void deleteUser(Integer id);
}
