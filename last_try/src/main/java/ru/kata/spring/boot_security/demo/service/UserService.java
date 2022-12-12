package ru.kata.spring.boot_security.demo.service;
import org.springframework.security.core.userdetails.UserDetailsService;
import ru.kata.spring.boot_security.demo.dto.UserDto;
import ru.kata.spring.boot_security.demo.model.User;
import java.util.List;

public interface UserService extends UserDetailsService {
    User save (UserDto userDto);
    void deleteById(Long id);
    List<User> findAll();
}
