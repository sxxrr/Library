package com.five.dao;

import com.five.vo.Book;
import com.five.vo.Record;

import java.util.List;

public interface BookDao {
	//查询图书
    public List<Book> queryBook();
    //借阅图书
    public Book borrow(String bookNo);
    //归还图书
    public Book reBorrow(String bookNo);
    //查询借阅记录
    public List<Record> queryRecord();
}
