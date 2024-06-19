package com.five.service;

import com.five.dao.BookDao;
import com.five.dao.BookDaoImpl;
import com.five.vo.Book;
import com.five.vo.Record;
import com.five.dao.BookDaoImpl;

import java.util.List;

public class BookServiceImpl implements BookService{

	//查询图书
    public List<Book> queryBook() {
        BookDao bookDao = new BookDaoImpl();
        return bookDao.queryBook();
    }
    //借阅图书
    public Book borrow(String bookNo) {
        BookDao bookDao = new BookDaoImpl();
        return bookDao.borrow(bookNo);
    }
    //归还图书
    public Book reBorrow(String bookNo) {
        BookDao bookDao = new BookDaoImpl();
        return bookDao.reBorrow(bookNo);
    }
    //查询借阅记录
    public List<Record> queryRecord() {
        BookDao bookDao = new BookDaoImpl();
        return bookDao.queryRecord();
    }
}
