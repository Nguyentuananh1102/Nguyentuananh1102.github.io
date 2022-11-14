package com.example.Firstweb.Database;

import com.example.Firstweb.Model.Book;

import java.util.ArrayList;
import java.util.List;

public class FakeDB {
    public static List<Book> books = new ArrayList<>(List.of(
            new Book(1,"book1","Des1", 2022),
            new Book(2,"book2","Des2", 2022),
            new Book(3,"book3","Des3", 2022)
    ));
}
