package com.example.Firstweb.Service;

import com.example.Firstweb.Exception.NotFoundException;
import com.example.Firstweb.Model.Book;
import com.example.Firstweb.repository.BookRepository;
import com.example.Firstweb.request.UpsertBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Random;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;
    private List<Book> books;
    public BookService() {
        books = new ArrayList<>();
        books.add(new Book(1,"book1","Des1", 2022));
        books.add(new Book(2,"book2","Des2", 2022));
        books.add(new Book(3,"book3","Des3", 2022));





    }
    public List<Book> getBooks() {
        return bookRepository.findAll();
    }



    public Book getBookById(int id){
        Optional<Book> bookOptional = bookRepository.findById(id);
        if(bookOptional.isPresent()){
            return bookOptional.get();
        }
        throw new NotFoundException("Not found Book with id = " + id);

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
        //BookRepository.save(book);
        return book;
    }

    public  void deleteBook (int id){
        Book book = bookRepository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found Book with id = " + id);
        });
    }

    public  Book updateBook(int id , UpsertBookRequest request){
        Book book = bookRepository.findById(id).orElseThrow(() -> {
            throw new NotFoundException("Not found Book with id = " + id);
        });

        book.setTitle(request.getTitle());
        book.setDescription(request.getDescription());
        book.setPublishyear(request.getPublishyear());

        return book;
    }
}
