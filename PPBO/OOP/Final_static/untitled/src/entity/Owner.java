package entity;
import java.util.Date;
public class Owner {
    private String name;
    private Date dateOfBirth;
    public Owner(String name, Date dateOfBirth) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }
    public String getName() {
        return name;
    }
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
}