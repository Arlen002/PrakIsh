package com.company.Service;

import com.company.Model.User;

import java.util.List;

public interface UserService {
    void addUser(User user);
    void searchId(int id);
    void removeId(int id);
    List<User> sizeUsers();
           }
