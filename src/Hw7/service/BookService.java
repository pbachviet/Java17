package Hw7.service;

import Hw7.repository.BookRepository;
import Hw7.model.Book;

import java.time.LocalDateTime;

import static Hw7.database.BookDatabase.books;

public class BookService {
    public BookRepository bookRepository = new BookRepository();

    // Tìm kiếm bài viết theo tiêu đề
    public void findByTitle(String title) {
        int count = 0;
        for (Book book: bookRepository.findAll()) {
            if(book.title.toLowerCase().contains(title.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }

        if(count == 0) {
            System.out.println("Không có quyền sách nào có title  " + title);
        }
    }
    public void findByCategory(String category){
        int count = 0;
        for (Book book: bookRepository.findAll()) {
            if(book.category.toLowerCase().contains(category.toLowerCase())) {
                System.out.println(book);
                count++;
            }
        }

        if(count == 0) {
            System.out.println("Không có quyền sách nào có thể loại là " + category);
        }
    }
    public void listBookThisYear() {
        LocalDateTime lcdt = LocalDateTime.now();
        int year = lcdt.getYear();
        for (int i = 0; i < books.length; i++) {
            if (books[i].year == year){
                System.out.println(books[i].toString());
            }
        }
    }
}
