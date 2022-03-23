package com.company.Service.impl;

import com.company.Dao.UserDao;
import com.company.Model.User;
import com.company.MyExsep.MyExseption;
import com.company.Service.UserService;

import java.util.List;

public class UserServiceImple  implements UserService {
    UserDao userDao = new UserDao();

    @Override
    public void addUser(User user) {
        userDao.addUser(user);
    }

    @Override
    public void findById(int id) {
        try {
            if (userDao.checkTrueOrFalse(id)) {
                throw new MyExseption("There is no such id");
            }
            userDao.findById(id);
        } catch (MyExseption e) {
            System.err.println(e.getMessage());
        }
    }

    @Override
    public void removeById(int id) {
        userDao.removeById(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userDao.getAllUsers();
    }

}

