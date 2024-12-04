package bai1QuanLySach;

import java.util.Date;
import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        BookList bookList = new BookList();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. them sach");
            System.out.println("2. cap nhat sach bang Id");
            System.out.println("3. xoa sach bang Id");
            System.out.println("4. tim sach bang Id");
            System.out.println("5.  hien thi tat cac sach");
            System.out.println("6. exit");
            System.out.println(" hay nhap su lua chon cua ban ( 1 - 6 )");
            int chon = scanner.nextInt();
            scanner.nextLine();

            switch (chon) {
                case 1:
                    System.out.println(" nhap Id cua sach");
                    String bookId = scanner.nextLine();
                    System.out.println(" nhap nha xuat ban cua sach");
                    String publisher = scanner.nextLine();
                    System.out.println(" nhap gia ban cua sach");
                    double unitPrice = scanner.nextDouble();
                    System.out.println(" nhap so luong sach");
                    double quantity = scanner.nextDouble();
                    scanner.nextLine();
                    System.out.println(" nhap trang thai cua sach");
                    String status = scanner.nextLine();

                    TextBook textBook = new TextBook(bookId, publisher, new Date(), unitPrice, quantity, status);
                    bookList.addBook(textBook);
                    break;
                case 2:
                    System.out.println(" nhap id sach can cap nhat");
                    String updateId = scanner.nextLine();
                    bookList.updateBook(updateId);
                    break;
                case 3:
                    System.out.println(" nhap Id cua sach can xoa");
                    String deleteId = scanner.nextLine();
                    bookList.deleteBookById(deleteId);
                    break;
                case 4:
                    System.out.println(" nhap Id sach can tim");
                    String findId = scanner.nextLine();
                    Book timsach = bookList.findBookById(findId);
                    if (timsach != null) {
                        timsach.displayBook();
                    } else {
                        System.out.println(" khong tim thay sach");
                    }
                    break;
                case 5:
                    bookList.displayAllBook();
                    break;
                case 6:
                    System.out.println(" thoat");
                    scanner.close();
                    return;
                default:
                    System.out.println(" vui long chon lai ( 1 - 6 )");

            }

        }

    }

}
