package elsaMahari.dto;

public class Book {

	private String author;
	private String title;
	private String year;
	private String language;
	private String bookpicture;
	private String readingyear;

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getBookpicture() {
		return bookpicture;
	}

	public void setBookpicture(String bookpicture) {
		this.bookpicture = bookpicture;
	}

	public String getReadingyear() {
		return readingyear;
	}

	public void setReadingyear(String readingyear) {
		this.readingyear = readingyear;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Book(String title, String author) {
		super();
		this.title = title;
		this.author = author;
	}

	public Book() {
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

}
