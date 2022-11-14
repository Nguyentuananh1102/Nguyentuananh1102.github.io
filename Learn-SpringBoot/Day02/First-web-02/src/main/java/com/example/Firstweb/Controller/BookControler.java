package com.example.Firstweb.Controller;

import com.example.Firstweb.Exception.NotFoundException;
import com.example.Firstweb.Model.Book;
import com.example.Firstweb.Service.BookService;
import com.example.Firstweb.repository.BookRepository;
import com.example.Firstweb.request.UpsertBookRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1")
public class BookControler {
    @Autowired // enject brean
    private BookService bookService;

    // Get:  api/v1/books : lấy danh sách tất cả book
    @GetMapping("books")
    public List<Book> getBooks() {

        return bookService.getBooks();
    }

    // Get : api/v1/books/{id} lấy chi tiết 1 cuốn sách
    @GetMapping("books/{id}")
    public Book getBookById(@PathVariable int id){
        return bookService.getBookById(id);
    }

    // Post : api/v1/books : tạp mới book -> đối tượng sau khi tạo

//    @PostMapping("/api/v1/books")
//    public Book createBook(@RequestBody UpsertBookRequest request) {
//
//        return bookService.createBook(request);
//    }
//
//
//    // Put : api/v1/books/{id} cập nhật thông tin cuốn sách
//    @PutMapping("books/{id}")
//    public Book updateBook(){
//        return null;
//    }
//
//    // Delelte : api/v1/books{/id} xóa cuốn sách theo id

}
