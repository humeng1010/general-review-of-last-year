package com.red.service;

import com.red.entity.Book;
import com.red.utils.Result;

import java.util.List;

public interface BookService {
    Result<List<Book>> getAll();

    Result<Boolean> save(Book book);

    Result<Boolean> update(Book book);

    Result<Boolean> delete(Integer id);

    Result<Book> getById(Integer id);
}
