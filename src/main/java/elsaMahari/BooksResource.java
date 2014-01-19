package elsaMahari;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import elsaMahari.dto.Book;

@Path("books")
public class BooksResource {

	@GET
	@Produces("application/json")
	public List<Book> book() {
		List<Book> bookList = new ArrayList<Book>();
		Book book = new Book("BookTitle", "BookAuthor");
		Book bookA = new Book("BookTitleA", "BookAuthorA");
		bookList.add(book);
		bookList.add(bookA);
		return bookList;
	}

}
