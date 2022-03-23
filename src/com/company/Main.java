package com.company;

import com.company.Model.User;
import com.company.Service.UserService;
import com.company.Service.impl.UserServiceImple;

import static com.company.Enum.Gender.FEMALE;
import static com.company.Enum.Gender.MALE;

public class Main {

    public static void main(String[] args) {
        User user1 = new User(1, "Arlen", 20, MALE);
        User user2 = new User(2, "Aruujan", 22, FEMALE);
        User user3 = new User(3, "Ariet", 21, MALE);

        UserService userService = new UserServiceImple();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        userService.findById(1);
        System.out.println();

        userService.getAllUsers().forEach(System.out::println);
        System.out.println();

        userService.removeById(2);
        userService.getAllUsers().forEach(System.out::println);

    }
    }
