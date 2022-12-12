package ru.kata.spring.boot_security.demo.web;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ru.kata.spring.boot_security.demo.dto.UserDto;
import ru.kata.spring.boot_security.demo.service.UserService;

@Controller
@RequestMapping("/registration")
public class PeopleController {

    private UserService userService;

    public PeopleController(UserService userService) {
        super();
        this.userService = userService;
    }

    @ModelAttribute("user")
    public UserDto userDto(){
        return new UserDto();
    }

    @GetMapping
    public String registrationForm() {
        return "registration";
    }

    @PostMapping
    public String registrationUser(@ModelAttribute("user") UserDto userDto) {
        userService.save(userDto);
        return "redirect:/registration?success";
    }
}
