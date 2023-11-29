/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.User.Registration.service.Impl;

import com.User.Registration.DAO.UserDAO;
import com.User.Registration.model.User;
import com.User.Registration.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author 91976
 */
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDAO userDAO;
    
    
    @Override
    public User createUser(User user) {
        User save = userDAO.save(user);
        return save;
    }

    @Override
    public List<User> getAllUser() {
        List<User> findAll = userDAO.findAll();
        return findAll;
    }

    @Override
    public User updateUser(User user, Integer Id) {
        User orElseThrow = userDAO.findById(Id).map(
                exixtingUser->{
                    
                    exixtingUser.setName(user.getName());
                    exixtingUser.setEmail(user.getEmail());
                    exixtingUser.setAddress(user.getAddress());
                    exixtingUser.setPhonenumber(user.getPhonenumber());
                    return exixtingUser;
                }
        ).orElseThrow(null);
        return orElseThrow;
    }

    @Override
    public void deleteUser(Integer id) {
        userDAO.deleteById(id);
    }
    
}
