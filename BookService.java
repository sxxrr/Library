package com.five.service;

import com.five.vo.Book;
import com.five.vo.Record;

import java.util.List;

public interface BookService {
    public List<Book> queryBook();
    public Book borrow(String bookNo);
    public Book reBorrow(String bookNo);
    public List<Record> queryRecord();

}
