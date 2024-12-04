package bai1QuanLySach;

import java.util.ArrayList;

public class BookList {

    private ArrayList<Book> bookList = new ArrayList<>();

    public void addBook(Book book) {
        bookList.add(book);
        System.out.println("da them sach than cong");
    }

    public void updateBook(String Id) {
        for (Book book : bookList) {
            if (book.getBookId().equals(Id)) {
                book.updateBook(Id);
                return;            
            }
        }
        System.out.println("sach mang " + Id + " khong ton tai.!");
    }
    
    public void deleteBookById(String Id){
        bookList.removeIf(book -> book.getBookId().equals(Id));
    }
    public Book findBookById(String Id){
        for(Book book : bookList ){
            if(book.getBookId().equals(Id)){
                return book;
            }
        }
        
        return null;
    }
    
    public void displayAllBook(){
            for(Book book : bookList){
                book.displayBook();
            }
    }
    

}
