package com.red.factory;

import com.red.dao.BookDao;
import com.red.dao.impl.BookDaoImpl;

public class BookDaoFactory {
    public static BookDao getBookDao(){
        return new BookDaoImpl();
    }
}
