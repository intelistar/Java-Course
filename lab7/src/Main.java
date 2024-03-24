

public class Main {
	public static void main(String[] args) {
		Book book = new Book(1, "1984", "Ourell", "AST", 1943, 257, 23.5, "sss" );
		System.out.println(book);

		Book[] books = {
				new Book(1, "Book1", "Author1", "Publisher1", 2000, 300, 20.0, "Hardcover"),
				new Book(2, "Book2", "Author2", "Publisher2", 2010, 250, 15.0, "Paperback"),
				new Book(3, "Book3", "Author1", "Publisher3", 2020, 400, 25.0, "Hardcover"),
				new Book(4, "Book4", "Author3", "Publisher1", 2005, 350, 30.0, "Paperback"),
				book
		};

		BookManager manager = new BookManager(books);

		manager.printBooksByAuthor("Author1");
		manager.printBooksByPublisher("Publisher1");
		manager.printBooksPublishedAfterYear(2005);
	}
}


