import java.util.ArrayList;

public class Library {

    private Integer capacity;
    private ArrayList<Book> allBooks;

    public Library(Integer capacity){
        this.capacity = capacity;
        this.allBooks = new ArrayList<Book>();
    }

    public int countBooks(){
        return this.allBooks.size();
    }

    public void addBook(Book book) {
        if (this.allBooks.size() < this.capacity) {
            this.allBooks.add(book);
        }
    }

    public Book removeBook(){
       return this.allBooks.remove(0);

    }

}
