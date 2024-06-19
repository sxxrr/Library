package com.five.controller;

import com.five.vo.Book;
import com.five.vo.Record;
import com.five.service.BookService;
import com.five.service.BookServiceImpl;

import java.util.List;
import java.util.Scanner;

public class BookReaderController {

	//登录流程
    private static final String account = "admin,123456";
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

    	System.out.println("欢迎使用图书管理系统！");
        System.out.println("请输入用户名和密码(用户名,密码)");
        while (true) {
            String next = sc.next();
            if (account.equals(next)) {
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("账户或密码错误，请重新输入");
            }
        }
        //菜单
        System.out.println("======图书管理系统======");
        System.out.println("1. 查询图书");
        System.out.println("2. 借阅图书");
        System.out.println("3. 归还图书");
        System.out.println("4. 查询借阅记录");
        System.out.println("5. 退出系统");
        System.out.println("请输入编号(1-5)");
        //功能选择
        while (true) {
            int i = sc.nextInt();
            switch (i){
                case 1:
                    queryBook();
                    break;
                case 2:
                    borrow();
                    break;
                case 3:
                    reBorrow();
                    break;
                case 4:
                    queryRecord();
                    break;
                case 5:
                    System.out.println("退出系统成功");
                    System.exit(1);
                    break;
            }
        }

    }
    //查询图书
    private static void queryRecord() {
        BookService bookService = new BookServiceImpl();
        List<Record> records = bookService.queryRecord();
        System.out.println("借阅日期     书籍序列号    书籍名称");
        for (Record record : records) {
            System.out.println(record.getBorrowDate() + "   " + record.getBookNo() + "   " + record.getBookName());
        }
    }
    //借阅图书
    private static void reBorrow() {
        System.out.println("请输入要归还的图书编号");
        String bookNo = sc.next();
        BookService bookService = new BookServiceImpl();
        Book book = bookService.reBorrow(bookNo);
        if (book == null) {
            System.out.println("该编号不存在，请重新选择功能");
        }
    }
    //归还图书
    private static void borrow() {
        System.out.println("请输入要借阅的图书编号");
        String bookNo = sc.next();
        BookService bookService = new BookServiceImpl();
        Book borrow = bookService.borrow(bookNo);
        if (borrow == null) {
            System.out.println("借阅失败,图书编号不存在，请重新选择功能");
        } else {
            System.out.println("图书借阅成功");
        }

    }
    //查询借阅记录
    private static void queryBook() {
        BookService bookService = new BookServiceImpl();
        List<Book> books = bookService.queryBook();
        System.out.println("图书序列号    图书名称    书籍种类    出版社");
        for (Book book : books) {
            System.out.println("  " + book.getBookNo() + "      " + book.getBookName() + "      " + book.getKind() + "     " + book.getPublisher() );
        }
    }

}
