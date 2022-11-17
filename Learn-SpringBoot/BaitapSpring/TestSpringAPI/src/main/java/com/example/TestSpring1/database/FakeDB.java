package com.example.TestSpring1.database;

import com.example.TestSpring1.model.User;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    public static List<User> users = new ArrayList<>(List.of(
            new User(1,"Tuan Anh","Anh@gmail.com","0333528109","Hai Dương","Avatar1","1234"),
            new User(2,"Thanh Tung","Tung@gmail.com","0333528109","Bắc Ninh","Avatar2","1234"),
            new User(3,"Duc Hieu","Hieu@gmail.com","0333528109","Bắc Ninh","Avatar3","1234"),
            new User(4,"Kim Cong","Cong@gmail.com","0333528109","Bắc Ninh","Avatar4","1234"),
            new User(5,"Văn Hung","Hung@gmail.com","0333528109","Hai Dương","Avatar5","1234")
    ));
}
