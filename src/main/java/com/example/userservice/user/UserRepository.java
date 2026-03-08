package com.example.userservice.user;

import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class UserRepository {

    private final List<User> users = new java.util.ArrayList<>(List.of(
            new User(1L, "a@test.com", true),
            new User(2L, "b@test.com", false),
            new User(3L, "c@test.com", true)
            )
    );

    public Optional<User> findById(Long id) {
        return users.stream()
                .filter(u -> u.getId().equals(id))
                .findFirst();
    }

    public User save(User user) {
        users.add(user);
        return user;
    }
}
