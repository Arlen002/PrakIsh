package com.company;

import com.company.Model.User;
import com.company.Service.UserService;
import com.company.Service.impl.UserServiceImple;

import java.util.Arrays;

import static com.company.Enum.Gender.FEMALE;
import static com.company.Enum.Gender.MALE;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(1, "Arlen", 20, MALE);
        User user2 = new User(2, "Aruujan", 22, FEMALE);
        User user3 = new User(3, "Ariet", 21, MALE);
        User user4 = new User(4, "Aruuke", 21, FEMALE);

        UserService userService = new UserServiceImple();
        userService.addUser(user1);
        userService.addUser(user2);
        userService.addUser(user3);

        userService.removeId(1);
        System.out.println();

        userService.sizeUsers().forEach(System.out::println);
        System.out.println();

        userService.removeId(2);
        userService.addUser(user4);
        userService.sizeUsers().forEach(System.out::println);

    }
    }
