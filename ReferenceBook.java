
package bai1QuanLySach;

import java.util.Date;

public abstract  class ReferenceBook extends Book{
    private double tax;
    public ReferenceBook(String bookId, String publisher, Date entryDate, double unitPrice, double quantity, double tax) {
        super(bookId, publisher, entryDate, unitPrice, quantity);
    }
    public double getTax(){
        return tax;
    }
    public void setTax(){
        this.tax=tax;
    }
    @Override
    public void addBook(){
        System.out.println("them sach: ");
    }
    @Override
    public void updateBook(String Id){
        System.out.println("chinh sua sac bang Id: " + Id);
    }
    @Override
    public void displayBook(){
            System.out.println("hien thi sach giao khoa");
    }
    
}
