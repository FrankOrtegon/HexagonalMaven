package infrastructure;

import application.ConsoleApp;
import domain.services.BooksService;
import domain.services.BooksServiceFactory;

public class ApplicationMain {

    public static void main(String[] args) {
        BooksService bookService = BooksServiceFactory.getBooksService(new BookRepositoryImpl());
        ConsoleApp consoleApp = new ConsoleApp(System.console(), bookService);
        consoleApp.waitForCommand();
    }
}
