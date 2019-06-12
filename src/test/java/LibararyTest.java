import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibararyTest {

    Book book1;
    Book book2;
    Library library;

    @Before
    public void before(){
        book1
        = new Book
        ("Get rich quick", "robbin banks", "Self Help" );
        book2
        = new Book
        ("keep the Dr away", "Ann Apple", "Self Help");
        library = new Library(1);
    }

    @Test
    public void canCountBookAmount(){
        assertEquals(0, library.countBooks());
    }

    @Test
    public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.countBooks());
    }

    @Test
    public void cantAddBook(){
        library.addBook(book1);
        library.addBook(book2);
        assertEquals(1, library.countBooks());
    }



}
