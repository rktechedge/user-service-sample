package com.example.userservice.user;
import com.example.userservice.dto.UserDTO;
import com.example.userservice.exception.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private static final Logger log =
            LoggerFactory.getLogger(UserService.class);
    private final UserRepository repository;

    public UserService(UserRepository repository) {
        this.repository = repository;
    }

    public UserDTO getActiveUser(Long id) {
        log.debug("Fetching active user with id={}", id);
        User user = repository.findById(id)
                .filter(User::isActive)
                .orElseThrow(() ->
                        new ApiException("Active user not found"));
        return new UserDTO(user.getId(), user.getEmail());
    }

    public UserDTO createUser(User user) {
        repository.save(user);
        return new UserDTO(user.getId(), user.getEmail());
    }

}
