package vn.techmaster;

import vn.techmaster.model.Book;
import vn.techmaster.service.BookService;

public class Main {
    public static void main(String[] args) {
        // Khởi tạo đối tượng
        BookService bookService = new BookService();

        // Danh sách book
        System.out.println("*********** Danh sách book ***********");
        for (Book book : bookService.getBooks()) {
            System.out.println(book);
        }

        // Tìm kiếm theo tên
        System.out.println("*********** Tìm kiếm theo tên ***********");
        bookService.findByTitle("abc");
        bookService.findByTitle("khốn khổ");

        // Tìm kiếm theo danh mục
        System.out.println("*********** Tìm kiếm theo danh mục ***********");
        bookService.findByCategory("abc");
        bookService.findByCategory("tiểu thuyết");

        // Tìm kiếm theo năm
        System.out.println("*********** Tìm kiếm theo năm ***********");
        bookService.findByPublishingOfThisYear();
    }
}
