package srp.art.gallery.model;

import lombok.Data;

import java.util.UUID;

@Data
public class User {

    UUID id;
    String firstName;
    String lastName;
    String emailId;
    String createdDate;

}
