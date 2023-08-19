package srp.art.gallery.resource;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import srp.art.gallery.model.User;
import srp.art.gallery.repository.UserRepository;

@RestController
@Slf4j
public class UserResource {

    @Autowired
    private UserRepository userRepository;

    @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?> createUser(@RequestBody User user){
        try{
            log.info("Received a request to create the user for id {}", user.getId());
            userRepository.insert(user);
            log.info("User {} created successfully ", user.getId());
            return ResponseEntity.status(HttpStatus.CREATED).body(user.getId());
        }catch (Exception e){
            log.error("An exception occurred while creating the user {}, exception is ", user.getId(), e);
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Exception while creating user");
        }
    }

}
