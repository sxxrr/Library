package com.five.dao;

import com.five.vo.Book;
import com.five.vo.Cache;
import com.five.vo.Record;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class BookDaoImpl implements BookDao{
	//查询图书
    public List<Book> queryBook() {
        return Cache.books;
    }
    //借阅图书
    public Book borrow(String bookNo) {
        List<Book> books = Cache.books;
        for (Book book : books) {
            if (bookNo.equals(book.getBookNo())) {
                book.setBorrow(2);
                Record record = new Record();
                record.setBookName(book.getBookName());
                record.setBookNo(book.getBookNo());
                record.setBorrowDate(new SimpleDateFormat("yyyy-MM-dd").format(new Date()));
                Cache.records.add(record);
                return book;
            }
        }
        return null;
    }
    //归还图书
    public Book reBorrow(String bookNo) {
        List<Book> books = Cache.books;
        for (Book book : books) {
            if (bookNo.equals(book.getBookNo())) {
                if(book.getBorrow() == 2) {
                    book.setBorrow(1);
                    System.out.println("归还成功");
                    return book;
                }else {
                    System.out.println("归还失败,该图书没有借出");
                    return book;
                }
            }
        }
        return null;
    }
    //查询借阅记录
    public List<Record> queryRecord() {
        return Cache.records;
    }
}
