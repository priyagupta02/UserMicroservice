package com.lcwd.user.service.services.impl;

import com.lcwd.user.service.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.repositories.UserRepositories;
import com.lcwd.user.service.services.UserService;
import com.lcwd.user.service.entities.User; // ✅ Correct!

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepositories userRepositories;
    @Override
    public User saveUser(User user) {
        //generates unique user id
        user.setUserId(UUID.randomUUID().toString());
        return userRepositories.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepositories.findAll();
    }

    @Override
    public User getUser(String userId) {
        return userRepositories.findById(userId).orElseThrow(() -> new ResourceNotFoundException("User with given id is not found on server !! : " +userId));
    }

   // @Override
   // public User updateUser(String userId, User updatedUser) {
    //    return null;
   // }

    //@Override
    //public void deleteUser(String userId) {

   // }
}
