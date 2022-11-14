package com.example.Firstweb.Service;

import com.example.Firstweb.Model.Book;
import com.example.Firstweb.request.UpsertBookRequest;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class BookService {
    private List<Book> books;
    public BookService() {
        books = new ArrayList<>();
        books.add(new Book(1,"book1","Des1", 2022));
        books.add(new Book(2,"book2","Des2", 2022));
        books.add(new Book(3,"book3","Des3", 2022));





    }
    public List<Book> getBooks() {
        return null;
    }

    public Book getBookById(int id){
        for (Book book:books) {
            if(book.getId() == id){
                return book;
            }

        }
        return null;

    }

    public Book createBook(UpsertBookRequest request){
        Random rd = new Random();
        int id = rd.nextInt(1000);

        Book book = new Book(
                id,
                request.getTitle(),
                request.getDescription(),
                request.getPublishyear()
        );
        books.add(book);
        return book;
    }
}
