package domain.services;

import domain.data.Book;
import domain.repository.BookRepository;

import java.util.UUID;

public class BooksServiceImpl implements BooksService{
    private final BookRepository bookRepository;
    public BooksServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public UUID createBook(String name, String author, String description) {
        final Book book = new Book(UUID.randomUUID(), name, author, description);
        bookRepository.save(book);

        return book.getId();
    }

    @Override
    public void deleteBook(UUID id) {
        bookRepository.delete(id);
    }
}
