package com.red.mapper;

import com.red.entity.Book;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface BookMapper {
    @Select("select * from tbl_book;")
    List<Book> getAll();

    @Insert("insert into tbl_book (type, name, description) values (#{type},#{name},#{description});")
    void save(Book book);
    @Update("update tbl_book set type = #{type}, name = #{name}, description = #{description} where id = #{id} ;")
    void update(Book book);
    @Delete("delete from tbl_book where id = #{id};")
    void delete(Integer id);
    //使用ResultMap定义返回值映射类型
//    @ResultMap("bookResultMap")
    @Select("select * from tbl_book where id = #{id};")
    Book getById(Integer id);
//    @ResultMap("bookResultMap")
}
