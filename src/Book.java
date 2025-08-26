import java.time.LocalDateTime;
import java.util.UUID;

public class Book {

    private final String id;
    private final String title;
    private final Author author;
    private Boolean available;
    private final LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public Book(Author author, String title) {
        this.id = UUID.randomUUID().toString();
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
        this.available = true;
        this.author = author;
        this.title = title;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public Boolean getAvailable() {
        return available;
    }

    private void setAvailable(Boolean available) {
        this.available = available;
        this.updatedAt = LocalDateTime.now();
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public boolean Loan() {
        if (!this.available) {
            return false;
        }

        this.setAvailable(false);
        return true;
    }

    public boolean Return() {
        if (this.available) {
            return false;
        }

        this.setAvailable(true);
        return true;
    }
}
