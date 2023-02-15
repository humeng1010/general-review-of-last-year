package com.red;

import com.red.entity.Book;
import com.red.mapper.BookMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
class Springboot05MybatisApplicationTests {

    @Autowired
    private BookMapper bookMapper;

    @Test
    void testGetBookById() {
        Book book = bookMapper.getById(8);
        System.out.println(book);
    }

    @Test
    void  testGetAll(){
        List<Book> bookList = bookMapper.getAll();
        System.out.println(bookList);
    }

    @Test
    void testDeleteById(){
        bookMapper.deleteById(9);
    }

    @Test
    void testUpdateByCondition(){
        Book book = new Book();
        book.setId(73);
        book.setName("三体");
//        book.setDescription("科幻,诺贝尔");
//        book.setType("科幻");
        bookMapper.updateByCondition(book);
    }

    @Test
    void testInsertBook(){
        Book book = new Book();
        book.setType("test");
        book.setName("test");
        book.setDescription("test");
        bookMapper.addBook(book);
    }

}
