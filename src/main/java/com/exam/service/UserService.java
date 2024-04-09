package com.exam.service;

import com.exam.model.User;
import com.exam.model.UserRole;

import java.util.Set;

public interface UserService {

    //Creating User

    public User createUser(User user, Set<UserRole>userRoles) throws Exception;
    //getting user by username

    public User getUser(String userName);

    //delete user by id

    public void deleteUser(long userId);

    public User updateUser(User user);





}
