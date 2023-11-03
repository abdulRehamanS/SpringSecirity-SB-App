package In.Abdul.SpringSecurity.NGSB.controller;

import In.Abdul.SpringSecurity.NGSB.entity.User;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@CrossOrigin(origins = "*")
public class SpringController {

    @GetMapping("/")
    public String login() {
        return "authenticated successfully";
    }

    @GetMapping("/getUsers")
    public List<User> getUsers() {
        return Stream.of(new User(1, "Saad", "Saad@gmail.com", "9087654321"),
                        new User(2, "Kulsum", "Kulsum@gmail.com", "8867101121")).
                collect(Collectors.toList());
    }
}
