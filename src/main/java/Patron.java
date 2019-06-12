import java.util.ArrayList;

public class Patron {
    private ArrayList<Book> borrowedBooks;


    public Patron(){
        this.borrowedBooks = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.borrowedBooks.size();
    }

    public void borrowBookFromLibrary(Library library){
        Book book = library.removeBook();
        this.borrowedBooks.add(book);

    }
}
