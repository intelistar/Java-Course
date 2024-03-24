public class Book {
	private int id;
	private String title;
	private String author;
	private String publisher;
	private int year;
	private int pageCount;
	private double price;
	private String bindingType;


	public Book(int id, String title, String author, String publisher, int year, int pageCount, double price, String bindingType) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.year = year;
		this.pageCount = pageCount;
		this.price = price;
		this.bindingType = bindingType;
	}
	public Book(int id, String title, String author, int year, int pageCount, double price){
		this(id, title, author, "AST", year, pageCount, price, "Hardcover");
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getAuthor() {
		return author;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	public String getBindingType() {
		return bindingType;
	}

	public String toString() {
		return "Book {" +
				"id=" + id +
				", title='" + title + '\'' +
				", author='" + author + '\'' +
				", publisher='" + publisher + '\'' +
				", year=" + year +
				", pageCount=" + pageCount +
				", price=" + price +
				", bindingType='" + bindingType + '\'' +
				'}';
	}
	public boolean equals(Book b){
		if(this.title == b.title && this.author == b.author) return true;
		return false;
	}

}
