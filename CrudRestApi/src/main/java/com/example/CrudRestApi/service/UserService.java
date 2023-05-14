package com.example.CrudRestApi.service;

import com.example.CrudRestApi.entity.User;

import java.util.List;

public interface UserService {
    User createUser(User user);
    User getUserById(Long userId);
    List<User> getAllUsers();
    User updatedUser(User user);
    void deletedUser(Long userId);
}