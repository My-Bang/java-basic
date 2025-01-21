package day10;

import day10.dto.BookDTO;
import day10.dto.MovieDTO;

public class BookMain {
    public static void main(String[] args) {

        BookDTO book1 = new BookDTO();
        MovieDTO book2 = new MovieDTO();

//        book1.printBook(book1);
//        book2.printMovie(book2);
        InputBookSc bookSc = new InputBookSc();
        BookDTO book3 = new BookDTO();
        bookSc.inputObject(book3);
        book3.printBook(book3);

//        BookDTO book4 = bookSc.inputObject(book3);
//        book3.printBook(book4);
    }
}
