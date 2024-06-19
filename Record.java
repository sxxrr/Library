package com.five.vo;
//存放借阅记录
public class Record {
	//借阅时间
    private String borrowDate;
    //借阅图书编号
    private String bookNo;
    //借阅图书名字
    private String bookName;
 
    //getter、setter方法
    public String getBorrowDate() {
        return borrowDate;
    }
  
    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
