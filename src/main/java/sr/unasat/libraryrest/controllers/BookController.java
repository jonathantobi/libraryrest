package sr.unasat.libraryrest.controllers;

import sr.unasat.libraryrest.entities.Book;
import sr.unasat.libraryrest.services.BookService;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("books")
public class BookController {

    private BookService bookService = new BookService();

    @Path("/all")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Book> findAll() {
        return bookService.findAll();
    }

    @Path("/book/{isbn}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Book findOne(@PathParam("isbn") String isbn) {
        return bookService.findOne(isbn);
    }

    @Path("/book")
    @POST
    @Produces(MediaType.APPLICATION_JSON)
    public Book add(Book book) {
        return bookService.add(book);
    }

    @Path("/book")
    @PUT
    @Produces(MediaType.APPLICATION_JSON)
    public Book update(Book book) {
        return bookService.add(book);
    }

    @Path("/book")
    @DELETE
    @Produces(MediaType.APPLICATION_JSON)
    public Book delete(Book book) {
        return bookService.add(book);
    }
}
