package com.example.userservice.user;

public class User {
    private final Long id;
    private final String email;
    private final boolean active;

    public User(Long id, String email, boolean active) {
        this.id = id;
        this.email = email;
        this.active = active;
    }

    public Long getId() { return id; }
    public String getEmail() { return email; }
    public boolean isActive() { return active; }
}
