package com.red.mapper;

import com.red.entity.Book;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface BookMapper {
    @Select("select * from tbl_book where id = #{id};")
    Book getById(Integer id);

    List<Book> getAll();

    void deleteById(@Param("id") Integer id);

    void updateByCondition(Book book);

    @Insert("insert into tbl_book (type, name, description) values (#{type},#{name},#{description});")
    void addBook(Book book);


}
