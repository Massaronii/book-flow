import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void loanBook(String idBook, String idClient){

    }

    public Book findBookById(String id){
        for(Book book: this.books){
            if(book.getId().equals(id)){
                return book;
            }
        }

        return null;
    }

}
