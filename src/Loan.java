import java.time.LocalDateTime;
import java.util.UUID;

public class Loan {

    private final String id;
    private final Book book;
    private final Client client;
    private final LocalDateTime loanDate;
    private LocalDateTime returnDate;

    public LocalDateTime getReturnDate() {
        return returnDate;
    }

    public LocalDateTime getLoanDate() {
        return loanDate;
    }

    public Book getBook() {
        return book;
    }

    public Client getClient() {
        return client;
    }

    public String getId() {
        return id;
    }

    public Loan(Book book, Client client) {
        this.id = UUID.randomUUID().toString();
        this.book = book;
        this.client = client;
        this.loanDate = LocalDateTime.now();
    }

    public void registerReturn() {
        this.returnDate = LocalDateTime.now();
    }
}
