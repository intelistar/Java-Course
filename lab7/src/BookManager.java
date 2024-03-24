public class BookManager {
	private Book[] books;

	public BookManager(Book[] books) {
		this.books = books;
	}

	// вывод списка книг заданного автора
	public void printBooksByAuthor(String author) {
		System.out.println("Список книг автора " + author + ":");
		for (Book book : books) {
			if (book.getAuthor().equals(author)) {
				System.out.println(book);
			}
		}
	}

	// вывод списка книг заданного издательства
	public void printBooksByPublisher(String publisher) {
		System.out.println("Список книг издательства " + publisher + ":");
		for (Book book : books) {
			if (book.getPublisher().equals(publisher)) {
				System.out.println(book);
			}
		}
	}

	// вывод списка книг выпущенных после заданного года
	public void printBooksPublishedAfterYear(int year) {
		System.out.println("Список книг, выпущенных после " + year + " года:");
		for (Book book : books) {
			if (book.getYear() > year) {
				System.out.println(book);
			}
		}

	}
}