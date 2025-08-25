import java.time.LocalDateTime;
import java.util.UUID;

    public class Loan {

        private String id;
        private Book book;
        private Client client;
        private LocalDateTime loanDate;
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

    private Loan(Book book, Client client){
        this.id = UUID.randomUUID().toString();
        this.book = book;
        this.client = client;
        this.loanDate = LocalDateTime.now();
    }

    private void Return(Book book, Client client){
        this.book = book;
        this.client = client;
        this.returnDate = LocalDateTime.now();
    }
}
