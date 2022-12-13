package Hw7.repository;

import Hw7.database.BookDatabase;
import Hw7.model.Book;

public class BookRepository {
    public Book[] findAll() {
        return BookDatabase.books;
    }
}
