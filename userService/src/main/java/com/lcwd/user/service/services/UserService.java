package com.lcwd.user.service.services;


import com.lcwd.user.service.entities.User; // ✅ Correct!


import java.util.List;

public interface UserService {
    //user operations


    //create
    User saveUser(User user);

    //get all user
    List<User> getAllUser();

    //get single user of given userId
    User getUser(String userId);

    // update user
    //User updateUser(String userId, User updatedUser);

    // delete user
    //void deleteUser(String userId);



}
