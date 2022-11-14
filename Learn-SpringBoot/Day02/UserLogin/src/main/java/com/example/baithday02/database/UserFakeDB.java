package com.example.baithday02.database;

import com.example.baithday02.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserFakeDB {
    public static List<User> users = new ArrayList<>(List.of(
            new User(1,"User1", "user1@gmail.com","1234", "avatar1"),
            new User(2,"User2", "user2@gmail.com","1234", "avatar2"),
            new User(3,"User3", "user3@gmail.com","1234", "avatar3"),
            new User(4,"User4", "user4@gmail.com","1234", "avatar4")
    ));
}
