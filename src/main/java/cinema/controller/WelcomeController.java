package cinema.controller;

import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
    @GetMapping("/")
    public String welcomeMessage(Authentication authentication) {
        return "Welcome " + authentication.getName() + "!";

    }
}
