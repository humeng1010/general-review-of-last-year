package com.red.service.impl;

import com.red.entity.Book;
import com.red.mapper.BookMapper;
import com.red.service.BookService;
import com.red.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookMapper bookMapper;
    @Override
    public Result<List<Book>> getAll() {
        List<Book> books = bookMapper.getAll();
        return Result.ok(books);
    }

    @Override
    public Result<Boolean> save(Book book) {
        bookMapper.save(book);
        return Result.ok(true,"新增成功");
    }

    @Override
    public Result<Boolean> update(Book book) {
        bookMapper.update(book);
        return Result.ok(true,"修改成功");
    }

    @Override
    public Result<Boolean> delete(Integer id) {
        bookMapper.delete(id);
        return Result.ok(true,"删除成功");
    }

    @Override
    public Result<Book> getById(Integer id) {
        Book book = bookMapper.getById(id);
        if (Objects.isNull(book)){
            return Result.fail("no have the book");
        }
        return Result.ok(book);
    }
}
