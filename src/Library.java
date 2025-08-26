import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> books = new ArrayList<>();
    private List<Author> authors = new ArrayList<>();
    private List<Client> clients = new ArrayList<>();
    private List<Loan> loans = new ArrayList<>();

    public void loanBook(String idBook, String idClient) {
        Book book = findBookById(idBook);

        if (book == null) {
            System.out.println("Não existe esse book na biblioteca");
            return;
        }

        Client client = findClientById(idClient);

        if (client == null) {
            System.out.println("O cliente não existe");
            return;
        }

        boolean isBookLoan = book.Loan();

        if (!isBookLoan) {
            System.out.println("O livro não está disponível para empréstimo.");
            return;
        }

        Loan loan = new Loan(book, client);
        registerLoan(loan);
        System.out.println("Empréstimo registrado para o livro " + book.getTitle() + ".");
    }

    public void returnBook(String idBook, String idLoan) {
        Book book = findBookById(idBook);

        if (book == null) {
            System.out.println("Não existe esse book na biblioteca");
            return;
        }

        Loan loan = findLoanById(idLoan);

        if (loan == null) {
            System.out.println("Não existe esse empréstimo na biblioteca");
            return;
        }

        if (loan.getBook().getId().equals(book.getId())) {
            System.out.println("Esse empréstimo não é referente a este livro.");
            return;
        }

        boolean isBookReturn = book.Return();

        if (!isBookReturn) {
            System.out.println("O livro já está disponível para empréstimo.");
            return;
        }

        loan.registerReturn();
        System.out.println("O Livro " + book.getTitle() + " devolvido com sucesso.");

    }

    public Book findBookById(String idBook) {
        for (Book book : this.books) {
            if (book.getId().equals(idBook)) {
                return book;
            }
        }

        return null;
    }

    public Author findAuthorById(String idAuthor) {
        for (Author author : this.authors) {
            if (author.getId().equals(idAuthor)) {
                return author;
            }
        }

        return null;
    }

    public Client findClientById(String idClient) {
        for (Client client : this.clients) {
            if (client.getId().equals(idClient)) {
                return client;
            }
        }

        return null;
    }

    public Loan findLoanById(String idLoan) {
        for (Loan loan : this.loans) {
            if (loan.getId().equals(idLoan)) {
                return loan;
            }
        }

        return null;
    }

    public void registerBook(Book book) {
        Book existBook = findBookById(book.getId());

        if (existBook != null) {
            System.out.println("Esse livro já está registrado na biblioteca.");
            return;
        }

        this.books.add(book);
        System.out.println("O livro " + book.getTitle() + " registrado com sucesso.");
    }

    public void registerAuthor(Author author) {
        Author existAuthor = findAuthorById(author.getId());

        if (existAuthor != null) {
            System.out.println("Esse autor já está registrado na biblioteca.");
            return;
        }

        this.authors.add(author);
        System.out.println("O autor " + author.getName() + " registrado com sucesso.");

    }

    public void registerClient(Client client) {
        Client existClient = findClientById(client.getId());

        if (existClient != null) {
            System.out.println("Esse cliente já está registrado na biblioteca.");
            return;
        }

        this.clients.add(client);
        System.out.println("O cliente " + client.getName() + " registrado com sucesso.");
    }

    public void registerLoan(Loan loan) {
        this.loans.add(loan);
        System.out.println("O empréstimo " + loan.getId() + " registrado com sucesso.");
    }
}
