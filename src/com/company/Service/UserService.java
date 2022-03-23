package com.company.Service;

import com.company.Model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void findById(int id);
    void removeById(int id);
    List<User> getAllUsers();
           }
