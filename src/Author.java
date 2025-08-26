import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Author {

    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Author(String name, LocalDate dateOfBirth) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
