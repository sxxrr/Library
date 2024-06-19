package com.five.vo;

import java.util.ArrayList;
import java.util.List;
//存放具体数据
public class Cache {
    public static List<Book> books = new ArrayList<>();
    public static List<Record> records = new ArrayList<>();
  
    static{
        Book book1 = new Book();
        book1.setBookName("高等数学");
        book1.setBookNo("00001");
        book1.setKind("自然科学");
        book1.setPublisher("同济大学出版社");
        book1.setBorrow(1);
        books.add(book1);
        
        Book book2 = new Book();
        book2.setBookName("乐理基础");
        book2.setBookNo("00002");
        book2.setKind("艺术");
        book2.setPublisher("北京电影学院出版社");
        book2.setBorrow(1);
        books.add(book2);
        
        Book book3 = new Book();
        book3.setBookName("散打秘籍");
        book3.setBookNo("00003");
        book3.setKind("修身");
        book3.setPublisher("少林寺出版社");
        book3.setBorrow(1);
        books.add(book3);
    }
}
