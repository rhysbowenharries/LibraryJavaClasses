import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PatronTest {

    Book book1;
    Book book2;
    Library library;
    Patron patron;

    @Before
    public void before(){
        book1
        = new Book
        ("Get rich quick", "robbin banks", "Self Help" );
        book2
        = new Book
        ("keep the Dr away", "Ann Apple", "Self Help");
        library = new Library(2);
        
        patron = new Patron();
    }
    
    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book1);
        library.addBook(book2);
        patron.borrowBookFromLibrary(library);
        assertEquals(1, library.countBooks());
        assertEquals(1, patron.countBooks());
    }
}
