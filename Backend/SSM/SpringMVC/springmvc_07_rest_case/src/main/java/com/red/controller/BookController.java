package com.red.controller;

import com.red.controller.exception.SystemException;
import com.red.entity.Book;
import com.red.service.BookService;
import com.red.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;
    @GetMapping
    public Result<List<Book>> getAll(){
        return bookService.getAll();
    }

    @PostMapping
    public Result<Boolean> save(@RequestBody Book book){
        return bookService.save(book);
    }

    @PutMapping
    public Result<Boolean> update(@RequestBody Book book){
        return bookService.update(book);
    }

    @DeleteMapping("/{id}")
    public Result<Boolean> delete(@PathVariable Integer id){
        return bookService.delete(id);
    }

    @GetMapping("/{id}")
    public Result<Book> getById(@PathVariable Integer id){
        if (id==1){
            throw new SystemException(503,"想干嘛呀小伙子");
        }
        return bookService.getById(id);

    }
}
