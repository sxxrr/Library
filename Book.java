package com.five.vo;
//存放图书信息
public class Book {
	//图书名字
    private String bookName;
    //图书编号
    private String bookNo;
    //图书类型
    private String kind;
    //图书出版社
    private String publisher;
    //出借记录（图书是否被借出）
    private int borrow;

    //getter、setter方法
    public String getBookName() {
        return bookName;
    }
    
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getBorrow() {
        return borrow;
    }

    public void setBorrow(int borrow) {
        this.borrow = borrow;
    }
}
