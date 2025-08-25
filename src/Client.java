import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Client {
    private String id;
    private String name;
    private LocalDate dateOfBirth;
    private String email;
    private LocalDateTime createdAt;
    private  LocalDateTime updatedAt;

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getEmail(){
        return email;
    }

    public Client(String name, LocalDate dateOfBirth, String email){
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.email = email;
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }
}
