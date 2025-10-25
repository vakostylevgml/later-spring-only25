package vkostylev.edu.spring.laterspringonly.user;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Value("${test.value}")
    private String testValue;

    @GetMapping
    public List<User> getAllUsers() {
        log.error(this.testValue);
        return userService.getAllUsers();
    }

    @PostMapping
    public User saveNewUser(@RequestBody User user) {
        return userService.saveUser(user);
    }
} 