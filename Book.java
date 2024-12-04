
package bai1QuanLySach;

import java.util.Date;

public abstract class Book {
    private String bookId;
    private String publisher;
    private Date entryDate;
    private double unitPrice;
    private double quantity;
    
    public Book(String bookId, String publisher, Date entryDate, double unitPrice, double quantity){
        this.bookId=bookId;
        this.publisher=publisher;
        this.entryDate=entryDate;
        this.unitPrice=unitPrice;
        this.quantity=quantity;
    }
    public String getBookId(){
        return bookId;
    }
    public void setBookId(){
        this.bookId=bookId;
    }
    
    public String getpublisher(){
        return publisher;
    }
    public void setpublisher(){
        this.publisher=publisher;
    }
    
    public Date getentryDate(){
        return entryDate;
    }
    public void setentryDate(){
        this.entryDate=entryDate;
    }
    
    public double getunitPrice(){
        return unitPrice;
    }
    public void setunitPrice(){
        this.unitPrice=unitPrice;
    }
    public double getquantity(){
        return quantity;
    }
    public void setquantity(){
        this.quantity=quantity;
    }
    public abstract void addBook();
    public abstract void updateBook(String Id);
    public abstract void displayBook();
        
    }

