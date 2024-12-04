package bai1QuanLySach;

import java.util.Date;

public class TextBook extends Book {

    private String status;

    public TextBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, String status) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus() {
        this.status = status;
    }

    @Override
    public void addBook() {
        System.out.println("them sach: ");
    }

    @Override
    public void updateBook(String Id) {
        System.out.println("chinh sua sac bang Id: " + Id);
    }

    @Override
    public void displayBook() {
        System.out.println("hien thi sach giao khoa");
    }

}
