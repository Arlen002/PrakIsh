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
        UserDao.users.add(user);
    }

    @Override
    public void searchId(int id) {

            if (!checkTrueOrFalse(id)) {
                try {
                throw new MyExseption("There is no such id");
            } catch(MyExseption e){
             System.err.println(e.getMessage());
          }}else {
                UserDao.users.stream().filter(user -> user.getId() == id).forEach(System.out::println);
            }
        }
    @Override
    public void removeId(int id) {
        UserDao.users.removeIf(user -> user.getId() == id);
    }

    @Override
    public List<User> sizeUsers() {
       return UserDao.users.stream().toList();
    }
    public boolean checkTrueOrFalse(int id) {
        return UserDao.users.stream().filter(user -> user.getId() == id).isParallel();
    }

}

