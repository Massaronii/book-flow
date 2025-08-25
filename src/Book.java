import java.time.LocalDateTime;
import java.util.UUID;

public class Book {

    private final String id;
    private final String title;
    private final String author;
    private Boolean available;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Book(String author, String title){
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.available = true;
        this.author = author;
        this.title = title;
    }

    public String getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return author;
    }

    public Boolean getAvailable(){
        return available;
    }

    private void setAvailable(Boolean available) {
        this.available = available;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt(){
        return createdAt;
    }

    public LocalDateTime getUpdatedAt(){
        return updatedAt;
    }

    public void Loan(){
        if(!this.available){
            System.out.println("O livro '" + this.title + "' não está disponível para empréstimo.");
            return;
        }

        this.setAvailable(false);
        System.out.println("O livro '" + this.title + "' foi emprestado com sucesso.");
    }

    public void Return(){
        if(this.available){
            System.out.println("O livro '" + this.title + "' já está disponível para empréstimo.");
            return;
        }

        this.setAvailable(true);
        System.out.println("O livro '" + this.title + "' foi devolvido com sucesso.");
    }
}
