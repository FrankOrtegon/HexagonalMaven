package domain.services;

import domain.repository.BookRepository;

public class BooksServiceFactory {
    public static BooksService getBooksService(BookRepository booksRepository) {
        return new BooksServiceImpl(booksRepository);
    }
}
