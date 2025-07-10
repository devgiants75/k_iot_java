package org.example.chapter09_practice.model;

import org.example.chapter09_practice.util.DateUtil;

public class User {
    private int id;
    private String name;
    private String email;
    private String createdAt;
    private String updatedAt;

    public User(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.createdAt = DateUtil.now();
        this.updatedAt = DateUtil.now();
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getCreatedAt() { return createdAt; }
    public String getUpdatedAt() { return updatedAt; }

    public void setEmail(String email) {
        this.email = email;
        this.updatedAt = DateUtil.now();
    }

    @Override
    public String toString() {
        return "Id: " + id
                + ", Name: " + name
                + ", Email: " + email
                + ", CreatedAt: " + createdAt
                + ", UpdatedAt: " + updatedAt;
    }
}
